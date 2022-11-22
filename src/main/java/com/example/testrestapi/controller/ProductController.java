package com.example.testrestapi.controller;

import com.example.testrestapi.entity.Animal;
import com.example.testrestapi.entity.Product;
import com.example.testrestapi.inf.IProductRepository;
import com.example.testrestapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ProductController {
    private IProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    @ResponseBody
    public List<Long> getProducts(@RequestParam Optional<Long> animalId){
        if(animalId.isEmpty()){
            return new ArrayList<>();
        }

        return repo.getProducts(animalId.get().longValue());
    }
}
