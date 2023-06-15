package com.example.testrestapi.service;

import com.example.testrestapi.proto.*;
import com.example.testrestapi.dbConnection.DBFarm;
import com.example.testrestapi.entity.Farm;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class FarmImpl extends FarmServiceGrpc.FarmServiceImplBase {

    @Override
    public void getFarmService(GetFarmRequest request, StreamObserver<GetFarmResponse> responseObserver) {
        try {
            Farm farm= DBFarm.getFarmById(request.getId());
            GetFarmResponse.Builder builder=GetFarmResponse.newBuilder();
            builder.setName(farm.getName());
            builder.setLocation(farm.getLocation());
            builder.setDescription(farm.getDescription());

            GetFarmResponse response=builder.build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createFarmService(CreateFarmRequest request, StreamObserver<CreateFarmResponse> responseObserver) {
        try {
            String response=DBFarm.createFarm(
                    request.getName(),request.getLocation(),request.getDescription()
            );

            CreateFarmResponse.Builder builder=CreateFarmResponse.newBuilder();
            builder.setConfirmation(response);

            CreateFarmResponse responseText=builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
