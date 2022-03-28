package com.example.animalsnaperoni;

public class Animal {
    private int images;
    private String names;
    private String descriptions;
    private String species;
    private String origin;
    private int population;

    public Animal(int images, String names, String descriptions, String species, String origin, int population) {
        this.images = images;
        this.names = names;
        this.descriptions = descriptions;
        this.species = species;
        this.origin = origin;
        this.population = population;
    }

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
}
