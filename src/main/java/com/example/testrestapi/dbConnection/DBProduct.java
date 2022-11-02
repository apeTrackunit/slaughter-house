package com.example.testrestapi.dbConnection;

import com.example.testrestapi.entity.Product;

import java.sql.*;
import java.util.ArrayList;

public class DBProduct {

    public static Product getProductById(long id) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from product where Id = " + id);

            long Id = 0;
            String Name = null;
            String Description = null;
            Product product;

            while (resultSet.next()) {
                Id = resultSet.getLong("Id");
                Name = resultSet.getString("Name");
                Description = resultSet.getString("Description").trim();
            }
            resultSet.close();
            statement.close();
            connection.close();
            product = new Product(Id, Name, Description, null);
            return product;

        }

    }

    public static ArrayList<Product> getProductsByAnimalId(long id) throws SQLException {

        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from product\n" +
                            "where Id in (\n" +
                            "    select distinct ProductId\n" +
                            "    from animalpart\n" +
                            "    where AnimalId = " +
                            id + ");");

            long Id;
            String Name;
            String Description;
            ArrayList<Product> products = new ArrayList<>();


            while (resultSet.next()) {
                Id = resultSet.getLong("Id");
                Name = resultSet.getString("Name");
                Description = resultSet.getString("Description").trim();
                products.add(new Product(Id, Name, Description, null));

            }
            resultSet.close();
            statement.close();
            connection.close();
            return products;
        }
    }
}
