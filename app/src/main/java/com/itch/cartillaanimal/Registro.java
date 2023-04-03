package com.itch.cartillaanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    Button btnRegistrarse;
    ImageButton btnAtras;
    EditText txtCorreo, txtContra, txtConfirmarContra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);
        btnAtras = (ImageButton) findViewById(R.id.btnAtras);
        txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        txtContra = (EditText) findViewById(R.id.txtContra);
        txtConfirmarContra = (EditText) findViewById(R.id.txtConfirmarContra);

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí se mandará el registros a la BD
                Toast.makeText(Registro.this, "Registradoa sjasjasjaj", Toast.LENGTH_SHORT).show();

                //Aquí irá la validación de si se registró correctamente
                    Intent iniciar;
                    iniciar = new Intent(Registro.this, RegistroUsuario.class);
                    startActivity(iniciar);
                    finish();
            }
        });

        btnAtras.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Registro.this, "Atras", Toast.LENGTH_SHORT).show();
                Intent login = new Intent(Registro.this, Login.class);
                startActivity(login);
                finish();
            }
        });
    }


}