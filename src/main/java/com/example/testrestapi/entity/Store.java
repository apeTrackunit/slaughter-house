package com.example.testrestapi.entity;

import java.util.ArrayList;

public class Store {
    private long id;
    private String name;
    private String location;
    private String description;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    private ArrayList<Product> products;

    public Store(long id, String name, String location, String description, ArrayList<Product> products) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.products=products;
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
}
