package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class shapes extends AppCompatActivity {
PDFView shapes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
        getSupportActionBar().hide();

        shapes=findViewById(R.id.shapespdf);
        shapes.fromAsset("shapes.pdf").load();
    }
}