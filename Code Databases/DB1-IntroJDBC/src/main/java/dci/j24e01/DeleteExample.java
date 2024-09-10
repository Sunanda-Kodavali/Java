package dci.j24e01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteExample {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world",
                "root",
                "12345678"
        );

        long deleteId = 4082;
        String someChar = "%z%";

        PreparedStatement preparedStatement = connection.prepareStatement(
                "DELETE FROM city WHERE name LIKE ?"
        );
        preparedStatement.setString(1, someChar);

        int affectedRows = preparedStatement.executeUpdate();

        System.out.println(affectedRows);

        // 1 -
        // At your leisure:
        // Explore CRUD operations via JDBC
        // Insert, Select, Update, Delete

        // 1.1 - Pick at least 2 exercises from the SQL task last week and implement them in Java

        // 1.2 - Insert new People into the `people` Table
        //          add a few NULLs to the mix :D

    }
}