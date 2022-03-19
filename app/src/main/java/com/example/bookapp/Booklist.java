package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Booklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist);
        getSupportActionBar().hide();
        CardView cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8;
        cv1=findViewById(R.id.cv1);
        cv2=findViewById(R.id.cv2);
        cv3=findViewById(R.id.cv3);
        cv4=findViewById(R.id.cv4);
        cv5=findViewById(R.id.cv5);
        cv6=findViewById(R.id.cv6);
        cv7=findViewById(R.id.cv7);
        cv8=findViewById(R.id.cv8);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Booklist.this, colors.class);
                startActivity(i);
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Booklist.this, counting.class);
                startActivity(i);
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Booklist.this, daysofweek.class);
                startActivity(i);
            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Booklist.this, partsofbody.class);
                startActivity(i);
            }
        });
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Booklist.this, seasons.class);
                startActivity(i);
            }
        });
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Booklist.this, shapes.class);
                startActivity(i);
            }
        });
        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Booklist.this, weather.class);
                startActivity(i);
            }
        });
        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Booklist.this, animals.class);
                startActivity(i);
            }
        });
    }
}