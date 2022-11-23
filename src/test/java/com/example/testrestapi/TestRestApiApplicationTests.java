package com.example.testrestapi;

import com.example.testrestapi.dbConnection.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

@SpringBootTest
class TestRestApiApplicationTests {

    @Test
    void contextLoads() {
        DBAnimalPart dbAnimalPart = new DBAnimalPart();
        try {
            System.out.println(dbAnimalPart.updateProductId(1, 2));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void dbConnection(){
        DBAnimal dbAnimal = new DBAnimal();
        DBAnimalPart dbAnimalPart = new DBAnimalPart();
        DBAnimalPartType dbAnimalPartType = new DBAnimalPartType();
        DBAnimalType dbAnimalType = new DBAnimalType();

        try {
            System.out.println("Animal");
            System.out.println(dbAnimal.getAnimal(1));
            System.out.println(dbAnimal.createAnimal(40, true, 1, 1));
            System.out.println("Animal Part");
            System.out.println(dbAnimalPart.getAnimalPart(1));
            System.out.println(dbAnimalPart.createAnimalPart(30, 1, 1, 1, 1));
            System.out.println("Animal Part Type");
            System.out.println(dbAnimalPartType.getAnimalPartType(1));
            System.out.println(dbAnimalPartType.createAnimalPartType("Stehienko", "Jaaaaaj tak by som si dal"));
            System.out.println(dbAnimalType.getAnimalType(1));
            System.out.println(dbAnimalType.createAnimalType("Space cow", "She gonna abduct you!!!!"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
