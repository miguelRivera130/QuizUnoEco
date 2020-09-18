package com.example.quizuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class NexoDos extends AppCompatActivity {

    private Button continuarTres;
    private CheckBox preguntaUno;
    private CheckBox preguntaDos;
    private CheckBox preguntaTres;
    private CheckBox preguntaCuatro;
    private CheckBox preguntaCinco;
    private CheckBox preguntaSeis;
    private CheckBox preguntaSiete;
    private int segundoResultado;
    private boolean activador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nexo_dos);

        int resultadosUno = getIntent().getExtras().getInt("respuestasUno");
        String nombre = getIntent().getExtras().getString("datoNombre");
        String id = getIntent().getExtras().getString("datoId");

        activador = false;
        segundoResultado = resultadosUno;

        continuarTres = findViewById(R.id.continuar3);
        preguntaUno = findViewById(R.id.pregunta1_2);
        preguntaDos = findViewById(R.id.pregunta2_2);
        preguntaTres = findViewById(R.id.pregunta3_2);
        preguntaCuatro = findViewById(R.id.pregunta4_2);
        preguntaCinco = findViewById(R.id.pregunta5_2);
        preguntaSeis = findViewById(R.id.pregunta6_2);
        preguntaSiete = findViewById(R.id.pregunta7_2);

        //checkeo de checkBox
        if(preguntaUno.isChecked()){
            segundoResultado += 4;
            activador = true;
        }
        if(preguntaDos.isChecked()){
            segundoResultado += 4;
            activador = true;
        }
        if(preguntaTres.isChecked()){
            segundoResultado += 4;
            activador = true;
        }
        if(preguntaCuatro.isChecked()){
            segundoResultado += 4;
            activador = true;
        }
        if(preguntaCinco.isChecked()){
            segundoResultado += 4;
            activador = true;
        }
        if(preguntaSeis.isChecked()){
            segundoResultado += 4;
            activador = true;
        }
        if(preguntaSiete.isChecked()){
            activador = true;
        }

        //paso de informacion a la siguiente pagina
        continuarTres.setOnClickListener(

                (v)-> {

                    if (activador == true) {
                        String resultadoDos = "" + segundoResultado;

                        Intent i = new Intent(this, MainActivity.class);

                        startActivity(i);
                        i.putExtra("resultado",resultadoDos);
                        i.putExtra("activar",activador);


                    }

                }
        );

    }
}