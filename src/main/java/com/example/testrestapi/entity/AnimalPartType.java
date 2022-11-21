package com.example.testrestapi.entity;

public class AnimalPartType {
    private long id;
    private String name;
    private String description;
    private Tray traId;

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

    public Tray getTraId() {
        return traId;
    }

    public void setTraId(Tray traId) {
        this.traId = traId;
    }
}
