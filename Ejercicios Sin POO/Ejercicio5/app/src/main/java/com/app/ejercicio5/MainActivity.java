package com.app.ejercicio5;

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
        numeroCapturado = findViewById(R.id.eTNumero);
    }

    public void calcularKM(View view){
        Double numero = Double.parseDouble(numeroCapturado.getText().toString());
        numero = numero/1000;
        Toast.makeText(this, "El resultado en kilometros es : "+numero, Toast.LENGTH_LONG).show();
    }

    public void calcularHM(View view){
        Double numero = Double.parseDouble(numeroCapturado.getText().toString());
        numero = numero/100;
        Toast.makeText(this, "El resultado en hectómetros  es : "+numero, Toast.LENGTH_LONG).show();
    }
    public void calcularDM(View view){
        Double numero = Double.parseDouble(numeroCapturado.getText().toString());
        numero = numero/10;
        Toast.makeText(this, "El resultado en decámetros es : "+numero, Toast.LENGTH_LONG).show();
    }
    public void calculardd(View view){
        Double numero = Double.parseDouble(numeroCapturado.getText().toString());
        numero = numero*10;
        Toast.makeText(this, "El resultado en decímetros es : "+numero, Toast.LENGTH_LONG).show();
    }
    public void calcularcm(View view){
        Double numero = Double.parseDouble(numeroCapturado.getText().toString());
        numero = numero*100;
        Toast.makeText(this, "El resultado en centímetros es : "+numero, Toast.LENGTH_LONG).show();
    }
    public void calcularmm(View view){
        Double numero = Double.parseDouble(numeroCapturado.getText().toString());
        numero = numero*1000;
        Toast.makeText(this, "El resultado en milímetros : "+numero, Toast.LENGTH_LONG).show();
    }



}