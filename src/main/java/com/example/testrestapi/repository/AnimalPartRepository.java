package com.example.testrestapi.repository;

import com.example.testrestapi.entity.AnimalPartInput;
import com.example.testrestapi.grpcclient.AnimalPartClient;
import com.example.testrestapi.grpcclient.IAnimalPartClient;
import com.example.testrestapi.inf.IAnimalPartRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AnimalPartRepository implements IAnimalPartRepository {
    IAnimalPartClient client = new AnimalPartClient();

    @Override
    public String createAnimalPart(AnimalPartInput animalPartInput) {
        return client.createAnimalPart(animalPartInput);
    }

    @Override
    public String updateAnimalPartProductId(Long id, Long productId) {
        return client.updateProductId(id, productId);
    }
}
