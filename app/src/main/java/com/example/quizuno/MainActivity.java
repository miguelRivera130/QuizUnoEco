package com.example.quizuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private Button registrarte;
    private TextView registrosRealizados;
    private String datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrarte = findViewById(R.id.registrar);
        registrosRealizados = findViewById(R.id.registros);

        String resultado = getIntent().getExtras().getString("resultado");
        String nombre = getIntent().getExtras().getString("datoNombre");
        String id = getIntent().getExtras().getString("datoId");
        Boolean activar = getIntent().getExtras().getBoolean("activar");

        datos =nombre + ":" + " " + resultado;

        if(activar == true) {

            SharedPreferences sharedPreferences = getSharedPreferences("datosGuardados", MODE_PRIVATE);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("datos", datos);
            edit.commit();

        }

        registrarte.setOnClickListener(

                (v)->{

                    Intent i = new Intent(this,Registro.class);
                    startActivity(i);

                }

        );
    }
}