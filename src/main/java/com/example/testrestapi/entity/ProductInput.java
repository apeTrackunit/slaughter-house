package com.example.testrestapi.entity;

import java.util.List;

public class ProductInput {
    private String productName;
    private String productDescription;
    private List<Long> animalPartIds;

    public ProductInput(String productName, String productDescription, List<Long> animalPartIds) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.animalPartIds = animalPartIds;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public List<Long> getAnimalPartIds() {
        return animalPartIds;
    }

    public void setAnimalPartIds(List<Long> animalPartIds) {
        this.animalPartIds = animalPartIds;
    }
}
