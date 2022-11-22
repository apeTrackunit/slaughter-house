package com.example.testrestapi.dbConnection;

import com.example.testrestapi.entity.Product;

import javax.swing.plaf.nimbus.State;
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
            product = new Product(Id, Name, Description);
            return product;

        }

    }


    public static String createProduct(String name,String description, long storeId) throws SQLException {
        try(Connection connection=LoadDriver.getDBConnection())
        {
            Statement statement= connection.createStatement();
            statement.executeUpdate("insert into product (Name,Description,StoreId)"+
                    "values(" + "'"+
                    name +"',"+"'"+
                    description+ "',"+"'"+
                    storeId+"');");

        statement.close();
        connection.close();
        return "Ok";
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

            ArrayList<Product> products = new ArrayList<>();

            while (resultSet.next()) {
                long Id = resultSet.getLong("Id");
                String Name = resultSet.getString("Name");
                String Description = resultSet.getString("Description").trim();
                products.add(new Product(Id, Name, Description));

            }
            resultSet.close();
            statement.close();
            connection.close();
            return products;
        }
    }
}
