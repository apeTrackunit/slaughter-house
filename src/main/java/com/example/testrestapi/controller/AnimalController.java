package com.example.testrestapi.controller;

import com.example.testrestapi.entity.Animal;
import com.example.testrestapi.inf.IAnimalRepository;
import com.example.testrestapi.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public List<Long> getAnimals(@RequestParam Optional<Long> productId){
        if(productId.isEmpty()){
            return new ArrayList<>();
        }

        return anRepo.getAnimals(productId.get().longValue());
    }

    /**
     * Unnecessary
     * @param id
     * @return
     */
    @RequestMapping(value = "/animal/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Animal getAnimalById(@PathVariable long id) {
        return anRepo.getAnimalById(id);
    }

    @RequestMapping(value = "/animal", method = RequestMethod.POST)
    @ResponseBody
    public String createAnimal(@RequestBody Animal animal) {
        return anRepo.createAnimal(animal);
    }

}
