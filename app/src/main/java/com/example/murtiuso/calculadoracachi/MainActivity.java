package com.example.murtiuso.calculadoracachi;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText pantalla;
    public Double2 operando1, operando2, resultado;
    public int op;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla = (EditText) findViewById(R.id.PantallaCalc);
    }

    public void bt1 (View v){
        String captura = pantalla.getText().toString();
        captura = captura+"1";
        pantalla.setText(captura);
    }


}
