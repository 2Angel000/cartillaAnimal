package com.itch.cartillaanimal.Cartillas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.itch.cartillaanimal.Home;
import com.itch.cartillaanimal.R;
import com.itch.cartillaanimal.Recordar;

public class CartillaGato extends AppCompatActivity {

    Button btnAtras, btnRecordatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartilla_gato);
        btnRecordatorio = findViewById(R.id.btnRecordatorio);
        btnAtras = findViewById(R.id.btnAtras);

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atras;
                atras = new Intent(CartillaGato.this, Home.class);
                startActivity(atras);
                finish();
            }
        });

        btnRecordatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recordatorio;
                recordatorio = new Intent(CartillaGato.this, Recordar.class);
                startActivity(recordatorio);
                finish();
            }
        });
    }
}