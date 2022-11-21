package com.example.testrestapi.dbConnection;

import com.example.testrestapi.entity.AnimalPartType;
import com.example.testrestapi.entity.AnimalType;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAnimalType {

    public static AnimalType getAnimalType(long id) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from animal_type where Id = " + id);

            AnimalType animalType = null;

            while (resultSet.next()) {
                long Id = resultSet.getLong("Id");
                String Name = resultSet.getString("Name").trim();
                String Description = resultSet.getString("Description").trim();
                animalType = new AnimalType(Id, Name, Description);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return animalType;
        }
    }

    public static String createAnimalType(String name, String description) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into animal_type (Name, Description) " +
                    "values (" + "'" +
                    name + "', " + "'" +
                    description + "');");
            statement.close();
            connection.close();
            return "Ok";
        }
    }
}
