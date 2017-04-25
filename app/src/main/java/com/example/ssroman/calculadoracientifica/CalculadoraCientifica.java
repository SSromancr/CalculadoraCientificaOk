package com.example.ssroman.calculadoracientifica;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraCientifica extends AppCompatActivity {
    Double op1, op2, memoria, signo, resultado;
    String operacion;
    int factorial = 1, sumatorio = 0;
    int inversa = 0;
    int arco = 0;
    int condicioninv, condicionarc;

    public int getInversa() {
        return inversa;
    }

    public void setInversa(int inversa) {
        this.inversa = inversa;
    }

    public int getArco() {
        return arco;
    }

    public void setArco(int arco) {
        this.arco = arco;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_cientifica);

    }

    public void ObtenerDatos(View v) {
        try {
            TextView operador = (TextView) findViewById(R.id.pantalla);
            op1 = Double.parseDouble(operador.getText().toString());
            operador.setText("");
        } catch (Exception e) {
            Toast.makeText(this, "Asigna valor al operador", Toast.LENGTH_LONG).show();
        }
    }

    public void cero(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText() + "0");
    }

    public void uno(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText() + "1");
    }

    public void dos(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText() + "2");
    }

    public void tres(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText() + "3");
    }

    public void cuatro(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText() + "4");
    }

    public void cinco(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText() + "5");
    }

    public void seis(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText() + "6");
    }

    public void siete(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText() + "7");
    }

    public void ocho(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText() + "8");
    }

    public void nueve(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText() + "9");
    }

    public void coma(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText() + ".");
    }

    public void sumar(View v) {
        operacion = "+";
        ObtenerDatos(v);
    }

    public void restar(View v) {
        operacion = "-";
        ObtenerDatos(v);
    }

    public void multiplicar(View v) {
        operacion = "x";
        ObtenerDatos(v);
    }

    public void dividir(View v) {
        operacion = "/";
        ObtenerDatos(v);
    }

    public void potencias(View v) {
        operacion = "pot";
        ObtenerDatos(v);
    }

    public void raices(View v) {
        ObtenerDatos(v);
        resultado = Math.sqrt(op1);
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(resultado.toString());
    }

    public void logaritmos(View v) {
        ObtenerDatos(v);
        condicioninv = getInversa();
        if (condicioninv == 0) {
            resultado = Math.log10(op1);
        } else {
            resultado = Math.log(op1);
        }
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(resultado.toString());
    }

    public void seno(View v) {
        ObtenerDatos(v);
        condicioninv = getInversa();
        condicionarc = getArco();
        double radian = Math.toRadians(op1);
        if (condicioninv == 0) {
            if (condicionarc == 0) {
                resultado = Math.sin(radian);
            } else {
                resultado = Math.asin(op1);
                resultado = Math.toDegrees(resultado);
            }
        } else {
            if (condicionarc == 0) {
                resultado = 1 / Math.sin(radian);
            } else {
                resultado = 1 / Math.asin(op1);
                resultado = Math.toDegrees(resultado);
            }
        }
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(resultado.toString());
    }

    public void coseno(View v) {
        ObtenerDatos(v);
        condicioninv = getInversa();
        condicionarc = getArco();
        double radian = Math.toRadians(op1);
        if (condicioninv == 0) {
            if (condicionarc == 0) {
                resultado = Math.cos(radian);
            } else {
                resultado = Math.acos(op1);
                resultado = Math.toDegrees(resultado);
            }
        } else {
            if (condicionarc == 0) {
                resultado = 1 / Math.cos(radian);
            } else {
                resultado = 1 / Math.acos(op1);
                resultado = Math.toDegrees(resultado);
            }
        }
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(resultado.toString());
    }

    public void tangente(View v) {
        ObtenerDatos(v);
        condicioninv = getInversa();
        condicionarc = getArco();
        double radian = Math.toRadians(op1);
        if (condicioninv == 0) {
            if (condicionarc == 0) {
                resultado = Math.tan(radian);
            } else {
                resultado = Math.atan(op1);
                resultado = Math.toDegrees(resultado);
            }
        } else {
            if (condicionarc == 0) {
                resultado = 1 / Math.tan(radian);
            } else {
                resultado = 1 / Math.atan(op1);
                resultado = Math.toDegrees(resultado);
            }
        }
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(resultado.toString());
    }

    public void igual(View v) {
        try {
            TextView operador = (TextView) findViewById(R.id.pantalla);
            op2 = Double.parseDouble(operador.getText().toString());
            switch (operacion) {
                case "+":
                    resultado = op1 + op2;
                    break;
                case "-":
                    resultado = op1 - op2;
                    break;
                case "x":
                    resultado = op1 * op2;
                    break;
                case "/":
                    if (op2 != 0) {
                        resultado = op1 / op2;
                        break;
                    }
                case "pot":
                    resultado = Math.pow(op1, op2);
                    break;
            }
            operador.setText(resultado.toString());
        } catch (Exception e) {
            Toast.makeText(this, "Asigna un valor al operador", Toast.LENGTH_LONG).show();
        }
    }

    public void aCero(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText("");
    }

    public void basica(View v) {
        finish();
    }

    public void reset(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        op1 = 0.0;
        op2 = 0.0;
        operacion = "";
        inversa = 0;
        arco = 0;
        factorial=1;
        sumatorio=0;
        operador.setText("");
    }

    public void memoriaMas(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        memoria = Double.parseDouble(operador.getText().toString());
        operador.setText("");
    }

    public void memoriaResultado(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(memoria.toString());
    }

    public void memoriaCero(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        memoria = 0.0;
        operador.setText("");

    }

    public void cambioSigno(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        signo = Double.parseDouble(operador.getText().toString());
        signo = -1 * signo;
        operador.setText(signo.toString());
    }

    public void inversas(View v) {
        if (inversa == 0) {
            inversa = 1;
        } else {
            inversa = 0;
        }
    }

    public void arcos(View v) {
        if (arco == 0) {
            arco = 1;
        } else {
            arco = 0;
        }
    }

    public void numPi(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(String.valueOf(Math.PI));
    }

    public void numE(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(String.valueOf(Math.E));
    }

    public void factorial(View v) {
        ObtenerDatos(v);
        condicioninv = getInversa();
        if (condicioninv == 0) {
            int i;
            for (i = 1; i <= op1; i++) {
                factorial = factorial * i;
            }
            TextView operador = (TextView) findViewById(R.id.pantalla);
            operador.setText(String.valueOf(factorial));
        } else {
            resultado = 1 / op1;
            TextView operador = (TextView) findViewById(R.id.pantalla);
            operador.setText(String.valueOf(resultado));
        }
    }

    public void sumatorio(View v) {
        ObtenerDatos(v);
        int i;
        for (i = 1; i <= op1; i++) {
            sumatorio = sumatorio + i;
        }
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(String.valueOf(sumatorio));
    }
}