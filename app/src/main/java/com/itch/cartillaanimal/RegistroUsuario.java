package com.itch.cartillaanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class RegistroUsuario extends AppCompatActivity {

    ImageButton btnAtras,btnSiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
        btnAtras = (ImageButton) findViewById(R.id.btnAtras);
        btnSiguiente = (ImageButton) findViewById(R.id.btnSiguiente);

        btnAtras.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(RegistroUsuario.this, "Atras", Toast.LENGTH_SHORT).show();
                Intent login = new Intent(RegistroUsuario.this, Login.class);
                startActivity(login);
                finish();
            }
        });

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistroUsuario.this, "Siguiente", Toast.LENGTH_SHORT).show();
                Intent registroMascotas = new Intent(RegistroUsuario.this, RegistroMascotas.class);
                startActivity(registroMascotas);
                finish();
            }
        });
    }
}