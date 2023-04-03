package com.itch.cartillaanimal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Mascotas extends AppCompatActivity {

    List<ListElement> elements;
    Button btnAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas);
        btnAtras = findViewById(R.id.btnAtras);
        init();

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Mascotas.this, "Atras", Toast.LENGTH_SHORT).show();
                Intent home = new Intent(Mascotas.this, Home.class);
                startActivity(home);
                finish();
            }
        });
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("Nombre: Hachicko","Tipo: Perro","Edad: 6 Meses","Peso: 6.4 Kg"));
        elements.add(new ListElement("Nombre: Bessie","Tipo: Conejo","Edad: 2 Años","Peso: 1.4 Kg"));
        elements.add(new ListElement("Nombre: Benito","Tipo: Gato","Edad: 1 mes","Peso: 700g"));

        ListAdapter listAdapter = new ListAdapter(elements,this);
        RecyclerView recyclerView = findViewById(R.id.listReciclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);

    }
}