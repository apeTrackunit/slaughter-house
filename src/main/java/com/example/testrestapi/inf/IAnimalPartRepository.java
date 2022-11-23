package com.example.testrestapi.inf;

import com.example.testrestapi.entity.AnimalPartInput;

public interface IAnimalPartRepository {
    String createAnimalPart(AnimalPartInput animalPartInput);
    String updateAnimalPartProductId(Long id, Long productId);
}
