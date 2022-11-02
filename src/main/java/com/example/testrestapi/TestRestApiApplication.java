package com.example.testrestapi;

import com.example.testrestapi.dbConnection.DBAnimal;
import com.example.testrestapi.dbConnection.DBProduct;

import com.example.testrestapi.dbConnection.DBProduct;
import com.example.testrestapi.entity.Animal;
import com.example.testrestapi.entity.Product;
import com.example.testrestapi.service.AnimalImpl;
import com.example.testrestapi.service.ProductImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@SpringBootApplication
public class TestRestApiApplication {

    public static void main(String[] args) throws IOException, InterruptedException, SQLException {
        /* SpringApplication.run(TestRestApiApplication.class, args);

        Server server = ServerBuilder
                .forPort(8080)
                .addService(new ProductImpl()).build();

        server.start();
        server.awaitTermination();*/
/*
        Product product = DBProduct.getProductById(1);
        System.out.println("Name: " + product.getName());
        System.out.println("Description " + product.getDescription());

        product = DBProduct.getProductById(2);
        System.out.println("Name: " + product.getName());
        System.out.println("Description " + product.getDescription());
*/
        ArrayList<Animal> animals = DBAnimal.getAnimalsByProductId(2);
        Animal animal;

        for(int i = 0; i < animals.size(); i++){
            animal = animals.get(i);
            System.out.println("Id: " + animal.getId());
            System.out.println("Weight: " + animal.getWeight());
        }
    }

}
