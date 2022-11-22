package com.example.testrestapi.inf;

import com.example.testrestapi.CreateAnimalRequest;
import com.example.testrestapi.entity.Animal;

import java.util.List;

public interface IAnimalRepository {
    Animal getAnimalById(long id);
    List<Long> getAnimals(long productId);
    String createAnimal(Animal animal);
}
