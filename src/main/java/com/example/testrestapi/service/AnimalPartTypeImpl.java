package com.example.testrestapi.service;

import com.example.testrestapi.proto.*;
import com.example.testrestapi.dbConnection.DBAnimalPartType;
import com.example.testrestapi.entity.AnimalPartType;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class AnimalPartTypeImpl extends AnimalPartTypeServiceGrpc.AnimalPartTypeServiceImplBase {

    @Override
    public void getAnimalPartTypeService(GetAnimalPartTypeRequest request, StreamObserver<GetAnimalPartTypeResponse> responseObserver) {
        AnimalPartType animalPartType = null;
        try {
            animalPartType = DBAnimalPartType.getAnimalPartType(request.getId());

            GetAnimalPartTypeResponse.Builder builder = GetAnimalPartTypeResponse.newBuilder();
            builder.setName(animalPartType.getName());
            builder.setDescription(animalPartType.getDescription());

            GetAnimalPartTypeResponse responseText = builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void createAnimalPartTypeService(CreateAnimalPartTypeRequest request, StreamObserver<CreateAnimalPartTypeResponse> responseObserver) {
        try {
            String response = DBAnimalPartType.createAnimalPartType(request.getName(), request.getDescription());

            CreateAnimalPartTypeResponse.Builder builder = CreateAnimalPartTypeResponse.newBuilder();
            builder.setConfirmation(response);

            CreateAnimalPartTypeResponse responseText = builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
