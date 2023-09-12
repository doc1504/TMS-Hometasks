package com.tms.hometask18.service;

import com.tms.hometask18.config.DataBaseConnection;
import com.tms.hometask18.domain.City;

import java.sql.*;

public class CityService {

    public void save (City city) throws SQLException {
        Connection connection = DataBaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSetCity = statement.executeQuery("select * from cities");
        boolean next = resultSetCity.next();
        PreparedStatement preparedStatement = connection.prepareStatement
                ("insert into cities (name) values (?)");
        preparedStatement.setString(1, city.getName());

        preparedStatement.execute();
    }

    public void deleteCity() throws SQLException {
        Connection connection = null;
        try {
            connection = DataBaseConnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        statement.executeUpdate("delete from cities where name like 'Minsk'");

    }


}
