package com.example.testrestapi.grpcclient;

import com.example.testrestapi.entity.AnimalPartInput;

public interface IAnimalPartClient {
    String createAnimalPart(AnimalPartInput animalPartInput);
    String updateProductId(Long id, Long productId);
}
