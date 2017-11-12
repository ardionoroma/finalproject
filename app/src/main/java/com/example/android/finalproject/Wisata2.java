package com.example.android.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Wisata2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tempatwisata2);
    }

    public void sebelumnya(View view){
        Intent i = new Intent(Wisata2.this, Wisata1.class);
        startActivity(i);
    }

    public void selanjutnya(View view){
        Intent i = new Intent(Wisata2.this, MainActivity.class);
        startActivity(i);
    }
}
