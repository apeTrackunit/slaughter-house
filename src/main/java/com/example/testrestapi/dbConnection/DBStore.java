package com.example.testrestapi.dbConnection;


import com.example.testrestapi.entity.Product;
import com.example.testrestapi.entity.Store;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBStore {
    public static Store getStoreById(long id) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from store where Id = " + id);
            Store store = null;

            while (resultSet.next()) {
                long Id = resultSet.getLong("Id");
                String Name = resultSet.getString("Name").trim();
                String Location = resultSet.getString("Location").trim();
                String Description = resultSet.getString("Description").trim();
                store = new Store(Id, Name, Location, Description, null);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return store;
        }
    }


    public static String createStore(String name, String location, String description) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement = connection.createStatement();
            statement.executeUpdate(
                    "insert into store " +
                            "(Name,Location,Description)\n" +
                            "values (" +
                            name + "," +
                            location + "," +
                            description + ");");
            statement.close();
            connection.close();
            return "Ok";
        }
    }


}
