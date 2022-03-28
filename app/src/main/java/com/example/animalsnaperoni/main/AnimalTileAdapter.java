package com.example.animalsnaperoni.main;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.animalsnaperoni.Animal;

import java.util.LinkedList;

public class AnimalTileAdapter extends BaseAdapter {
    private Context context;
    private LinkedList<Animal> animalLinkedList;
    private OnTileClickListener onTileClickListener;

    public interface OnTileClickListener {
        void onTileClick(Animal animalItem);
    }

    // Constructor
    public AnimalTileAdapter(Context c) {
        context = c;
    }

    public void setData(LinkedList<Animal> animalLinkedList, OnTileClickListener onTileClickListener) {
        this.animalLinkedList = animalLinkedList;
        this.onTileClickListener = onTileClickListener;
    }

    @Override
    public int getCount() {
        return animalLinkedList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (view == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(450, 450));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) view;
        }
        Animal animalItem = animalLinkedList.get(i);
        imageView.setOnClickListener((action) -> onTileClickListener.onTileClick(animalItem));
        imageView.setImageResource(animalItem.getImages());
        return imageView;
    }
}
