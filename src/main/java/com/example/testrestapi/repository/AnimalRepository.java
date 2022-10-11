package com.example.testrestapi.repository;

import com.example.testrestapi.entity.Animal;
import com.example.testrestapi.entity.AnimalType;
import com.example.testrestapi.entity.Farm;
import com.example.testrestapi.inf.IAnimalRepository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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
    public List<Animal> getByDate(Date date) {
        return null;
    }
}