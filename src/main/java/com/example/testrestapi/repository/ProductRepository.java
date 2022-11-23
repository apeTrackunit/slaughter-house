package com.example.testrestapi.repository;

import com.example.testrestapi.entity.Product;
import com.example.testrestapi.entity.ProductInput;
import com.example.testrestapi.grpcclient.IProductClient;
import com.example.testrestapi.grpcclient.ProductClient;
import com.example.testrestapi.inf.IAnimalPartRepository;
import com.example.testrestapi.inf.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    IProductClient productClient = new ProductClient();
    IAnimalPartRepository animalPartRepository = new AnimalPartRepository();

    @Override
    public List<Long> getProducts(long animalId) {
        return productClient.getProducts(animalId);
    }

    @Override
    public String createProduct(ProductInput productInput) {
        Long id = productClient.createProduct(productInput.getProductName(), productInput.getProductDescription());

        for (var animalPartId : productInput.getAnimalPartIds()) {
            String confirmation = animalPartRepository.updateAnimalPartProductId(animalPartId, id);

            if(!confirmation.equals("Ok")){
                System.out.println("Couldn't add animal part to product");
            }
        }
        return "Ok";
    }
}
