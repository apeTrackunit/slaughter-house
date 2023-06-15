package com.example.testrestapi.service;

import com.example.testrestapi.proto.*;
import com.example.testrestapi.dbConnection.DBAnimal;
import com.example.testrestapi.entity.Animal;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalImpl extends AnimalsServiceGrpc.AnimalsServiceImplBase {

    /**
     * Unnecessary
     * @param request
     * @param responseObserver
     */
    @Override
    public void getAnimal(GetAnimalRequest request, StreamObserver<GetAnimalResponse> responseObserver) {
        try{

            Animal animal = DBAnimal.getAnimal(request.getAnimalId());

            GetAnimalResponse.Builder builder = GetAnimalResponse.newBuilder();
            builder.setAnimalId(animal.getId());
            builder.setWeight(animal.getWeight());
            builder.setIsOk(animal.isOk());
            builder.setFarmId(1);
            builder.setAnimalTypeId(1);
            builder.setRegistrationDate("");

            GetAnimalResponse responseText = builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();
        }
        catch (Exception ex){
            System.out.println(ex.getStackTrace());
        }
    }

    @Override
    public void createAnimal(CreateAnimalRequest request, StreamObserver<CreateAnimalResponse> responseObserver) {
        try{
            String response = DBAnimal.createAnimal(
                    request.getWeight(), request.getIsOk(),
                    request.getFarmId(), request.getAnimalTypeId());

            CreateAnimalResponse.Builder builder = CreateAnimalResponse.newBuilder();
            builder.setConfirmation(response);

            CreateAnimalResponse responseText = builder.build();
            responseObserver.onNext(responseText);
            responseObserver.onCompleted();
        }
        catch (Exception ex){
            System.out.println(ex.getStackTrace());
        }    }

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
