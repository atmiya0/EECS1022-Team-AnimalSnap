package com.example.animalsnaperoni.animalInfo;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animalsnaperoni.Animal;
import com.example.animalsnaperoni.AnimalDatabase;
import com.example.animalsnaperoni.R;

public class AnimalInfoViewModel {
    private AppCompatActivity appCompatActivity;

    // Variables for Animal Attributes to display on the info screen
    private ImageView imgAnimal;
    private TextView txtTitle;
    private TextView txtDesc;
    private TextView species;
    private TextView origin;
    private TextView population;

    // Constructor Method
    public AnimalInfoViewModel(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    // Init Method
    public void init() {
        imgAnimal = appCompatActivity.findViewById(R.id.imgAnimal);
        txtTitle = appCompatActivity.findViewById(R.id.txtTitle);
        txtDesc = appCompatActivity.findViewById(R.id.txtDesc);
        species = appCompatActivity.findViewById(R.id.species);
        origin = appCompatActivity.findViewById(R.id.origin);
        population = appCompatActivity.findViewById(R.id.population);

        appCompatActivity.findViewById(R.id.img_back).setOnClickListener((action) -> appCompatActivity.onBackPressed());
    }

    // Fetching the Animal Info from the AnimalDatabase.java
    public void setAnimal(String animalId) {
        Animal animal = null;
//        System.out.println("search: " + animalId);
        for (Animal a : AnimalDatabase.getData()) {
//            System.out.println("match with: " + a.getId());
            if (a.getId().equals(animalId)) {
                animal = a;
                break;
            }
        }
        if (animal != null) {
            imgAnimal.setImageResource(animal.getImages());
            txtTitle.setText(animal.getName());
            txtDesc.setText(animal.getDescriptions());
            species.setText("Species: "+animal.getSpecies());
            origin.setText("Origin: "+animal.getOrigin());
            population.setText(String.valueOf("Population: "+animal.getPopulation()));
        }
    }
}
