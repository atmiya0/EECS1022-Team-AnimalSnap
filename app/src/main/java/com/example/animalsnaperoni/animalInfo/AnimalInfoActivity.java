package com.example.animalsnaperoni.animalInfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.animalsnaperoni.Animal;
import com.example.animalsnaperoni.R;



public class AnimalInfoActivity extends AppCompatActivity {
    private static String ANIMAL_ID_KEY = "ANIMAL_ID_KEY";

    private AnimalInfoViewModel animalInfoViewModel = new AnimalInfoViewModel(this);

    public static void startActivity(AppCompatActivity appCompatActivity, String animalId) {
        Intent intent = new Intent(appCompatActivity, AnimalInfoActivity.class);
        intent.putExtra(ANIMAL_ID_KEY, animalId);
        appCompatActivity.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_info);
        animalInfoViewModel.init();
        animalInfoViewModel.setAnimal(getIntent().getStringExtra(ANIMAL_ID_KEY));

        ActivityCompat.requestPermissions(AnimalInfoActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
        ActivityCompat.requestPermissions(AnimalInfoActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1);

    }

}