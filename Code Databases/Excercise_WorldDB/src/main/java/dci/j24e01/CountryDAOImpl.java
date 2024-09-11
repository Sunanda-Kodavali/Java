package dci.j24e01;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryDAOImpl implements CountryDAO {

    private Connection connection;

    public CountryDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Country findCountry(String countryCode) {
        String sql = """
                SELECT *
                FROM country
                WHERE code = ?
                """;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, countryCode);
            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            return new Country(
                    resultSet.getString("code"),
                    resultSet.getString("name"),
                    Continent.valueOf(resultSet.getString("continent")),
                    resultSet.getString("region"),
                    resultSet.getDouble("surfaceArea"),
                    resultSet.getInt("indepYear"),
                    resultSet.getInt("Population"),
                    resultSet.getDouble("lifeExpectancy"),
                    resultSet.getDouble("gnp"),
                    resultSet.getDouble("gnpOld"),
                    resultSet.getString("localName"),
                    resultSet.getString("governmentForm"),
                    resultSet.getString("headOfState"),
                    resultSet.getInt("capital"),
                    resultSet.getString("code2"));


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Country> findAllCountries() {
        String sql = "SELECT * FROM country";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            List<Country> countries = new ArrayList<>();

            while (resultSet.next()) {
                Country country = new Country(
                        resultSet.getString("code"),
                        resultSet.getString("name"),
                        Continent.valueOf((resultSet.getString("continent"))),
                        resultSet.getString("region"),
                        resultSet.getDouble("surfaceArea"),
                        resultSet.getInt("indepYear"),
                        resultSet.getInt("Population"),
                        resultSet.getDouble("lifeExpectancy"),
                        resultSet.getDouble("gnp"),
                        resultSet.getDouble("gnpOld"),
                        resultSet.getString("localName"),
                        resultSet.getString("governmentForm"),
                        resultSet.getString("headOfState"),
                        resultSet.getInt("capital"),
                        resultSet.getString("code2"));
                countries.add(country);
            }
            return countries;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Country updateCountry(String countryCode) {
        return null;
    }

    @Override
    public Country insertCountry(Country country) {
        String sql = """
                INSERT INTO country
                (code, name, continent, region, surfaceArea, population, localName, governmentForm, code2)
                VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, country.code());
            preparedStatement.setString(2, country.name());
            preparedStatement.setString(3, String.valueOf(country.continent()));
            preparedStatement.setString(4, country.region());
            preparedStatement.setDouble(5, country.surfaceArea());
            preparedStatement.setInt(6, country.population());
            preparedStatement.setString(7, country.localName());
            preparedStatement.setString(8, country.governmentForm());
            preparedStatement.setString(9, country.code2());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {

                return country;

            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean deleteCountry(String countryCode) {
        String sql = """
                DELETE FROM country
                WHERE code = ?
                """;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, countryCode);
            int affected = preparedStatement.executeUpdate();
            return affected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
