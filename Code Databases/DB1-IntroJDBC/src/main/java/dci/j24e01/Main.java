package dci.j24e01;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world",
                "root",
                "12345678"
        );

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(
//                "SELECT id, name AS city, population FROM city LIMIT 10"
                "SELECT id, Name, LOWER(CountryCode) AS CountryCode, District, Population FROM city ORDER BY id DESC LIMIT 5"
        );

        List<City> cityList = new ArrayList<>();
        while (resultSet.next()) {
            City  city = new City(
                    resultSet.getLong("id"),
                    resultSet.getString("Name"),
                    resultSet.getString("CountryCode"),
                    resultSet.getString("District"),
                    resultSet.getLong("Population")
            );
            cityList.add(city);
        }

        System.out.println(cityList);
    }

}