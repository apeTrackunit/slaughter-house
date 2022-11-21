package com.example.testrestapi.dbConnection;

import com.example.testrestapi.entity.AnimalPartType;
import com.example.testrestapi.entity.Store;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAnimalPartType {

    public static AnimalPartType getAnimalPartType(long id) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from animal_part_type where Id = " + id);

            AnimalPartType animalPartType = null;

            while (resultSet.next()) {
                long Id = resultSet.getLong("Id");
                String Name = resultSet.getString("Name").trim();
                String Description = resultSet.getString("Description").trim();
                animalPartType = new AnimalPartType(Id, Name, Description);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return animalPartType;
        }
    }

    public static String createAnimalPartType(String name, String description) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {

            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into animal_part_type (Name, Description) " +
                    "values (" + "'" +
                    name + "', " + "'" +
                    description + "');");
            statement.close();
            connection.close();
            return "Ok";
        }
    }

}
