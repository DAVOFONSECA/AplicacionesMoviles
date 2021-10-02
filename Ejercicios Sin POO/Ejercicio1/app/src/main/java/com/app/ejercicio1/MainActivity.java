package com.app.ejercicio1;

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
    public void calcularPromedio(View view){
        int contador= 0;
        int i=0;
        int numero = Integer.parseInt(numeroCapturado.getText().toString());

        for(i = 1; i <= numero; i++)
        {
            if((numero % i) == 0)
            {
                contador++;
            }
        }

        if(contador <= 2)
        {
            Toast.makeText(this, "Es un número primo", Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this, "No es un número primo", Toast.LENGTH_LONG).show();

        }
    }


}