package com.example.animalsnaperoni.animalInfo;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animalsnaperoni.Animal;
import com.example.animalsnaperoni.AnimalDb;
import com.example.animalsnaperoni.R;

public class AnimalInfoViewModel {
    private AppCompatActivity appCompatActivity;

    private ImageView imgAnimal;
    private TextView txtTitle;
    private TextView txtDesc;

    public AnimalInfoViewModel(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    public void init() {
        imgAnimal = appCompatActivity.findViewById(R.id.imgAnimal);
        txtTitle = appCompatActivity.findViewById(R.id.txtTitle);
        txtDesc = appCompatActivity.findViewById(R.id.txtDesc);
        appCompatActivity.findViewById(R.id.img_back).setOnClickListener((action) -> appCompatActivity.onBackPressed());
    }

    public void setAnimal(String animalId) {
        Animal animal = null;
        System.out.println("search: " + animalId);
        for (Animal a : AnimalDb.getData()) {
            System.out.println("match with: " + a.getId());
            if (a.getId().equals(animalId)) {
                animal = a;
                break;
            }
        }
        if (animal != null) {
            imgAnimal.setImageResource(animal.getImages());
            txtTitle.setText(animal.getName());
            txtDesc.setText(animal.getDescriptions());

        }
    }
}
