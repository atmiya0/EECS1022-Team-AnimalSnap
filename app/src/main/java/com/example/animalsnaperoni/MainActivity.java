package com.example.animalsnaperoni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {

    ImageButton myImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       myImageButton = (ImageButton) findViewById(R.id.germanShepherd);


       myImageButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intentChangePage = new Intent(MainActivity.this, animal_info.class);
               startActivity(intentChangePage);
           }
       });



    }


}