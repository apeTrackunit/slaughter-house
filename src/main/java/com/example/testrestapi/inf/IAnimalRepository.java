package com.example.testrestapi.inf;

import com.example.testrestapi.entity.Animal;

import java.util.List;

public interface IAnimalRepository {
    Animal getAnimalById(long id);
    List<Animal> getAnimals(String date, Long farmId);
}
