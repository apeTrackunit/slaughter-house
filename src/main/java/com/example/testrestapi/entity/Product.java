package com.example.testrestapi.entity;

import org.json.simple.JSONObject;

import java.util.List;

public class Product {
    private long id;
    private String name;
    private String description;
    private List<AnimalPart> animalParts;

    public Product(long id, String name, String description, List<AnimalPart> animalParts) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.animalParts = animalParts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AnimalPart> getAnimalParts() {
        return animalParts;
    }

    public void setAnimalParts(List<AnimalPart> animalParts) {
        this.animalParts = animalParts;
    }
}