package com.example.ssroman.calculadoracientifica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Double op1,op2, memoria, signo, resultado;
    String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ObtenerDatos (View v) {
        try {
            TextView operador = (TextView) findViewById(R.id.pantalla);
            op1 = Double.parseDouble(operador.getText().toString());
            operador.setText("");
        }catch (Exception e){
            Toast.makeText(this,"Asigna valor al operador", Toast.LENGTH_LONG).show();
        }
    }

    public void cero(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText()+"0");
    }

    public void uno(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText()+"1");
    }

    public void dos(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText()+"2");
    }

    public void tres(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText()+"3");
    }

    public void cuatro(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText()+"4");
    }

    public void cinco(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText()+"5");
    }

    public void seis(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText()+"6");
    }

    public void siete(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText()+"7");
    }

    public void ocho(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText()+"8");
    }

    public void nueve(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText()+"9");
    }

    public void coma(View v) {
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(operador.getText()+".");
    }

    public void sumar (View v){
        operacion = "+";
        ObtenerDatos(v);
    }

    public void restar (View v){
        operacion = "-";
        ObtenerDatos(v);
    }

    public void multiplicar (View v){
        operacion = "x";
        ObtenerDatos(v);
    }

    public void dividir (View v){
        operacion = "/";
        ObtenerDatos(v);
    }

    public void igual (View v){
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
                    if (op2!=0.0){
                        resultado = op1 / op2;
                        break;
                    }
            }
            operador.setText(resultado.toString());
        }catch (Exception e){
            Toast.makeText(this, "Asigna un valor al operador", Toast.LENGTH_LONG).show();
        }
    }

    public void aCero (View v){
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText("");
    }

    public void apagar (View v){
        finish();
    }

    public void reset (View v){
        TextView operador = (TextView) findViewById(R.id.pantalla);
        op1=0.0;
        op2=0.0;
        operacion="";
        operador.setText("");
    }


    public void memoriaMas(View v){
        TextView operador = (TextView) findViewById(R.id.pantalla);
        memoria=Double.parseDouble(operador.getText().toString());
        operador.setText("");
    }

    public void memoriaResultado(View v){
        TextView operador = (TextView) findViewById(R.id.pantalla);
        operador.setText(memoria.toString());
    }

    public void memoriaCero(View v){
        TextView operador = (TextView) findViewById(R.id.pantalla);
        memoria=0.0;
        operador.setText("");

    }

    public void cambioSigno(View v){
        TextView operador = (TextView) findViewById(R.id.pantalla);
        signo=Double.parseDouble(operador.getText().toString());
        signo = -1 * signo;
        operador.setText(signo.toString());
        }

    public void CalculadoraCientifica (View v){
        Intent i = new Intent (this, CalculadoraCientifica.class);
        startActivity(i);
    }
    }