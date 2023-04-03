package com.itch.cartillaanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Recomendaciones extends AppCompatActivity {

    ImageButton btnAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recomendaciones);
        btnAtras = (ImageButton) findViewById(R.id.btnAtras);

        btnAtras.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent login = new Intent(Recomendaciones.this, Home.class);
                startActivity(login);
                finish();
            }
        });
    }
}