package com.example.testrestapi.service;

import com.example.testrestapi.AnimalsServiceGrpc;
import com.example.testrestapi.GetAnimalIdsRequest;
import com.example.testrestapi.GetAnimalIdsResponse;
import com.example.testrestapi.dbConnection.DBAnimal;
import com.example.testrestapi.entity.Animal;
import io.grpc.stub.StreamObserver;

import java.util.List;

public class AnimalImpl extends AnimalsServiceGrpc.AnimalsServiceImplBase {

    @Override
    public void getAnimalIds(GetAnimalIdsRequest request, StreamObserver<GetAnimalIdsResponse> responseObserver) {
        try{

            List<Animal> animals = DBAnimal.getAnimalsByProductId(request.getProductId());

            GetAnimalIdsResponse.Builder builder = GetAnimalIdsResponse.newBuilder();
            for (int i = 0; i < animals.size(); i++) {
                builder.addAnimalIds(animals.get(i).getId());
            }

            GetAnimalIdsResponse responseText = builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();
        }
        catch (Exception ex){
            System.out.println(ex.getStackTrace());
        }
    }
}
