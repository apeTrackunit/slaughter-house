package com.example.testrestapi.entity;

public class Order {
    private long id;
    private String description;
    private boolean available;
    private double amount;

    public Order(long id, String description, boolean available, double amount) {
        this.id = id;
        this.description = description;
        this.available = available;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
