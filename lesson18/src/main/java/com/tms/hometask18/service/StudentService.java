package com.tms.hometask18.service;

import com.tms.hometask18.config.DataBaseConnection;
import com.tms.hometask18.domain.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public void save (Student student) throws SQLException {
        Connection connection = DataBaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSetStudent = statement.executeQuery
                ("select max(id) + 1 from students");
        boolean next = resultSetStudent.next();
        int nextId = resultSetStudent.getInt(1);
        PreparedStatement preparedStatement = connection.prepareStatement
                ("insert into students" +
                        "(id, login, isMan, city_name) values (?, ?, ?, ?)");

        preparedStatement.setInt(1, nextId);
        preparedStatement.setString(2, student.getLogin());
        preparedStatement.setBoolean(3, student.getMan());
        preparedStatement.setString(4, student.getCity_name());

        preparedStatement.execute();

    }
    public void deleteById (Integer id) throws SQLException {
        Connection connection = DataBaseConnection.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("delete from students where id = " + id);



    }

    public List<Student> findAll() throws SQLException {
        Connection connection = DataBaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from students " +
                "join cities on students.city_name = cities.name");
        return createFromResultSet(resultSet);

    }

    private List<Student> createFromResultSet(ResultSet resultSet) throws SQLException {
        List<Student> studentList = new ArrayList<>();

        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String login = resultSet.getString(2);
            boolean isMan = resultSet.getBoolean(3);
            String city_name = resultSet.getString(4);
            Student student = new Student(id, login, isMan, city_name);
            studentList.add(student);
        }
        return studentList;
    }


}
