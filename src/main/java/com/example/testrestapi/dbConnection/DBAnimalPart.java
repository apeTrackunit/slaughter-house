package com.example.testrestapi.dbConnection;

import com.example.testrestapi.entity.Animal;
import com.example.testrestapi.entity.AnimalPart;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAnimalPart {

    public static AnimalPart getAnimalPart(long id) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from animal_part where Id = " + id);
            AnimalPart animalPart = null;

            while (resultSet.next()) {
                long Id = resultSet.getLong("Id");
                long Weight = resultSet.getLong("Weight");
                long AnimalId = resultSet.getLong("AnimalId");
                long ProductId = resultSet.getLong("ProductId");
                long TrayId = resultSet.getLong("TrayId");
                animalPart = new AnimalPart(Id, Weight, null, null, null, null);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return animalPart;
        }
    }
    public static String createAnimalPart(long weight, long animalId, long productId, long trayId, long animalPartTypeId) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement = connection.createStatement();
            statement.executeUpdate(
                    "insert into animal_part " +
                            "(Weight, AnimalId, ProductId, AnimalTypeId, TrayId)\n" +
                            "values (" +
                            weight + ", " +
                            animalId + ", " +
                            productId + ", " +
                            animalPartTypeId + ", " +
                            trayId + ");");

            statement.close();
            connection.close();
            return "Ok";
        }
    }

    public static String updateProductId(long id, long productId) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement = connection.createStatement();
            statement.executeUpdate(
                    "update animal_part" +
                            " set ProductId = " + productId +
                            " where Id = " + id + ";"
            );
            statement.close();
            connection.close();
            return "Ok";
        }
    }
}
