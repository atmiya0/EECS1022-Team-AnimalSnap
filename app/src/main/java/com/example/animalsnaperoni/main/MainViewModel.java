package com.example.animalsnaperoni.main;

import android.widget.GridView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animalsnaperoni.Animal;
import com.example.animalsnaperoni.AnimalTemp;
import com.example.animalsnaperoni.R;

import java.util.LinkedList;

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
        animalTileAdapter.setData(AnimalTemp.getData(), this);

        gridView.setAdapter(animalTileAdapter);

        searchView = appCompatActivity.findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(this);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String searchText) {
        LinkedList<Animal> animalLinkedList = AnimalTemp.getData();
        LinkedList<Animal> filteredAnimalLinkedList = new LinkedList<>();

        if (searchText.equals("")) {
            filteredAnimalLinkedList = animalLinkedList;
        } else {
            for (Animal a : animalLinkedList) {
                if (a.getName().startsWith(searchText)) {
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

    }
}
