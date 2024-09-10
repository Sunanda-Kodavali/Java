package dci.j24e01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world",
                "root",
                "12345678"
        );

        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO city (id, Name, CountryCode, District, Population)" +
                        " VALUES (NULL, ?, ?, ?, ?)"
        );
        preparedStatement.setString(1, "City of Helder");
        preparedStatement.setString(2, "PRT");
        preparedStatement.setString(3, "Helder's district");
        preparedStatement.setLong(4, 1);

        int affectedRows = preparedStatement.executeUpdate();
        System.out.println(affectedRows);
        if (affectedRows > 0) {
            System.out.println("Inserted successfully");
        } else {
            System.out.println("Something went wrong!");
        }
    }

}