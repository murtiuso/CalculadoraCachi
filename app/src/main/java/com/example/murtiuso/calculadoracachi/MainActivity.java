package com.example.murtiuso.calculadoracachi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText pantalla; // variable que recogerá lo que se introduzca
    public Double resultado, operando1, operando2;
    public int opcion;
    private Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, Sumar, Restar, Multi, Divi, ac, borraAnt, resul, decimal, negativo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        uno = (Button) findViewById(R.id.uno);
        dos = (Button) findViewById(R.id.dos);
        tres = (Button) findViewById(R.id.tres);
        cuatro = (Button) findViewById(R.id.cuatro);
        cinco = (Button) findViewById(R.id.cinco);
        seis = (Button) findViewById(R.id.seis);
        siete = (Button) findViewById(R.id.siete);
        ocho = (Button) findViewById(R.id.ocho);
        nueve = (Button) findViewById(R.id.nueve);
        cero = (Button) findViewById(R.id.cero);

        ac = (Button) findViewById(R.id.borrarTodo);
        borraAnt = (Button) findViewById(R.id.borrarAnterior);
        resul = (Button) findViewById(R.id.resultado);
        decimal = (Button) findViewById(R.id.decimal);
        negativo = (Button) findViewById(R.id.negativo);

        Sumar = (Button) findViewById(R.id.sumar);
        Restar = (Button) findViewById(R.id.restar);
        Multi = (Button) findViewById(R.id.multi);
        Divi = (Button) findViewById(R.id.divi);

        pantalla = (EditText) findViewById(R.id.PantallaCalc);


        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String captura = pantalla.getText().toString();
                captura = captura + "1";
                pantalla.setText(captura);
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String captura = pantalla.getText().toString();
                captura = captura + "2";
                pantalla.setText(captura);
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String captura = pantalla.getText().toString();
                captura = captura + "3";
                pantalla.setText(captura);
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String captura = pantalla.getText().toString();
                captura = captura + "4";
                pantalla.setText(captura);
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String captura = pantalla.getText().toString();
                captura = captura + "5";
                pantalla.setText(captura);
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String captura = pantalla.getText().toString();
                captura = captura + "6";
                pantalla.setText(captura);
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String captura = pantalla.getText().toString();
                captura = captura + "7";
                pantalla.setText(captura);
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String captura = pantalla.getText().toString();
                captura = captura + "8";
                pantalla.setText(captura);
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String captura = pantalla.getText().toString();
                captura = captura + "9";
                pantalla.setText(captura);
            }
        });

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String captura = pantalla.getText().toString();
                captura = captura + "0";
                pantalla.setText(captura);
            }
        });

        Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String contenidoPantalla = pantalla.getText().toString();
                    operando1 = Double.parseDouble(contenidoPantalla);

                    // probar si puedo cambiar nfe por e
                } catch (NumberFormatException nfe) {
                }
                pantalla.setText("");
                opcion = 1;
            }
        });

        Restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String contenidoPantalla = pantalla.getText().toString();
                    operando1 = Double.parseDouble(contenidoPantalla);

                } catch (NumberFormatException nfe) {
                }
                pantalla.setText("");
                opcion = 2;
            }
        });

        Multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String contenidoPantalla = pantalla.getText().toString();
                    operando1 = Double.parseDouble(contenidoPantalla);

                } catch (NumberFormatException nfe) {
                }
                pantalla.setText("");
                opcion = 3;
            }
        });

        Divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String contenidoPantalla = pantalla.getText().toString();
                    operando1 = Double.parseDouble(contenidoPantalla);

                } catch (NumberFormatException nfe) {
                }
                pantalla.setText("");
                opcion = 4;
            }
        });

        borraAnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!pantalla.getText().toString().equals("")) {
                    pantalla.setText( pantalla.getText().subSequence( 0, pantalla.getText().length() - 1 ) + "" );
                }
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantalla.setText("");
                operando1 = 0.0;
                operando2 = 0.0;
                resultado = 0.0;
            }
        });


        resul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String contenidoPantalla2 = pantalla.getText().toString();
                    operando2 = Double.parseDouble(contenidoPantalla2);

                } catch (NumberFormatException nfe) {

                }
                pantalla.setText("");

                switch (opcion) {
                    case 1:
                        resultado = operando1 + operando2;
                        break;

                    case 2:
                        resultado = operando1 - operando2;
                        break;

                    case 3:
                        resultado = operando1 * operando2;
                        break;

                    case 4:
                        // controlar que un número no pueda ser dividido entre 0
                        if (operando2 == 0) {
                            pantalla.setText("No se puede dividir entre 0");
                        } else {
                            resultado = operando1 / operando2;
                        }
                        break;

                    default: break;
                }

                pantalla.setText("" + resultado);

                // por si se quiere hacer otra operación

                    operando1 = resultado;

            }

        });


    }

}
