package com.example.quizuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class NexoUno extends AppCompatActivity {

    private Button continuarDos;
    private CheckBox preguntaUno;
    private CheckBox preguntaDos;
    private CheckBox preguntaTres;
    private CheckBox preguntaCuatro;
    private CheckBox preguntaCinco;
    private int primerResultado;
    private boolean activador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nexo_uno);

        primerResultado = 0;
        activador = false;

        continuarDos = findViewById(R.id.continuar2);
        preguntaUno = findViewById(R.id.pregunta1);
        preguntaDos = findViewById(R.id.pregunta2);
        preguntaTres = findViewById(R.id.pregunta3);
        preguntaCuatro = findViewById(R.id.pregunta4);
        preguntaCinco = findViewById(R.id.pregunta5);

        //checkeo de checkBox
        if(preguntaUno.isChecked()){
            primerResultado += 3;
            activador = true;
        }
        if(preguntaDos.isChecked()){
            primerResultado += 3;
            activador = true;
        }
        if(preguntaTres.isChecked()){
            primerResultado += 3;
            activador = true;
        }
        if(preguntaCuatro.isChecked()){
            primerResultado += 3;
            activador = true;
        }
        if(preguntaCinco.isChecked()){
            activador = true;
        }

        //paso de informacion a la siguiente pagina
        continuarDos.setOnClickListener(

                (v)-> {

                    if (activador == true) {
                        Intent i = new Intent(this, NexoDos.class);

                        i.putExtra("respuestasUno", primerResultado);
                        startActivity(i);

                    }
                }

        );

    }
}