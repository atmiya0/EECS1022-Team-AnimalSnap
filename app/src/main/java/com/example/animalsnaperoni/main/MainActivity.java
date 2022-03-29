package com.example.animalsnaperoni.main;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.animalsnaperoni.AnimalDatabase;
import com.example.animalsnaperoni.R;



public class MainActivity extends AppCompatActivity {
    private MainViewModel mainViewModel = new MainViewModel(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnimalDatabase.init();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainViewModel.init();
    }
}