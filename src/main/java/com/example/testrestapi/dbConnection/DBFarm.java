package com.example.testrestapi.dbConnection;

import com.example.testrestapi.entity.Farm;

import java.sql.*;

public class DBFarm {


    public static Farm getFarmById(long id) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from farm where Id=" + id);
            Farm farm = null;

            while (resultSet.next()) {
                long Id = resultSet.getLong("Id");
                String Name = resultSet.getString("Name").trim();
                String Location = resultSet.getString("Location").trim();
                String Description = resultSet.getString("Description").trim();

                farm = new Farm(Id, Name, Location, Description);
            }

            resultSet.close();
            statement.close();
            connection.close();
            return farm;
        }
    }

    public static Farm createFarm(Farm farm)
    {
        return farm;
    }

}

