package com.example.android.finalproject;

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

    public void wisata1(View view) {
        Intent i = new Intent(MainActivity.this, Wisata1.class);
        startActivity(i);
    }

    public void wisata2(View view) {
        Intent i = new Intent(MainActivity.this, Wisata2.class);
        startActivity(i);
    }
}
