package com.example.testrestapi.entity;

import org.json.simple.JSONObject;

public class Farm {
    private long id;
    private String name;
    private String location;
    private String description;

    public Farm(long id, String name, String location, String description) {
        this.id = id;
        this.name = name;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*public static Farm getFarmObj(JSONObject jsonObject){
        return new Farm(
                Long.valueOf(jsonObject.get("id").toString()),
                (String) jsonObject.get("name"),
                (String) jsonObject.get("location"),
                (String) jsonObject.get("description"));
    }*/
}
