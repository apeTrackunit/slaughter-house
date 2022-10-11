package com.example.testrestapi.entity;

import java.sql.Date;

public class Animal {
    private long id;
    private long weight;
    private boolean isOk;
    private Farm farm;
    private AnimalType type;
    private String registrationDate;

    public Animal(long id, long weight, boolean isOk, Farm farm, AnimalType type, String registrationDate) {
        this.id = id;
        this.weight = weight;
        this.isOk = isOk;
        this.farm = farm;
        this.type = type;
        this.registrationDate = registrationDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }
}
