package com.example.testrestapi.service;

import com.example.testrestapi.*;
import com.example.testrestapi.dbConnection.DBAnimalType;
import com.example.testrestapi.entity.AnimalType;
import io.grpc.stub.StreamObserver;

import java.sql.SQLException;

public class AnimalTypeImpl extends AnimalTypeServiceGrpc.AnimalTypeServiceImplBase {
    @Override
    public void getAnimalTypeService(GetAnimalTypeRequest request, StreamObserver<GetAnimalTypeResponse> responseObserver) {
        try {
            AnimalType animalType = DBAnimalType.getAnimalType(request.getId());

            GetAnimalTypeResponse.Builder builder = GetAnimalTypeResponse.newBuilder();
            builder.setId(animalType.getId());
            builder.setName(animalType.getName());
            builder.setDescription(animalType.getDescription());

            GetAnimalTypeResponse responseText = builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void createAnimalTypeService(CreateAnimalTypeRequest request, StreamObserver<CreateAnimalTypeResponse> responseObserver) {
        try {
            String response = DBAnimalType.createAnimalType(request.getName(), request.getDescription());

            CreateAnimalTypeResponse.Builder builder = CreateAnimalTypeResponse.newBuilder();
            builder.setConfirmation(response);

            CreateAnimalTypeResponse responseText = builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
