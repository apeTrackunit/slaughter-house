package com.example.testrestapi.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!

import java.sql.*;


public class LoadDriver {
    public static void main(String arg[])
    {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/slaughterhouse",
                    "root", "HesloJeNajlepsieHeslo");

            // slaughterhouse is database
            // root is user name
            // HesloJeNajlepsieHeslo is database password

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from product");
            String Name;
            String Description;
            while (resultSet.next()) {
                Name = resultSet.getString("Name");
                Description = resultSet.getString("Description").trim();
                System.out.println("Name : " + Name
                        + " Description : " + Description);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    } // function ends
} // class ends

