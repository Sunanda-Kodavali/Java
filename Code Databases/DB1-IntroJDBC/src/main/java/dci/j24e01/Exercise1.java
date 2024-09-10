package dci.j24e01;

import java.sql.*;
import java.util.Scanner;

public class Exercise1 {

    // Exercise:
    // Ask the user for a letter
    // print only the cities that contain that letter in their name

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world",
                "root",
                "12345678"
        );

        Scanner input = new Scanner(System.in);
        System.out.println("Give me a letter:");
        String letter = input.nextLine();

//        Statement statement = connection.createStatement();
//        // Concatenation can leave the Query open to SQL Injection
//        // We need to use preparedStatement Instead
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM city WHERE Name LIKE '%" + letter + "%'");


//        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM city WHERE id = ?");
//        preparedStatement.setLong(1, 100);

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM city WHERE Name LIKE ?");
        preparedStatement.setString(1, "%" + letter + "%");

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getString("Name"));
        }

    }
}