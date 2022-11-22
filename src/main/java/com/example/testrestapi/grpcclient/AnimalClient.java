package com.example.testrestapi.grpcclient;

import com.example.testrestapi.*;
import com.example.testrestapi.entity.Animal;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class AnimalClient implements IAnimalClient{
    private ManagedChannel managedChannel = ManagedChannelBuilder
            .forAddress("localhost", 8080)
            .usePlaintext()
            .build();

    private AnimalsServiceGrpc.AnimalsServiceBlockingStub blockingStub = AnimalsServiceGrpc.newBlockingStub(managedChannel);

    @Override
    public String createAnimal(Animal animal) {
        CreateAnimalRequest input = CreateAnimalRequest.newBuilder()
                .setAnimalTypeId(animal.getType().getId())
                .setFarmId(animal.getFarm().getId())
                .setIsOk(animal.isOk())
                .setWeight(animal.getWeight())
                .setRegistrationDate(animal.getRegistrationDate())
            .build();

        CreateAnimalResponse response = blockingStub.createAnimal(input);
        return response.getConfirmation();
    }

    @Override
    public List<Long> getAnimals(long productId) {
        GetAnimalIdsRequest input = GetAnimalIdsRequest.newBuilder().setProductId(productId).build();

        GetAnimalIdsResponse response = blockingStub.getAnimalIds(input);


        return response.getAnimalIdsList();
    }
}
