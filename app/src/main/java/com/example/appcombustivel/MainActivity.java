package com.example.appcombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular (View view) {
        Button calcular = findViewById(R.id.btnCalcular);
        TextView edalcool = findViewById(R.id.editAlcool);
        TextView edgasolina = findViewById(R.id.editGasolina);
        TextView resultado = findViewById(R.id.txResultado);

        calcular.setOnClickListener (new View.OnClickListener () {

            public void onClick (View view) {

                double alcool = Double.parseDouble(edalcool.getText().toString());
                double gasolina = Double.parseDouble(edgasolina.getText().toString());

                if (alcool / gasolina >= 0.7){
                    resultado.setText(" Melhor utilizar gasolina ");
                }
                else {
                    resultado.setText(" É melhor usar álcool ");
                }

            }
        });
    }
}