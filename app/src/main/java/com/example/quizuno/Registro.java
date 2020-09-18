package com.example.quizuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    private Button contuniarUno;
    private EditText nombres;
    private EditText id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        contuniarUno = findViewById(R.id.continuar);
        nombres = findViewById(R.id.nombre);
        id = findViewById(R.id.identificacion);

        contuniarUno.setOnClickListener(

                (v)->{

                    String nombre = nombres.getText().toString();
                    String identificacion = id.getText().toString();

                    Intent i = new Intent(this,NexoUno.class);
                    startActivity(i);

                    i.putExtra("datoNombre",nombre);
                    i.putExtra("datoId",identificacion);

                }

        );

    }
}