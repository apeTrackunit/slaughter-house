package com.example.testrestapi.repository;

import com.example.testrestapi.entity.Animal;
import com.example.testrestapi.entity.AnimalType;
import com.example.testrestapi.entity.Farm;
import com.example.testrestapi.inf.IAnimalRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Repository
public class AnimalRepository implements IAnimalRepository {
    public List<Animal> animals = new ArrayList<>();

    public AnimalRepository(){
        initData();
    }

    private void initData(){
        Farm farm = new Farm(1, "VIA", "Horsens", "Best farm ever");
        AnimalType type = new AnimalType(1, "Milka Cow", "Very purpel");

        animals.add(new Animal(1, 100, false, farm, type, "1999-08-03"));
        animals.add(new Animal(2, 202, true, farm, type, "2000-01-01"));
        animals.add(new Animal(3, 300, true, farm, type, "2010-09-02"));
        animals.add(new Animal(4, 150, true, farm, type, "1999-08-03"));
        animals.add(new Animal(5, 90, false, farm, type, "1999-08-03"));
        animals.add(new Animal(6, 69, true, farm, type, "1999-08-03"));
        animals.add(new Animal(7, 666, false, farm, type, "1999-08-03"));
    }

    @Override
    public Animal getAnimalById(long id) {
        return animals.stream().filter(animal -> animal.getId()==id).findFirst().get();
    }

    @Override
    public List<Animal> getAnimals(String date, Long farmId) {
        return animals.stream().filter(animal -> {
            boolean isDate = date != null ? animal.getRegistrationDate().equals(date) : true;
            boolean isFarm = farmId != null ? animal.getFarm().getId() == farmId : true;
            return isDate && isFarm;
        }).collect(Collectors.toList());
    }
}
