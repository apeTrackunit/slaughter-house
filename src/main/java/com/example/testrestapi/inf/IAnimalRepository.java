package com.example.testrestapi.inf;

import com.example.testrestapi.entity.Animal;

import java.util.List;

public interface IAnimalRepository {
    List<Animal> getAnimals(String date, Long farmId);
}
