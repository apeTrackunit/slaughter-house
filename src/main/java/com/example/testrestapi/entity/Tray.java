package com.example.testrestapi.entity;

import java.util.ArrayList;

public class Tray {
   private long id;
   private double maxWeight;
   private String description;
   private ArrayList<AnimalPart> animalParts;

    public Tray(long id, double max_weight, String description) {
        this.id = id;
        this.maxWeight = max_weight;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getMax_weight() {
        return maxWeight;
    }

    public void setMax_weight(double max_weight) {
        this.maxWeight = max_weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
