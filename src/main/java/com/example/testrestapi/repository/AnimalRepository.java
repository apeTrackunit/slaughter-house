package com.example.testrestapi.repository;

import com.example.testrestapi.CreateAnimalRequest;
import com.example.testrestapi.entity.Animal;
import com.example.testrestapi.entity.AnimalType;
import com.example.testrestapi.entity.Farm;
import com.example.testrestapi.grpcclient.AnimalClient;
import com.example.testrestapi.grpcclient.IAnimalClient;
import com.example.testrestapi.inf.IAnimalRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Repository
public class AnimalRepository implements IAnimalRepository {
    IAnimalClient animalClient = new AnimalClient();

    public AnimalRepository(){

    }

    @Override
    public Animal getAnimalById(long id) {
        return animalClient.getAnimal(id);
    }

    @Override
    public List<Long> getAnimals(long productId) {
        return animalClient.getAnimals(productId);
    }

    @Override
    public String createAnimal(Animal animal) {
        return animalClient.createAnimal(animal);
    }
}
