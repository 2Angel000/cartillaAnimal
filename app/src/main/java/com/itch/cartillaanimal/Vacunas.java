package com.itch.cartillaanimal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.itch.cartillaanimal.RecycleVacunas.ListAdapterVacunas;
import com.itch.cartillaanimal.RecycleVacunas.ListElementVacunas;

import java.util.ArrayList;
import java.util.List;

public class Vacunas extends AppCompatActivity {

    List<ListElementVacunas> elements;
    Button btnAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacunas);
        btnAtras = findViewById(R.id.btnAtras);

        init();

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Vacunas.this, "Atras", Toast.LENGTH_SHORT).show();
                Intent home = new Intent(Vacunas.this, Home.class);
                startActivity(home);
                finish();
            }
        });
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElementVacunas("Hachicko"));
        elements.add(new ListElementVacunas("Bessie"));
        elements.add(new ListElementVacunas("Benito"));

        ListAdapterVacunas listAdapter = new ListAdapterVacunas(elements,this);
        RecyclerView recyclerView = findViewById(R.id.listReciclerViewVacunas);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}