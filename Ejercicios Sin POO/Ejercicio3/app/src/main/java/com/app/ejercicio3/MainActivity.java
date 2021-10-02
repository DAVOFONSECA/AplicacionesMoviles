package com.app.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText pUnoCapturado;
    private EditText pDosCapturado;
    private EditText pTresCapturado;
    private EditText pCuatroCapturado;
    private EditText pCincoCapturado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pUnoCapturado = findViewById(R.id.eTPrecioUno);
        pDosCapturado = findViewById(R.id.eTPrecioDos);
        pTresCapturado = findViewById(R.id.eTPrecioTres);
        pCuatroCapturado = findViewById(R.id.eTPrecioCuatro);
        pCincoCapturado = findViewById(R.id.eTPrecioCinco);
    }

    public void calcularFactura(View view){

        Double pUno = Double.parseDouble(pUnoCapturado.getText().toString());
        Double pDos = Double.parseDouble(pDosCapturado.getText().toString());
        Double pTres = Double.parseDouble(pTresCapturado.getText().toString());
        Double pCuatro = Double.parseDouble(pCuatroCapturado.getText().toString());
        Double pCinco = Double.parseDouble(pCincoCapturado.getText().toString());

        Double subtotal = pUno+pDos+pTres+pCuatro+pCinco;
        Double iva = subtotal*0.19;

        Toast.makeText(this, "Subtotal "+subtotal, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Iva "+iva, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Total "+(iva+subtotal), Toast.LENGTH_LONG).show();

    }
}