package com.example.testrestapi.service;

import com.example.testrestapi.*;
import com.example.testrestapi.dbConnection.DBFarm;
import com.example.testrestapi.dbConnection.DBStore;
import com.example.testrestapi.entity.Farm;
import com.example.testrestapi.entity.Store;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class StoreImpl extends StoreServiceGrpc.StoreServiceImplBase {

    @Override
    public void getStoreService(GetStoreRequest request, StreamObserver<GetStoreResponse> responseObserver) {
        try {
            Store store= DBStore.getStoreById(request.getId());
            GetStoreResponse.Builder builder=GetStoreResponse.newBuilder();
            builder.setName(store.getName());
            builder.setLocation(store.getLocation());
            builder.setDescription(store.getDescription());

            GetStoreResponse response=builder.build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void createStoreService(CreateStoreRequest request, StreamObserver<CreateStoreResponse> responseObserver) {
        try {
            String response=DBStore.createStore(request.getName(),
                    request.getLocation(),request.getDescription());
            CreateStoreResponse.Builder builder=CreateStoreResponse.newBuilder();
            builder.setConfirmation(response);

            CreateStoreResponse responseText=builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
