package com.itch.cartillaanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    TextView usuario;
    Button btnMascotas, btnInfoVacunas, btnRecomendaciones, btnAcercaDe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        usuario = (TextView) findViewById(R.id.lbl_usuario);
        btnMascotas = (Button) findViewById(R.id.btnMascotas);
        btnInfoVacunas = (Button) findViewById(R.id.btnInfoVacunas);
        btnRecomendaciones = (Button) findViewById(R.id.btnRecomendaciones);
        btnAcercaDe = (Button) findViewById(R.id.btnAcercaDe);


        usuario.setText("Maria de Jesús");

        btnMascotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mascotas;
                mascotas = new Intent(Home.this, Mascotas.class);
                startActivity(mascotas);
                finish();
            }
        });

        btnInfoVacunas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vacunas;
                vacunas = new Intent(Home.this, Vacunas.class);
                startActivity(vacunas);
                finish();
            }
        });

        btnRecomendaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recomendaciones;
                recomendaciones = new Intent(Home.this, Recomendaciones.class);
                startActivity(recomendaciones);
                finish();
            }
        });

        btnAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acercaDe;
                acercaDe = new Intent(Home.this, AcercaDe.class);
                startActivity(acercaDe);
                finish();
            }
        });
    }
}