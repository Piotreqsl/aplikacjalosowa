package com.onionv2.aplikacjalosowa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class moneta extends AppCompatActivity {

    Button losuj;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moneta);

        losuj = findViewById(R.id.losuj);
        imageView= findViewById(R.id.imageView);

        losuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number = random.nextInt(2);
                if(number == 1) imageView.setImageResource(R.drawable.reszka);
                else imageView.setImageResource(R.drawable.orzel);

            }
        });
    }
}
