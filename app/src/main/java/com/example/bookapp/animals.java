package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class animals extends AppCompatActivity {
PDFView animals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        getSupportActionBar().hide();

        animals=findViewById(R.id.animalspdf);
        animals.fromAsset("animals.pdf").load();
    }
}