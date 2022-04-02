package com.example.animalsnaperoni.species;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animalsnaperoni.R;
import com.example.animalsnaperoni.animalInfo.AnimalInfoActivity;

public class SpeciesActivity extends AppCompatActivity {
    private static String SPECIES_STRING_KEY = "SPECIES_STRING_KEY";
    SpeciesViewModel speciesViewModel = new SpeciesViewModel(this);

    public static void startActivity(AppCompatActivity appCompatActivity, String species) {
        Intent intent = new Intent(appCompatActivity, SpeciesActivity.class);
        intent.putExtra(SPECIES_STRING_KEY, species);
        appCompatActivity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_species);
        speciesViewModel.init();
        speciesViewModel.setAnimalsDataBySpecies(getIntent().getStringExtra(SPECIES_STRING_KEY));
    }
}