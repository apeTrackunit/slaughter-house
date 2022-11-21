package com.example.testrestapi.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver {
    public static Connection getDBConnection()
    {
        Connection connection;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/slaughterhouse",
                    "root", "password");
            System.out.println("Driver loaded ok");

            // slaughterhouse is database
            // root is the user name
            // password is database password
        return connection;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

