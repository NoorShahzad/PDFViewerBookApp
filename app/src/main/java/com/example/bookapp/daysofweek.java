package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class daysofweek extends AppCompatActivity {
PDFView days;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daysofweek);
        getSupportActionBar().hide();

        days=findViewById(R.id.dayspdf);
        days.fromAsset("daysofweek.pdf").load();
    }
}