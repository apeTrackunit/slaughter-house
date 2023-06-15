package com.example.testrestapi.grpcclient;

import com.example.testrestapi.proto.*;
import com.example.testrestapi.entity.AnimalPartInput;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

@Service
public class AnimalPartClient implements IAnimalPartClient{
    private ManagedChannel managedChannel = ManagedChannelBuilder
            .forAddress("localhost", 8080)
            .usePlaintext()
            .build();

    private AnimalPartsServiceGrpc.AnimalPartsServiceBlockingStub blockingStub =
            AnimalPartsServiceGrpc.newBlockingStub(managedChannel);

    @Override
    public String createAnimalPart(AnimalPartInput animalPartInput) {
        CreateAnimalPartRequest input = CreateAnimalPartRequest.newBuilder()
                .setWeight(animalPartInput.getWeight())
                .setAnimalId(animalPartInput.getAnimalId())
                .setTrayId(animalPartInput.getTrayId())
                .setAnimalPartType(animalPartInput.getAnimalPartTypeId())
                .build();
        CreateAnimalPartResponse response = blockingStub.createAnimalPart(input);

        return response.getConfirmation();
    }

    @Override
    public String updateProductId(Long id, Long productId) {
        UpdateAnimalPartProductIdRequest input  = UpdateAnimalPartProductIdRequest.newBuilder()
                .setProductId(productId)
                .setId(id)
                .build();
        UpdateAnimalPartProductIdResponse response = blockingStub.updateAnimalPartProductId(input);

        return response.getConfirmation();
    }
}
