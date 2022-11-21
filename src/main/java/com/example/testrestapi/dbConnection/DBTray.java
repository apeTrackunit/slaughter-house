package com.example.testrestapi.dbConnection;

import com.example.testrestapi.entity.Farm;
import com.example.testrestapi.entity.Tray;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTray {

    public static Tray getTrayById(long id) throws SQLException {
        try (Connection connection = LoadDriver.getDBConnection()) {
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from tray where Id=" + id);
            Tray tray = null;

            while (resultSet.next()) {
                long Id = resultSet.getLong("Id");
                double maxWeights = resultSet.getDouble("MaxWeight");
                String description = resultSet.getString("Description").trim();

                tray = new Tray(Id, maxWeights, description);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return tray;
        }
    }


    public String createTray(double maxWeight, String description, long animalPartTypeId) throws SQLException {
        try(Connection connection=LoadDriver.getDBConnection())
        {
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into tray (MaxWeight,Description,AnimalPartTypeId)"+
                    "values(" + "'"+
                    maxWeight +"',"+"'"+
                    description+ "',"+"'"+
                    animalPartTypeId+"');");
            statement.close();
            connection.close();
            return "Ok";
        }
    }

}
