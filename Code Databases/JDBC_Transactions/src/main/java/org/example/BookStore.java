package org.example;
import java.sql.*;
public class BookStore {
    public static void buyBook(String title, int quantity) {



        Connection conn = null;
        PreparedStatement insertSaleStmt = null;
        PreparedStatement updateStockStmt = null;

        try {



            conn = DBUtils.getConnection();
            conn.setAutoCommit(false);

            String insertSaleSql = "INSERT INTO sales (book_id, quantity) VALUES ((SELECT book_id FROM books WHERE title = ?), ?)";


            insertSaleStmt = conn.prepareStatement(insertSaleSql);
            insertSaleStmt.setString(1, title);
            insertSaleStmt.setInt(2, quantity);
            insertSaleStmt.executeUpdate();

            String updateStockSql = "UPDATE books SET stock = stock - ? WHERE title = ? AND stock >= ?";

            updateStockStmt = conn.prepareStatement(updateStockSql);
            updateStockStmt.setInt(1, quantity);
            updateStockStmt.setString(2, title);
            updateStockStmt.setInt(3, quantity);
            int rowsUpdated = updateStockStmt.executeUpdate();


            if (rowsUpdated == 0) {
                throw new SQLException("Not enough stock to complete the purchase.");
            }


            conn.commit();
            System.out.println("Book purchased successfully!");

        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();

        } finally {

            try {
                if (insertSaleStmt != null) insertSaleStmt.close();
                if (updateStockStmt != null) updateStockStmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        buyBook("Java Programming", 3);
    }
}
