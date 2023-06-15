package com.example.testrestapi.service;

import com.example.testrestapi.proto.*;
import com.example.testrestapi.dbConnection.DBAnimal;
import com.example.testrestapi.dbConnection.DBAnimalPart;
import com.example.testrestapi.entity.AnimalPart;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;
import java.sql.SQLException;

@Service
public class AnimalPartImpl extends AnimalPartsServiceGrpc.AnimalPartsServiceImplBase {
    @Override
    public void updateAnimalPartProductId(UpdateAnimalPartProductIdRequest request, StreamObserver<UpdateAnimalPartProductIdResponse> responseObserver) {

        try {

            String confirmation = DBAnimalPart.updateProductId(request.getId(), request.getProductId());

            UpdateAnimalPartProductIdResponse.Builder builder = UpdateAnimalPartProductIdResponse.newBuilder();
            builder.setConfirmation(confirmation);

            UpdateAnimalPartProductIdResponse responseText = builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();

        } catch (SQLException e) {
            System.out.println(e.getStackTrace());
        }    }

    @Override
    public void getAnimalPart(GetAnimalPartRequest request, StreamObserver<GetAnimalPartResponse> responseObserver) {

        try {
            AnimalPart animalPart = DBAnimalPart.getAnimalPart(request.getId());

            GetAnimalPartResponse.Builder builder = GetAnimalPartResponse.newBuilder();
            builder.setId(animalPart.getId());
            builder.setWeight(animalPart.getWeight());
            builder.setAnimalId(1);

            GetAnimalPartResponse responseText = builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();

        } catch (SQLException e) {
            System.out.println(e.getStackTrace());
        }
    }

    @Override
    public void createAnimalPart(CreateAnimalPartRequest request, StreamObserver<CreateAnimalPartResponse> responseObserver) {
        try {
            String response = DBAnimalPart.createAnimalPart(request.getWeight(), request.getAnimalId(), 1, request.getTrayId(), request.getAnimalPartType());

            CreateAnimalPartResponse.Builder builder = CreateAnimalPartResponse.newBuilder();
            builder.setConfirmation(response);

            CreateAnimalPartResponse responseText = builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
