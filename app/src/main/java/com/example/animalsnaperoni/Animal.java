package com.example.animalsnaperoni;

import java.util.UUID;

public class Animal {

    // Defining variabes (Attributes of animals)
    private String id;
    private int images;
    private String names;
    private String descriptions;
    private String species;
    private String origin;
    private int population;

    // The Constructor Method for Animal
    public Animal(int images, String names, String descriptions, String species, String origin, int population) {
        id = UUID.randomUUID().toString();
        this.images = images;
        this.names = names;
        this.descriptions = descriptions;
        this.species = species;
        this.origin = origin;
        this.population = population;
    }

    // Getter Methods
    public int getImages() {
        return images;
    }

    public String getName() {
        return names;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public String getSpecies() {
        return species;
    }

    public String getOrigin() {
        return origin;
    }

    public int getPopulation() {
        return population;
    }

    public String getId() {
        return id;
    }
}
