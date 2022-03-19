package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class counting extends AppCompatActivity {
PDFView counting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counting);
        getSupportActionBar().hide();

        counting=findViewById(R.id.countingpdf);
        counting.fromAsset("counting.pdf").load();
    }
}