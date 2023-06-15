package com.example.testrestapi;

import com.example.testrestapi.dbConnection.DBAnimal;
import com.example.testrestapi.dbConnection.DBProduct;

import com.example.testrestapi.dbConnection.DBProduct;
import com.example.testrestapi.entity.Animal;
import com.example.testrestapi.entity.Product;
import com.example.testrestapi.service.*;
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
        SpringApplication.run(TestRestApiApplication.class, args);

        Server server = ServerBuilder
                .forPort(8080).
                addService(new ProductImpl()).
                addService(new AnimalPartImpl()).
                addService(new AnimalPartTypeImpl()).
                addService(new AnimalTypeImpl()).
                addService(new AnimalImpl()).
                addService(new FarmImpl()).
                addService(new StoreImpl()).
                addService(new TrayImpl())
                .build();

        server.start();
        server.awaitTermination();
    }
}