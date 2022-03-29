package com.example.animalsnaperoni.species;

import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animalsnaperoni.Animal;
import com.example.animalsnaperoni.AnimalDatabase;
import com.example.animalsnaperoni.R;
import com.example.animalsnaperoni.animalInfo.AnimalInfoActivity;
import com.example.animalsnaperoni.AnimalTileAdapter;

import java.util.LinkedList;

public class SpeciesViewModel implements AnimalTileAdapter.OnTileClickListener {
    private AppCompatActivity appCompatActivity;

    private GridView gridView;
    private TextView txtTitle;

    public SpeciesViewModel(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    public void init() {
        gridView = appCompatActivity.findViewById(R.id.animalGridView);
        txtTitle = appCompatActivity.findViewById(R.id.txtTitle);
        appCompatActivity.findViewById(R.id.img_back).setOnClickListener((action) -> appCompatActivity.onBackPressed());
    }

    public void setAnimalsDataBySpecies(String species) {
        txtTitle.setText(species);
        LinkedList<Animal> animalsList = getAnimalsFilteredBySpecies(species);
        AnimalTileAdapter animalTileAdapter = new AnimalTileAdapter(appCompatActivity);
        animalTileAdapter.setData(animalsList, this);
        gridView.setAdapter(animalTileAdapter);
    }

    private LinkedList<Animal> getAnimalsFilteredBySpecies(String species) {
        LinkedList<Animal> animalLinkedList = AnimalDatabase.getData();
        LinkedList<Animal> filteredAnimalLinkedList = new LinkedList<>();

        if (species.equals("")) {
            filteredAnimalLinkedList = animalLinkedList;
        } else {
            String lowercaseSpeciesText = species.toLowerCase();
            for (Animal a : animalLinkedList) {
                if (a.getSpecies().toLowerCase().equals(lowercaseSpeciesText)) {
                    filteredAnimalLinkedList.add(a);
                }
            }
        }

        return filteredAnimalLinkedList;
    }

    @Override
    public void onTileClick(Animal animalItem) {
        AnimalInfoActivity.startActivity(appCompatActivity, animalItem.getId());
    }
}
