package com.onionv2.aplikacjalosowa;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class zakres extends AppCompatActivity {

    Button generuj;
    EditText up, down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakres);

        generuj = findViewById(R.id.generuj);
        up = findViewById(R.id.up);
        down= findViewById(R.id.down);

        generuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberDown = Integer.parseInt(down.getText().toString());
                int numberUp = Integer.parseInt(up.getText().toString());
                Random r = new Random();
                Toast.makeText(getApplicationContext(),"Liczba to " +  (r.nextInt(numberUp -numberDown +1) + numberDown), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
