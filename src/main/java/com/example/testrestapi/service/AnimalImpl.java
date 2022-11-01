package com.example.testrestapi.service;

import com.example.testrestapi.AnimalsServiceGrpc;
import com.example.testrestapi.GetAnimalIdsRequest;
import com.example.testrestapi.GetAnimalIdsResponse;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.util.ArrayList;
import java.util.List;

@GRpcService
public class AnimalImpl extends AnimalsServiceGrpc.AnimalsServiceImplBase {

    @Override
    public void getAnimalIds(GetAnimalIdsRequest request, StreamObserver<GetAnimalIdsResponse> responseObserver){

        List<Long> ids = new ArrayList<Long>();

        GetAnimalIdsResponse responseText = GetAnimalIdsResponse.newBuilder().setAnimalIds().build();
        responseObserver.onNext(responseText);
        responseObserver.onCompleted();
    }
}
