package dci.j24e01;
import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/random_number",
                    "root",
                    "sunanda123"
            );

            System.out.println("==========================================");
            System.out.println("Random Number Generator");
            System.out.println("==========================================");

            RandomDAO randomDAO = new RandomDAOImpl(connection);
            System.out.println("Random number inserted: "+randomDAO.insertRandom().random());

            System.out.println("\nPreviously generated numbers:");

            List<RandomBean> randoms = randomDAO.findAllRandoms();
            int count = 0;

            for (RandomBean randomBean : randoms){

                count = count + 1;
                System.out.println(count + ". " + randomBean.random());

            }

            System.out.println("\nTotal numbers generated: " + count);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}