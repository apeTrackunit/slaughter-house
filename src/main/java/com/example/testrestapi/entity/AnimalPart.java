package com.example.testrestapi.entity;

import org.json.simple.JSONObject;

public class AnimalPart {
    private long id;
    private double weight;
    private Animal animal;


    public AnimalPart(long id, double weight, Animal animal) {
        this.id = id;
        this.weight = weight;
        this.animal = animal;
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

    /*
    public static AnimalPart getAnimalPartObj(JSONObject jsonObject){
        JSONObject jsonAnimal = (JSONObject)jsonObject.get("animal");

        return new AnimalPart(
                Long.valueOf(jsonObject.get("id").toString()),
                Double.valueOf(jsonObject.get("weight").toString()),
                Animal.getAnimalObj(jsonAnimal));

    }
     */
}
