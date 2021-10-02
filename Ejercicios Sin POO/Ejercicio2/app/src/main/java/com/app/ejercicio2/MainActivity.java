package com.app.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numeroCapturado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numeroCapturado = findViewById(R.id.eTSegundos);
    }

    public void calcularSegundos(View view){

        int numero = Integer.parseInt(numeroCapturado.getText().toString());
        int minutos =0;
        int segundos =0;

        minutos = numero / 60;
        segundos = 60 - (numero - (minutos*60));

        Toast.makeText(this, "Hay "+minutos+" minutos en total", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Faltan "+segundos+" segundos para completar el siguiente minuto", Toast.LENGTH_LONG).show();

    }



}