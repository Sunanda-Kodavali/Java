package dci.j24e01;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDAOImpl implements RandomDAO{

    private Connection connection;

    public RandomDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public RandomBean insertRandom() {

        Random random = new Random();
        int randomNumber = random.nextInt(1000) + 1;


        String sql = """
                INSERT INTO random_number (id, random_number)
                VALUES(NULL, ?)
                """;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, randomNumber);

            int affected = preparedStatement.executeUpdate();

            if (affected > 0) {

                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {

                    int generatedId = resultSet.getInt(1);
                    return new RandomBean(generatedId, randomNumber);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<RandomBean> findAllRandoms() {
        String sql = """
                SELECT *
                FROM random_number
                """;
        List<RandomBean> randomBeans = new ArrayList<>();
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {

                RandomBean randomBean = new RandomBean(
                        resultSet.getInt("id"),
                        resultSet.getInt("random_number")
                );
                randomBeans.add(randomBean);
            }

            return randomBeans;
        } catch (SQLException e) {
            return null;
        }
    }
}
