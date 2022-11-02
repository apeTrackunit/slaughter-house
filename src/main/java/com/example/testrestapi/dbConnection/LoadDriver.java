package com.example.testrestapi.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!

import java.sql.*;


public class LoadDriver {
    public static Connection getDBConnection()
    {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/slaughterhouse",
                    "root", "HesloJeNajlepsieHeslo");
            System.out.println("Driver loaded ok");

            // slaughterhouse is database
            // root is user name
            // HesloJeNajlepsieHeslo is database password
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
        return connection;
    } // function ends
} // class ends

