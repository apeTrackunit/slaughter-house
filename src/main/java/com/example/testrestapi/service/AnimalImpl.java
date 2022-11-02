package com.example.testrestapi.service;

import com.example.testrestapi.AnimalsServiceGrpc;
import com.example.testrestapi.GetAnimalIdsRequest;
import com.example.testrestapi.GetAnimalIdsResponse;
import com.example.testrestapi.dbConnection.DBAnimal;
import com.example.testrestapi.entity.Animal;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.util.ArrayList;
import java.util.List;

public class AnimalImpl extends AnimalsServiceGrpc.AnimalsServiceImplBase {


    @Override
    public void getAnimalIds(GetAnimalIdsRequest request, StreamObserver<GetAnimalIdsResponse> responseObserver) {

        try{

            List<Animal> animals = DBAnimal.getAnimalsByProductId(request.getProductId());

            GetAnimalIdsResponse.Builder builder = GetAnimalIdsResponse.newBuilder();
            builder.addAllAnimalIds(animals.stream().map(x -> x.getId()).toList());

            GetAnimalIdsResponse responseText = builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();
        }
        catch (Exception ex){
            System.out.println(ex.getStackTrace());
        }
    }
}
