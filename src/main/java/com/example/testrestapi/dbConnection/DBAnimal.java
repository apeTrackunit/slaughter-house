package com.example.testrestapi.dbConnection;

import com.example.testrestapi.entity.Animal;
import com.example.testrestapi.entity.Product;

import java.sql.*;
import java.util.ArrayList;

public class DBAnimal {
    public static Animal getAnimalById(long id) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from animal where Id = " + id);
            Animal animal = null;

            while (resultSet.next()) {
                long Id = resultSet.getLong("Id");
                long Weight = resultSet.getLong("Weight");
                boolean IsOk = resultSet.getBoolean("IsOk");
                String Description = resultSet.getString("Description").trim();
                animal = new Animal(Id, Weight, IsOk, null, null, null);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return animal;

        }

    }

    public static Animal getAnimal(long id) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from animal " +
                            "where id = " +
                            id + ";");

            Animal animal = null;

            while (resultSet.next()) {
                long Id = resultSet.getLong("Id");
                long Weight = resultSet.getLong("Weight");
                boolean IsOk = resultSet.getBoolean("IsOk");
                animal = new Animal(Id, Weight, IsOk, null, null, null);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return animal;
        }
    }

    public static String createAnimal(long weight, boolean isOk, long farmId, long animalTypeId) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement = connection.createStatement();
            statement.executeUpdate(
                    "insert into animal " +
                            "(Weight, IsOk, FarmId, AnimalTypeId)\n" +
                            "values (" +
                            weight + ", " +
                            isOk + ", " +
                            farmId + ", " +
                            animalTypeId + ");");
            statement.close();
            connection.close();
            return "Ok";
        }
    }

    public static ArrayList<Animal> getAnimalsByProductId(long id) throws SQLException {

        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from animal\n" +
                            "where Id in (\n" +
                            "    select distinct AnimalId\n" +
                            "    from animalpart\n" +
                            "    where ProductId = " +
                            id + ");");

            ArrayList<Animal> animals = new ArrayList<>();

            while (resultSet.next()) {
                long Id = resultSet.getLong("Id");
                long Weight = resultSet.getLong("Weight");
                boolean IsOk = resultSet.getBoolean("IsOk");
                animals.add(new Animal(Id, Weight, IsOk, null, null,null));

            }
            resultSet.close();
            statement.close();
            connection.close();
            return animals;
        }
    }
}
