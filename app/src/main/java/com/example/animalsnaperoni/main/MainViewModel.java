package com.example.animalsnaperoni.main;

import android.content.Context;
import android.widget.GridView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.animalsnaperoni.Animal;
import com.example.animalsnaperoni.AnimalDatabase;
import com.example.animalsnaperoni.AnimalTileAdapter;
import com.example.animalsnaperoni.R;
import com.example.animalsnaperoni.animalInfo.AnimalInfoActivity;
import com.example.animalsnaperoni.species.SpeciesActivity;
import java.util.LinkedList;
import java.util.Locale;



public class MainViewModel implements SearchView.OnQueryTextListener, AnimalTileAdapter.OnTileClickListener {

    private AppCompatActivity appCompatActivity;

    // Variables for View
    private GridView gridView;
    private SearchView searchView;

    private AnimalTileAdapter animalTileAdapter;


    // Constructor Method
    public MainViewModel(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    // Initialising Method
    public void init() {
        gridView = appCompatActivity.findViewById(R.id.animalGridView);

        animalTileAdapter = new AnimalTileAdapter(appCompatActivity);
        animalTileAdapter.setData(AnimalDatabase.getData(), this);

        gridView.setAdapter(animalTileAdapter);

        searchView = appCompatActivity.findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(this);


        //Linking the Species Tag to their respective photos i.e Dog, Cat, Rabbit
        appCompatActivity.findViewById(R.id.btn_dog).setOnClickListener((event) -> onSpeciesTagClick("dog"));
        appCompatActivity.findViewById(R.id.btn_cat).setOnClickListener((event) -> onSpeciesTagClick("cat"));
        appCompatActivity.findViewById(R.id.btn_rabbit).setOnClickListener((event) -> onSpeciesTagClick("rabbit"));
        appCompatActivity.findViewById(R.id.btn_fox).setOnClickListener((event) -> onSpeciesTagClick("fox"));
        appCompatActivity.findViewById(R.id.btn_parrot).setOnClickListener((event) -> onSpeciesTagClick("parrot"));
        appCompatActivity.findViewById(R.id.btn_sparrow).setOnClickListener((event) -> onSpeciesTagClick("sparrow"));

        appCompatActivity.findViewById(R.id.imgOfTheDay).setOnClickListener((event) -> onSpeciesTagClick("Photo of the Day"));
    }

    private void onSpeciesTagClick(String species) {
        SpeciesActivity.startActivity(appCompatActivity, species);
    }

    // this will be empty because there is no submit button in the Search View
    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }


    // This is what happens when user is typing in the Search View
    @Override
    public boolean onQueryTextChange(String searchText) {

        // Getting the data from Animal Linked List
        LinkedList<Animal> animalLinkedList = AnimalDatabase.getData();

        // Created a new Linked List for displaying animals upon search
        LinkedList<Animal> filteredAnimalLinkedList = new LinkedList<>();

        // Will add the animals to the new Linked List i.e if you search for Bengal Cat, it gets added to the new List
        if (searchText.equals("")) {
            filteredAnimalLinkedList = animalLinkedList;
        }
        else {
            String lowercaseSearchText = searchText.toLowerCase();
            for (Animal a : animalLinkedList) {
                if (a.getSpecies().toLowerCase(Locale.ROOT).contains(lowercaseSearchText) || a.getName().toLowerCase(Locale.ROOT).contains(lowercaseSearchText)) {
                    filteredAnimalLinkedList.add(a);
                }
            }
        }
//                if filtered is empty that means that user's search was not apart of any animal or species we have, so alert user
        if(filteredAnimalLinkedList.size() == 0) {
            Context context = appCompatActivity.getApplicationContext();
            CharSequence text = "Sorry! This species is not supported.";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
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
