package com.example.noelia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class calculadora extends AppCompatActivity {

    public EditText pant; //pantalla
    public double operan1, operan2, res;
    int operacion; // la usamos para cada operacion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pant = (EditText)findViewById(R.id.cajaText);// recoge todo lo de la caja con el id


    }
    // botones
    public void bt1(View v){
        String datos = pant.getText().toString(); // la variable datos guardara todo lo que recoga pan en forma de texto
        datos = datos + "1";
        pant.setText(datos);
    }
    public void bt2(View v){
        String datos = pant.getText().toString();
        datos = datos + "2";
        pant.setText(datos);
    }
    public void bt3(View v){
        String datos = pant.getText().toString();
        datos = datos + "3";
        pant.setText(datos);
    }
    public void bt4(View v){
        String datos = pant.getText().toString();
        datos = datos + "4";
        pant.setText(datos);
    }
    public void bt5(View v){
        String datos = pant.getText().toString(); //
        datos = datos + "5";
        pant.setText(datos);
    }
    public void bt6(View v){
        String datos = pant.getText().toString();
        datos = datos + "6";
        pant.setText(datos);
    }
    public void bt7(View v){
        String datos = pant.getText().toString();
        datos = datos + "7";
        pant.setText(datos);
    }
    public void bt8(View v){
        String datos = pant.getText().toString();
        datos = datos + "8";
        pant.setText(datos);
    }
    public void bt9(View v){
        String datos = pant.getText().toString();
        datos = datos + "9";
        pant.setText(datos);
    }
    public void bt0(View v){
        String datos = pant.getText().toString();
        datos = datos + "0";
        pant.setText(datos);
    }
    public void btcoma(View v){
        String datos = pant.getText().toString();
        datos = datos + ",";
        pant.setText(datos);
    }
    public void btparen(View v){
        String datos = pant.getText().toString();
        datos = datos + "1";
        pant.setText(datos);
    }
    public void btac(View v){
        String datos = pant.getText().toString();
        datos = datos + "1";
        pant.setText(datos);
    }
    public void btigual(View v){
        String datos = pant.getText().toString();
        datos = datos + "1";
        pant.setText(datos);
    }
    public void suma(View v){

        try{//metemos un try por si de la damos ala suma y no he mos metido ningun numero
            String aux =  pant.getText().toString(); // guardamos en aux lo que recoge el texto
            operan1 = Double.parseDouble(aux);// el operan sera aux
        }catch (NumberFormatException nfe){}

        pant.setText("");// limpia la pantalla para mostrar el siguiente operador
        operacion=1;// decimos que es igual a 1 para indicar k es la suma
    }

    public void resta(View v){

        try{//metemos un try por si de la damos ala suma y no he mos metido ningun numero
            String aux =  pant.getText().toString(); // guardamos en aux lo que recoge el texto
            operan1 = Double.parseDouble(aux);// el operan sera aux
        }catch (NumberFormatException nfe){}

        pant.setText("");// limpia la pantalla para mostrar el siguiente operador
        operacion=2;// decimos que es igual a 1 para indicar k es la suma
    }

    public void multiplicacion(View v){

        try{//metemos un try por si de la damos ala suma y no he mos metido ningun numero
            String aux =  pant.getText().toString(); // guardamos en aux lo que recoge el texto
            operan1 = Double.parseDouble(aux);// el operan sera aux
        }catch (NumberFormatException nfe){}

        pant.setText("");// limpia la pantalla para mostrar el siguiente operador
        operacion=3;// decimos que es igual a 1 para indicar k es la suma
    }

    public void division(View v){

        try{//metemos un try por si de la damos ala suma y no he mos metido ningun numero
            String aux =  pant.getText().toString(); // guardamos en aux lo que recoge el texto
            operan1 = Double.parseDouble(aux);// el operan sera aux
        }catch (NumberFormatException nfe){}

        pant.setText("");// limpia la pantalla para mostrar el siguiente operador
        operacion=4;// decimos que es igual a 1 para indicar k es la suma
    }
    public void cos(View v){
        try{
            String aux1=pant.getText().toString();
            operan1=Double.parseDouble(aux1);

        }catch (NumberFormatException nfe){}
        pant.setText("Cos ("+operan1+")");
        operacion=5;
    }
    public void sin(View v){
        try{
            String aux1=pant.getText().toString();
            operan1=Double.parseDouble(aux1);

        }catch (NumberFormatException nfe){}
        pant.setText("Sin ("+operan1+")");
        operacion=6;
    }
    public void tang(View v){
        try{
            String aux1=pant.getText().toString();
            operan1=Double.parseDouble(aux1);

        }catch (NumberFormatException nfe){}
        pant.setText("Tan ("+operan1+")");
        operacion=7;
    }

    public void igual(View v) {

        try {//metemos un try por si de la damos ala suma y no he mos metido ningun numero
            String aux1 = pant.getText().toString(); // guardamos en aux lo que recoge el texto
            operan2 = Double.parseDouble(aux1);// el operan sera aux
        } catch (NumberFormatException nfe) {
        }

        pant.setText("");// limpia la pantalla para mostrar el siguiente operador

        if (operacion == 1) {
            res = operan1 + operan2;
        } else if (operacion == 2) {
            res = operan1 - operan2;
        } else if (operacion == 3) {
            res = operan1 * operan2;
        } else if (operacion == 4) {
            if (operan2 == 0) {
                pant.setText("Error");
            } else
                res = operan1 / operan2;
        }else if(operacion ==5){
            double rad=Math.toRadians(operan1);
            res = (Math.cos(rad));
        }else if (operacion==6){
            double rad=Math.toRadians(operan1);
            res = (Math.sin(rad));
        }else if (operacion==7){
            double rad=Math.toRadians(operan1);
            res = (Math.tan(rad));
        }
        pant.setText(" +res");
        operan1 = res; // por si queremos realizar otra operacion con el resultado

    }

    public void clear (View v){
        pant.setText("");
        operan1=0.0;
        operan2=0.0;
        res=0.0;

    }



}
