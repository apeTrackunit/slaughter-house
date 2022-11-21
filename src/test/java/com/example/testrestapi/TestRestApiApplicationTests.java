package com.example.testrestapi;

import com.example.testrestapi.dbConnection.DBAnimal;
import com.example.testrestapi.dbConnection.DBStore;
import com.example.testrestapi.dbConnection.DBAnimalPart;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

@SpringBootTest
class TestRestApiApplicationTests {

    @Test
    void contextLoads() {
//        DBAnimal dbAnimal = new DBAnimal();

        DBStore dbStore=new DBStore();
        try {
            System.out.println(dbStore.createStore("lidl", "zadok", "velky"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
