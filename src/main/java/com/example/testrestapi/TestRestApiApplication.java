package com.example.testrestapi;

import com.example.testrestapi.service.AnimalImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class TestRestApiApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(TestRestApiApplication.class, args);

        Server server = ServerBuilder
                .forPort(8080)
                .addService(new AnimalImpl()).build();

        server.start();
        server.awaitTermination();
    }

}
