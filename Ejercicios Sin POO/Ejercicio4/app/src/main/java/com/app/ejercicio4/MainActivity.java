package com.app.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText baseCapturada;
    private EditText potenciaCapturada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseCapturada = findViewById(R.id.eTbase);
        potenciaCapturada = findViewById(R.id.eTPotencia);
    }

    public void calcularPotencia(View view){

        Double base = Double.parseDouble(baseCapturada.getText().toString());
        Double  potencia = Double.parseDouble(potenciaCapturada.getText().toString());

        Double resultado = Math.pow(base,potencia);


        Toast.makeText(this, "El resultado es: "+resultado, Toast.LENGTH_LONG).show();
       }

}