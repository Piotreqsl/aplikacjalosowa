package com.onionv2.aplikacjalosowa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button zakres, moneta, kostka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        zakres = findViewById(R.id.zakres);
        moneta = findViewById(R.id.moneta);
        kostka = findViewById(R.id.kostka);

        zakres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, zakres.class);
                startActivity(intent);
            }
        });

        moneta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moneta.class);
                startActivity(intent);
            }
        });

        kostka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, kostka.class);
                startActivity(intent);
            }
        });


    }
}
