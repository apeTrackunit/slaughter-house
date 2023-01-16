package com.example.testrestapi.grpcclient;

import com.example.testrestapi.entity.Animal;

import java.util.List;

public interface IAnimalClient {
    String createAnimal(Animal animal);
    List<Long> getAnimals(long productId);
    Animal getAnimal(long id);
}
