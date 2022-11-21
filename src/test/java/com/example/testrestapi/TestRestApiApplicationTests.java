package com.example.testrestapi;

import com.example.testrestapi.dbConnection.DBAnimal;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

@SpringBootTest
class TestRestApiApplicationTests {

    @Test
    void contextLoads() {
        DBAnimal dbAnimal = new DBAnimal();

        try {
            System.out.println(dbAnimal.createAnimal(20, true, 1, 1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
