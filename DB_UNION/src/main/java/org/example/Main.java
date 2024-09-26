package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String sql = """
                SELECT first_name, last_name, email FROM students
                UNION
                SELECT first_name, last_name, email_address FROM teachers;
                """;
        List<StudentTeacher> studentTeacherList = new ArrayList<>();
        try(Statement statement = DBUtils.getConnection().createStatement())
        {

            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println();
            while(resultSet.next()){
                StudentTeacher studentTeacher = new StudentTeacher(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
                studentTeacherList.add(studentTeacher);
            }
        }  catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(studentTeacherList);
        System.out.println();

        for (StudentTeacher studentTeacher : studentTeacherList) {
            System.out.println("Sending to " +studentTeacher.email()+" "+
                    "\"Dear " +studentTeacher.firstName()+" "+studentTeacher.lastName()+
                    "This is the school newsletter. Enjoy your day\""+"\n");
        }
    }
}