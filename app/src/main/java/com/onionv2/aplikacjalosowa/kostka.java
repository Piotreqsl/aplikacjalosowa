package com.onionv2.aplikacjalosowa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class kostka extends AppCompatActivity {


    ImageView kostka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kostka);

        kostka = findViewById(R.id.kostka);

        findViewById(R.id.rzut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();

                int number = r.nextInt(6)+1;

                switch(number) {
                    case 1:
                        kostka.setImageResource(R.drawable.k1);
                        break;
                    case 2:
                        kostka.setImageResource(R.drawable.k2);
                        break;
                    case 3:
                        kostka.setImageResource(R.drawable.k3);
                        break;
                    case 4:
                        kostka.setImageResource(R.drawable.k4);
                        break;
                    case 5:
                        kostka.setImageResource(R.drawable.k5);
                        break;
                    case 6:
                        kostka.setImageResource(R.drawable.k6);
                        break;

                }

                Toast.makeText(getApplicationContext(),"Liczba to " +  number, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
