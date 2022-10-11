package com.example.testrestapi.inf;

import com.example.testrestapi.entity.Animal;

import java.sql.Date;
import java.util.List;

public interface IAnimalRepository {
    List<Animal> getByDate(Date date);
}
