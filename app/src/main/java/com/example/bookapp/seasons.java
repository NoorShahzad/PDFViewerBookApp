package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class seasons extends AppCompatActivity {
PDFView seasons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons);
        getSupportActionBar().hide();

        seasons=findViewById(R.id.seasonspdf);
        seasons.fromAsset("seasons.pdf").load();

    }
}