package org.example.task4;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private String species;
    private Double weight;

    public Cat(String name, String species, Double weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight + " kg" +
                '}';
    }
}
