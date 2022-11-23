package com.example.testrestapi.entity;

import org.json.simple.JSONObject;

import java.util.ArrayList;

public class AnimalType {
    private long id;
    private String name;
    private String description;

    public AnimalType(long id, String name, String description) {
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

    /*public static AnimalType getAnimalTypeObj(JSONObject jsonObject){
        return new AnimalType(
                Long.valueOf(jsonObject.get("id").toString()),
                (String) jsonObject.get("name"),
                (String) jsonObject.get("description"));
    }*/
}
