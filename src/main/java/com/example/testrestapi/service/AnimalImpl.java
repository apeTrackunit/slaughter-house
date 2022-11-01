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
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);

        GetAnimalIdsResponse.Builder builder = GetAnimalIdsResponse.newBuilder();

        for (int i = 0; i < ids.size(); i++) {
            builder.addAnimalIds(ids.get(i));
        }

        GetAnimalIdsResponse responseText = builder.build();
        responseObserver.onNext(responseText);
        responseObserver.onCompleted();
    }
}
