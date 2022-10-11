package com.example.testrestapi.controller;

import com.example.testrestapi.entity.Animal;
import com.example.testrestapi.inf.IAnimalRepository;
import com.example.testrestapi.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AnimalController {
    private IAnimalRepository anRepo;

    public AnimalController(AnimalRepository repo) {
        this.anRepo = repo;
    }

    @RequestMapping(value = "/animals/{registrationDate}", method = RequestMethod.GET)
    @ResponseBody
    public List<Animal> getAnimalsByDate(@PathVariable String registrationDate){
        return anRepo.getByDate(registrationDate);
    }

    @RequestMapping(value = "/animal/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Animal getAnimalById(@PathVariable long id) {
        return anRepo.getAnimalById(id);
    }
}
