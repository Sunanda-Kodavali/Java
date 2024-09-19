package org.example;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {


       Student student = new Student(2, "Sunanda", "Kodavali", 31);

        byte[] studentBytes = SerializationUtils.serialize(student);

        String sql = "INSERT INTO student_data (student_id, data) VALUES (?, ?)";

        try(PreparedStatement preparedStatement = DBUtils.getConnection().prepareStatement(sql))
        {
            preparedStatement.setInt(1, 1);
            preparedStatement.setBytes(2, studentBytes);
            int affected = preparedStatement.executeUpdate();

            if(affected == 1){
                System.out.println("Student data added successfully");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String readsql = "SELECT * FROM student_data WHERE student_id = ?";

        try(PreparedStatement preparedStatement = DBUtils.getConnection().prepareStatement(readsql))
        {
            preparedStatement.setInt(1, 1);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int studentId = resultSet.getInt("student_id");
                byte[] data = resultSet.getBytes("data");

                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);

                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

                Student student1 = (Student) objectInputStream.readObject();
                System.out.println(student1.getFirstName());
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}