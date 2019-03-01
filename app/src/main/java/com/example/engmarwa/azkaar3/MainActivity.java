package com.example.engmarwa.azkaar3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nom(View view) {
        Intent i=new Intent(MainActivity.this,Alnom.class);
        startActivity(i);
    }


    public void ale(View view) {
        Intent i=new Intent(MainActivity.this,Ale.class);
        startActivity(i);

    }

    public void sabah(View view) {
        Intent i=new Intent(MainActivity.this, Sabah.class);
        startActivity(i);

    }

    public void masa(View view) {
        Intent i=new Intent(MainActivity.this, Masa.class);
        startActivity(i);
    }
}
