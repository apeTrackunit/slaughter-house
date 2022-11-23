package com.example.testrestapi.entity;

import org.json.simple.JSONObject;

public class AnimalPart {
    private long id;
    private double weight;
    private Animal animal;
    private Tray tray;
    private AnimalPartType type;
    private Product product;

    public AnimalPart(long id, double weight, Animal animal, Product product, Tray tray, AnimalPartType type) {
        this.id = id;
        this.weight = weight;
        this.animal = animal;
        this.product = product;
        this.tray = tray;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Tray getTray() {
        return tray;
    }

    public void setTray(Tray tray) {
        this.tray = tray;
    }

    public AnimalPartType getType() {
        return type;
    }

    public void setType(AnimalPartType type) {
        this.type = type;
    }
}
