package com.example.planit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.planit.databinding.ActivityMainBinding;

public class MenuActivity extends AppCompatActivity {

    Button eventos;
    Button misEventos;
    Button contacto;
    Button configuracion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        eventos=(Button)findViewById(R.id.eventosMain);
        misEventos=(Button)findViewById(R.id.misEventosMain);
        configuracion=(Button)findViewById(R.id.configuracionMain);
        contacto=(Button)findViewById(R.id.contactosMain);


        eventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        misEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mi = new Intent(MenuActivity.this, MisEventosActivity.class );
                startActivity(mi);
            }
        });

        configuracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent con = new Intent(MenuActivity.this, ConfiguracionActivity.class);
                startActivity(con);
            }
        });

        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conta = new Intent(MenuActivity.this, ContactoActivity.class);
                startActivity(conta);
            }
        });

    }


}