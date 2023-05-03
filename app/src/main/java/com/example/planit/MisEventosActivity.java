package com.example.planit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MisEventosActivity extends AppCompatActivity {

    Button cartel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_eventos);

        cartel=(Button) findViewById(R.id.button3);
    }
}