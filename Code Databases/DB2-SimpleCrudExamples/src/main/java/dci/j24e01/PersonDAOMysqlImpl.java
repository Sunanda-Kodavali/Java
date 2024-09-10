package dci.j24e01;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.Types.NULL;

public class PersonDAOMysqlImpl implements PersonDAO {

    private Connection connection;

    public PersonDAOMysqlImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Person findPerson(Long id) {
        String sql = """
                SELECT *
                FROM people
                WHERE id = ?
                """;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.first()) {

                return new Person(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("city"),
                        resultSet.getInt("age")
                );
            }
        } catch (SQLException e) {
            return null;
        }
        return null;
    }

    @Override
    public List<Person> findPeople() {
        String sql = """
                SELECT *
                FROM people LIMIT 10
                """;
        List<Person> people = new ArrayList<>();
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

           while(resultSet.next()) {

               Person person = new Person(
                       resultSet.getLong("id"),
                       resultSet.getString("name"),
                       resultSet.getString("city"),
                       resultSet.getInt("age")
               );
               people.add(person);
           }

            return people;
        } catch (SQLException e) {
            return null;
        }
    }

    @Override
    public Person updatePerson(Person person) {
        String sql = """
                UPDATE people SET name = ?, city = ?, age = ? WHERE id = ?
                """;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, person.name());
            preparedStatement.setString(2, person.city());
            preparedStatement.setInt(3, person.age());
            preparedStatement.setLong(4, person.id());
            int affected = preparedStatement.executeUpdate();

            if(affected > 0){
                return person;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Person insertPerson(Person person) {
        String sql = """
                INSERT INTO people (id, name, city, age)
                VALUES(?, ?, ?, ?)
                """;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            if(person.id() != null){
                preparedStatement.setLong(1, person.id());
            }else {
                preparedStatement.setNull(1, NULL);
            }

            preparedStatement.setString(2, person.name());
            preparedStatement.setString(3, person.city());
            preparedStatement.setInt(4, person.age());

            int affected = preparedStatement.executeUpdate();

            if (affected > 0) {

               ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {

                    long generatedId = resultSet.getLong(1);
                    return new Person(generatedId, person.name(),person.city(), person.age());
                }else{
                    return person;
                }
            }

        } catch (SQLException e) {
           e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deletePerson(Long id) {

        String sql = """
                DELETE FROM people
                WHERE id = ?
                """;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            int affected = preparedStatement.executeUpdate();

            return affected > 0;
        } catch (SQLException e) {
            return false;
        }
    }
}