package com.example.testrestapi.controller;

import com.example.testrestapi.entity.Animal;
import com.example.testrestapi.entity.AnimalPartInput;
import com.example.testrestapi.inf.IAnimalPartRepository;
import com.example.testrestapi.inf.IAnimalRepository;
import com.example.testrestapi.repository.AnimalPartRepository;
import com.example.testrestapi.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AnimalPartController {
    private IAnimalPartRepository repo;

    public AnimalPartController(AnimalPartRepository repo) {
        this.repo = repo;
    }

    @RequestMapping(value = "/animalPart", method = RequestMethod.POST)
    @ResponseBody
    public String createAnimalParts(@RequestBody AnimalPartInput animalPartInput) {
        return repo.createAnimalPart(animalPartInput);
    }

}
