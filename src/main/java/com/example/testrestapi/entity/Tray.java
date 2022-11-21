package com.example.testrestapi.entity;

public class Tray {
   private long id;
   private double max_weight;
   private String description;

    public Tray(long id, double max_weight, String description) {
        this.id = id;
        this.max_weight = max_weight;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getMax_weight() {
        return max_weight;
    }

    public void setMax_weight(double max_weight) {
        this.max_weight = max_weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
