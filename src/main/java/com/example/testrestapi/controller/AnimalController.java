package com.example.testrestapi.controller;

import com.example.testrestapi.entity.Animal;
import com.example.testrestapi.inf.IAnimalRepository;
import com.example.testrestapi.repository.AnimalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class AnimalController {
    private IAnimalRepository anRepo;

    public AnimalController(AnimalRepository repo) {
        this.anRepo = repo;
    }

    @RequestMapping(value = "/animals", method = RequestMethod.GET)
    @ResponseBody
    public List<Animal> getAnimals(@RequestParam Optional<String> registrationDate, @RequestParam Optional<Long> farmId){
        return anRepo.getAnimals(registrationDate.isPresent() ? registrationDate.get() : null,farmId.isPresent() ? farmId.get() : null);
    }
}
