package dci.j24e01;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryLanguageDAOImpl implements CountryLanguageDAO {

    private Connection connection;

    public CountryLanguageDAOImpl(Connection connection) {
        this.connection = connection;
    }


    @Override
    public CountryLanguage findCountryLanguage(CountryLanguage countryLanguage) {
        String sql = """
                SELECT *
                FROM countrylanguage
                WHERE countryCode = ? AND Language = ?
                """;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, countryLanguage.countryCode());
            preparedStatement.setString(2, countryLanguage.language());
            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            return new CountryLanguage(
                    resultSet.getString("countryCode"),
                    resultSet.getString("Language"),
                    IsOfficial.valueOf(resultSet.getString("IsOfficial")),
                    resultSet.getDouble("percentage"));


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<CountryLanguage> findAllCountriesLanguages() {
        String sql = """
                SELECT *
                FROM countrylanguage
                """;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<CountryLanguage> countryLanguages = new ArrayList<>();
            while (resultSet.next()) {
                CountryLanguage countryLanguage = new CountryLanguage(
                        resultSet.getString("countryCode"),
                        resultSet.getString("Language"),
                        IsOfficial.valueOf(resultSet.getString("IsOfficial")),
                        resultSet.getDouble("percentage"));
                countryLanguages.add(countryLanguage);
            }

            return countryLanguages;


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public CountryLanguage updateCountryLanguage(CountryLanguage countryLanguage) {
        String sql = """
                UPDATE countrylanguage
                SET IsOfficial = ?, percentage = ?
                WHERE countryCode = ? AND Language = ?
                """;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, IsOfficial.F.toString());
            preparedStatement.setDouble(2, countryLanguage.percentage());
            preparedStatement.setString(3, countryLanguage.countryCode());
            preparedStatement.setString(4, countryLanguage.language());

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                return countryLanguage;
            } else {
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public CountryLanguage insertCountryLanguage(CountryLanguage countryLanguage) {
        String sql =  """
                INSERT INTO countrylanguage
                (countryCode, Language, IsOfficial, percentage)
                VALUES( ?, ?, ?, ?)
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, countryLanguage.countryCode());
            preparedStatement.setString(2, countryLanguage.language());
            preparedStatement.setString(3, String.valueOf(countryLanguage.isOfficial()));
            preparedStatement.setDouble(4, countryLanguage.percentage());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                return countryLanguage;

            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean deleteCountryLanguage(CountryLanguage countryLanguage) {
        String sql = """
                DELETE FROM countrylanguage
                WHERE countryCode = ? AND Language = ?
                """;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, countryLanguage.countryCode());
            preparedStatement.setString(2, countryLanguage.language());
            int affected = preparedStatement.executeUpdate();
            return affected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
