package dci.j24e01;

import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/People_exc",
                "root",
                "sunanda123"
        );

        PersonDAO personDAO = new PersonDAOMysqlImpl(connection);
       /* Person p1 = personDAO.findPerson(8L);

        System.out.println(p1);

        List<Person> people = personDAO.findPeople();


        for (Person person : people) {
            System.out.println(people);
        }*/



       /* Person updatedPerson = personDAO.updatePerson(new Person(8L,"Sunanda", "guntur",12 ));

        System.out.println(updatedPerson);*/

       /* Person insertedPerson = personDAO.insertPerson(new Person(79L,"Dhruvah", "Berlin",23 ));

        System.out.println(insertedPerson);*/

        System.out.println(personDAO.deletePerson(57L));

//        String sql = """
//                SELECT *
//                FROM (
//                	SELECT *
//                	FROM people
//                	ORDER BY id DESC
//                	LIMIT 3
//                ) AS last_3
//                ORDER BY id ASC
//                """;
//
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(sql);
//
//        while (resultSet.next()) {
//            System.out.println(resultSet.getString("name"));
//            System.out.println(resultSet.getString("age"));
//            System.out.println("---");
//        }

    }
}