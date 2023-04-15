package com.example.homework_4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button agha;
    Button shura;
    Button pryanic;
    Button muller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agha = findViewById(R.id.agha);
        shura = findViewById(R.id.shura);
        pryanic = findViewById(R.id.pryanic);
        muller = findViewById(R.id.muller);

        agha.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), AghaActivity.class);
            startActivity(intent);

        });

        shura.setOnClickListener(v -> {
            Intent intent = new Intent(this, ShuraActivity.class);
            startActivity(intent);
        });

        pryanic.setOnClickListener(v -> {
            Intent intent = new Intent(this, PryanicActivity.class);
            startActivity(intent);
        });

        muller.setOnClickListener(v -> {
            Intent intent = new Intent(this, MullerActivity.class);
            startActivity(intent);
        });
    }
}