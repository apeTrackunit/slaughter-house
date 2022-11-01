package com.example.testrestapi.service;

import com.example.testrestapi.AnimalsServiceGrpc;
import com.example.testrestapi.GetAnimalIdsRequest;
import com.example.testrestapi.GetAnimalIdsResponse;
import com.example.testrestapi.entity.AnimalPart;
import com.example.testrestapi.entity.Product;
import io.grpc.stub.StreamObserver;
import java.util.List;

public class AnimalImpl extends AnimalsServiceGrpc.AnimalsServiceImplBase {

    @Override
    public void getAnimalIds(GetAnimalIdsRequest request, StreamObserver<GetAnimalIdsResponse> responseObserver) {
        Product product = null;
        List<AnimalPart> animalParts = product.getAnimalParts();

        GetAnimalIdsResponse.Builder builder = GetAnimalIdsResponse.newBuilder();
        for (int i = 0; i < animalParts.size(); i++) {
            builder.addAnimalIds(animalParts.get(i).getAnimal().getId());
        }

        GetAnimalIdsResponse responseText = builder.build();
        responseObserver.onNext(responseText);
        responseObserver.onCompleted();
    }
}
