package com.example.testrestapi.controller;

import com.example.testrestapi.inf.IAnimalRepository;
import com.example.testrestapi.repository.AnimalRepository;

public class AnimalController {
    private IAnimalRepository anRepo;

    public AnimalController(AnimalRepository repo) {
        anRepo = repo;
    }
}
