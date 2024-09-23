package org.example;
import java.sql.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        String INSERT_QUERY = "INSERT INTO random_entries (number, color) VALUES (?, ?)";
        String[] colors = {"yellow", "red", "blue", "green"};

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/random_data_db",
                    "root",
                    "sunanda123"
            );

            connection.setAutoCommit(false);

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);

            for (int i = 0; i < 100000; i++) {

                int randomNumber = random.nextInt(1000) + 1;

                String randomColor = colors[random.nextInt(colors.length)];

                preparedStatement.setInt(1, randomNumber);
                preparedStatement.setString(2, randomColor);
                preparedStatement.addBatch();

                if (i % 1000 == 0 && i > 0) {
                    preparedStatement.executeBatch();
                    connection.commit();
                }
            }

            preparedStatement.executeBatch();
            connection.commit();

            System.out.println("100,000 random entries inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}