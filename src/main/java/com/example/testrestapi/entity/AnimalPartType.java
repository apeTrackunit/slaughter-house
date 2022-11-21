package com.example.testrestapi.entity;

import java.util.ArrayList;

public class AnimalPartType {
    private long id;
    private String name;
    private String description;
    private ArrayList<Tray> tray;
    private ArrayList<AnimalPart> animalParts;

    public ArrayList<Tray> getTray() {
        return tray;
    }

    public void setTray(ArrayList<Tray> tray) {
        this.tray = tray;
    }

    public ArrayList<AnimalPart> getAnimalParts() {
        return animalParts;
    }

    public void setAnimalParts(ArrayList<AnimalPart> animalParts) {
        this.animalParts = animalParts;
    }

    public AnimalPartType(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

}
