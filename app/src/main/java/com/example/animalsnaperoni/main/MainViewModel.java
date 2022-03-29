package com.example.animalsnaperoni.main;

import android.widget.GridView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animalsnaperoni.Animal;
import com.example.animalsnaperoni.AnimalDb;
import com.example.animalsnaperoni.AnimalTileAdapter;
import com.example.animalsnaperoni.R;
import com.example.animalsnaperoni.animalInfo.AnimalInfoActivity;
import com.example.animalsnaperoni.species.SpeciesActivity;

import java.util.LinkedList;
import java.util.Locale;

public class MainViewModel implements SearchView.OnQueryTextListener, AnimalTileAdapter.OnTileClickListener {
    private AppCompatActivity appCompatActivity;

    private GridView gridView;
    private SearchView searchView;

    private AnimalTileAdapter animalTileAdapter;

    public MainViewModel(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    public void init() {
        gridView = appCompatActivity.findViewById(R.id.animalGridView);

        animalTileAdapter = new AnimalTileAdapter(appCompatActivity);
        animalTileAdapter.setData(AnimalDb.getData(), this);

        gridView.setAdapter(animalTileAdapter);

        searchView = appCompatActivity.findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(this);

        appCompatActivity.findViewById(R.id.btn_dog).setOnClickListener((event) -> onSpeciesTagClick("dog"));
        appCompatActivity.findViewById(R.id.btn_cat).setOnClickListener((event) -> onSpeciesTagClick("cat"));
        appCompatActivity.findViewById(R.id.btn_rabbit).setOnClickListener((event) -> onSpeciesTagClick("rabbit"));
        appCompatActivity.findViewById(R.id.btn_fox).setOnClickListener((event) -> onSpeciesTagClick("fox"));
        appCompatActivity.findViewById(R.id.btn_parrot).setOnClickListener((event) -> onSpeciesTagClick("parrot"));
        appCompatActivity.findViewById(R.id.btn_sparrow).setOnClickListener((event) -> onSpeciesTagClick("sparrow"));
    }

    private void onSpeciesTagClick(String species) {
        SpeciesActivity.startActivity(appCompatActivity, species);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String searchText) {
        LinkedList<Animal> animalLinkedList = AnimalDb.getData();
        LinkedList<Animal> filteredAnimalLinkedList = new LinkedList<>();

        if (searchText.equals("")) {
            filteredAnimalLinkedList = animalLinkedList;
        } else {
            String lowercaseSearchText = searchText.toLowerCase();
            for (Animal a : animalLinkedList) {
                if (a.getName().toLowerCase(Locale.ROOT).contains(lowercaseSearchText)) {
                    filteredAnimalLinkedList.add(a);
                }
            }
        }

        animalTileAdapter.setData(filteredAnimalLinkedList, this);
        gridView.setAdapter(animalTileAdapter);
        animalTileAdapter.notifyDataSetChanged();
        return false;
    }

    @Override
    public void onTileClick(Animal animalItem) {
        AnimalInfoActivity.startActivity(appCompatActivity, animalItem.getId());
    }
}
