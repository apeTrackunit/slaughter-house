package com.example.testrestapi.entity;

public class AnimalPartInput {
    private Long trayId;
    private Long animalId;
    private Long weight;
    private Long animalPartTypeId;

    public AnimalPartInput(Long trayId, Long animalId, Long weight, Long animalPartTypeId) {
        this.trayId = trayId;
        this.animalId = animalId;
        this.weight = weight;
        this.animalPartTypeId = animalPartTypeId;
    }

    public Long getTrayId() {
        return trayId;
    }

    public void setTrayId(Long trayId) {
        this.trayId = trayId;
    }

    public Long getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Long animalId) {
        this.animalId = animalId;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getAnimalPartTypeId() {
        return animalPartTypeId;
    }

    public void setAnimalPartTypeId(Long animalPartTypeId) {
        this.animalPartTypeId = animalPartTypeId;
    }
}
