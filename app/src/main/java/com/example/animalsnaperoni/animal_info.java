package com.example.animalsnaperoni;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.animalsnaperoni.main.MainViewModel;

public class animal_info extends AppCompatActivity implements View.OnClickListener {
    private Button downloadButton;
    boolean clicked=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        private ActivityMainBinding binding;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_info);

//        downloadButton = findViewById(R.id.download);
//        downloadButton.setOnClickListener((View.OnClickListener) this); error
        downloadButton.setOnClickListener(this);

//        gets permission to download file from user
//        <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"></uses-permission>
        ActivityCompat.requestPermissions(animal_info.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
        ActivityCompat.requestPermissions(animal_info.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1);
    }

    @Override
    public void onClick(View view) {

    }


    /*@Override
    public void onClick(View view) {
        Log.d("tag", "in onclick");

        // Do something in response to button click, each switch case is for a different button
        switch (view.getId()) {

            case R.id.download:
                // Do something
                System.out.println("got into correct case");
                Log.d("tag", "got in siwtch");


                ImageView myImage = (ImageView) findViewById(R.id.imageView);
                int id = Integer.parseInt((String)myImage.getTag());
                AnimalTemp animals = new AnimalTemp();
                int[] images = animals.images;

//              takes integer into drawable
                Drawable drawableImg = getResources().getDrawable(images[id]);

                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawableImg;
                Bitmap bitmap = bitmapDrawable.getBitmap();

////                try (FileOutputStream out = new FileOutputStream(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsoluteFile())) {
////                    try (FileOutputStream out = new FileOutputStream(Environment.getExternalStoragePublicDirectory(Environment.))) {
////                    Log.d("tag", "getting right folder?");
//                    bitmap.compress(Bitmap.Co,mpressFormat.PNG, 100, out); // bmp is your Bitmap instance
//                    // PNG is a lossless format, the compression factor (100) is ignored
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }

//                FileOutputStream outputStream = null;
//                File file = Environment.getExternalStorageDirectory();
//                File dir = new File(file.getAbsolutePath() + "/MyPics");
//                dir.mkdirs();
//
//                String filename = String.format("%d.png",System.currentTimeMillis());
//                File outFile = new File(dir,filename);
//                try{
//                    outputStream = new FileOutputStream(outFile);
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//                bitmap.compress(Bitmap.CompressFormat.PNG,100,outputStream);
//                try{
//                    outputStream.flush();
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//                try{
//                    outputStream.close();
//                }
//                catch (Exception e){
//                    e.printStackTrace();
//                }
//                =========
//                File outputfile = new File(String.valueOf(animals.images[0]));
//                File outputfile = new File("saved.png");
//                ImageIO.write(bi, "png", outputfile);

        }
    }*/
//    private View.OnClickListener downloadImage = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Log.d("tag", "in onclick");
//
//            // Do something in response to button click, each switch case is for a different button
//            switch (view.getId()) {
//
//                case R.id.download:
//                    // Do something
//                    System.out.println("got into correct case");
//                    Log.d("tag", "got in siwtch");
//
//
//                    ImageView myImage = (ImageView) findViewById(R.id.imageView);
//                    int id = (int) myImage.getTag();
//                    Animal animals = new Animal();
//                    int[] images = animals.images;
//
//
//                    Drawable drawableImg = getResources().getDrawable(images[id]);
//                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawableImg;
//                    Bitmap bitmap = bitmapDrawable.getBitmap();
//
//                    FileOutputStream outputStream = null;
//                    File file = Environment.getExternalStorageDirectory();
//                    File dir = new File(file.getAbsolutePath() + "/MyPics");
//                    dir.mkdirs();
//
//                    String filename = String.format("%d.png",System.currentTimeMillis());
//                    File outFile = new File(dir,filename);
//                    try{
//                        outputStream = new FileOutputStream(outFile);
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//                    bitmap.compress(Bitmap.CompressFormat.PNG,100,outputStream);
//                    try{
//                        outputStream.flush();
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//                    try{
//                        outputStream.close();
//                    }
//                    catch (Exception e){
//                        e.printStackTrace();
//                    }
////                File outputfile = new File(String.valueOf(animals.images[0]));
////                File outputfile = new File("saved.png");
////                ImageIO.write(bi, "png", outputfile);
//
//            }
//        }
//    };
//    if(clicked) {
//         Log.d("tag","CLICKED+++++++++++");
//    }
//    public void downloadImage(View view) {
////
//
//    }
}