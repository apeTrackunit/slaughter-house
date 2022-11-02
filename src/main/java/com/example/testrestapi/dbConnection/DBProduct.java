package com.example.testrestapi.dbConnection;

import com.example.testrestapi.entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class DBProduct {

    public static Product getProductById(long id) throws SQLException {
        Connection connection = LoadDriver.getDBConnection();
        try{

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from product where Id = " + id);

            long Id = 0;
            String Name = null;
            String Description = null;


            while(resultSet.next()){
                Id = resultSet.getLong("Id");
                Name = resultSet.getString("Name");
                Description = resultSet.getString("Description").trim();
            }
            resultSet.close();
            statement.close();
            connection.close();
            Product product = new Product(Id, Name, Description, null);
            return product;

        }catch(Exception e){
            throw e;
        }
        finally{
            connection.close();
        }

    }

    public static ArrayList<Product> getProductsByAnimalId(long id) throws SQLException {
        Connection connection = LoadDriver.getDBConnection();

        try{

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

            long Id = 0;
            String Name = null;
            String Description = null;
            ArrayList<Product> products = new ArrayList<>();


            while(resultSet.next()){
                Id = resultSet.getLong("Id");
                Name = resultSet.getString("Name");
                Description = resultSet.getString("Description").trim();
                products.add(new Product(Id, Name, Description, null));

            }
            resultSet.close();
            statement.close();
            connection.close();
            return products;

        }catch(Exception e){
            throw e;
        }
        finally{
            connection.close();
        }
    }
}
