package com.example.android.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Wisata1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tempatwisata1);
    }

    public void sebelumnya(View view){
        Intent i = new Intent(Wisata1.this, MainActivity.class);
        startActivity(i);
    }

    public void selanjutnya(View view){
        Intent i = new Intent(Wisata1.this, Wisata2.class);
        startActivity(i);
    }
}
