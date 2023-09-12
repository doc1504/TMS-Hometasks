package com.tms.hometask18.config;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    static {
        try {
            DriverManager.registerDriver( new Driver());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection
                ("jdbc:postgresql://localhost:5432/c23",
                        "postgres", "postgres");
    }
}
