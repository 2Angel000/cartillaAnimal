package com.itch.cartillaanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    Button btnIniciar, btnRegistrar;
    EditText txtCorreo, txtContra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        btnRegistrar = (Button) findViewById(R.id.btnRegistrarse);

        txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        txtContra = (EditText) findViewById(R.id.txtContra);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            //aquí deberá ir la autentificación de registro
            @Override
            public void onClick(View v) {
                Intent iniciar;
                iniciar = new Intent(Login.this, Home.class);
                startActivity(iniciar);
                finish();
            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrar = new Intent(Login.this, Registro.class);
                startActivity(registrar);
                finish();
            }
        });
    }
}