package dci.j24e01;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityDAOImpl implements CityDAO{

    private Connection connection;

    public CityDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public City findCity(Integer id) {
        String sql = """
                SELECT *
                FROM city
                WHERE id = ?
                """;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            return new City(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("countryCode"),
                    resultSet.getString("district"),
                    resultSet.getInt("population")
            );
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public List<City> findAllCities() {
        String sql = "SELECT * FROM city";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            List<City> cities = new ArrayList<>();

            while (resultSet.next()) {
                City city = new City(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("countryCode"),
                        resultSet.getString("district"),
                        resultSet.getInt("population")
                );
                cities.add(city);
            }
            return cities;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public City updateCity(City city) {
        String sql = """
                UPDATE city
                SET name = ?, countryCode = ?, district = ?, population = ?
                WHERE id = ?
                """;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, city.name());
            preparedStatement.setString(2, city.countryCode());
            preparedStatement.setString(3, city.district());
            preparedStatement.setInt(4, city.population());
            preparedStatement.setInt(5, city.id());

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                return city;
            } else {
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public City insertCity(City city) {
        String sql =  """
                INSERT INTO city
                (id, name, countryCode, district, population)
                VALUES(NULL, ?, ?, ?, ?)
                """;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, city.name());
            preparedStatement.setString(2, city.countryCode());
            preparedStatement.setString(3, city.district());
            preparedStatement.setInt(4, city.population());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                ResultSet keysResultSet = preparedStatement.getGeneratedKeys();
                keysResultSet.next();

                Integer insertId = Math.toIntExact(keysResultSet.getLong(1));

//                return findPerson(insertId);

                return new City(
                        insertId,
                        city.name(),
                        city.countryCode(),
                        city.district(),
                        city.population()
                );

            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean deleteCity(Integer id) {
        String sql = """
                DELETE FROM city
                WHERE id = ?
                """;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int affected = preparedStatement.executeUpdate();
            return affected > 0;
        } catch (SQLException e) {
            return false;
        }
    }
}
