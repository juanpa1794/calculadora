package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView txtResultado;
    private Double num1= 0.0;
    private Double num2 = 0.0;
    private Double resultado=0.0;

    private Integer operacion = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnUno = findViewById(R.id.btnUno);
        Button btnDos = findViewById(R.id.btnDos);
        Button btnTres = findViewById(R.id.btnTres);
        Button btnCuatro = findViewById(R.id.btnCuatro);
        Button btnCinco = findViewById(R.id.btnCinco);
        Button btnSeis = findViewById(R.id.btnSeis);
        Button btnSiete = findViewById(R.id.btnSiete);
        Button btnOcho = findViewById(R.id.btnOcho);
        Button btnNueve = findViewById(R.id.btnNueve);
        Button btnCero = findViewById(R.id.btnCero);
        Button btnPunto = findViewById(R.id.btnPunto);
        Button btnIgual = findViewById(R.id.btnIgual);
        Button btnSuma = findViewById(R.id.btnSuma);
        Button btnResta = findViewById(R.id.btnResta);
        Button btnMulti = findViewById(R.id.btnMulti);
        Button btnDivision = findViewById(R.id.btnDivision);
        Button btnBorrar = findViewById(R.id.btnBorrar);
        txtResultado = findViewById(R.id.txtResultado);




        btnUno.setOnClickListener(v -> { numeropresionado("1"); });
        btnDos.setOnClickListener(v -> { numeropresionado("2"); });
        btnTres.setOnClickListener(v -> { numeropresionado("3"); });
        btnCuatro.setOnClickListener(v -> { numeropresionado("4"); });
        btnCinco.setOnClickListener(v -> { numeropresionado("5"); });
        btnSeis.setOnClickListener(v -> { numeropresionado("6"); });
        btnSiete.setOnClickListener(v -> { numeropresionado("7"); });
        btnOcho.setOnClickListener(v -> { numeropresionado("8"); });
        btnNueve.setOnClickListener(v -> { numeropresionado("9"); });
        btnCero.setOnClickListener(v -> { numeropresionado("0"); });
        btnPunto.setOnClickListener(v -> { numeropresionado("."); });

        btnSuma.setOnClickListener(v -> {Precionado(1);});
        btnResta.setOnClickListener(v -> {Precionado(2);});
        btnMulti.setOnClickListener(v -> {Precionado(3);});
        btnDivision.setOnClickListener(v -> {Precionado(4);});


        btnIgual.setOnClickListener(v -> {

            Resultado();

        });

        btnBorrar.setOnClickListener(v -> {
            num1=0.0;
            num2=0.0;
            txtResultado.setText("");
            operacion=0;
        });



    }
     private void  numeropresionado(String digito) {

        txtResultado.setText(txtResultado.getText()+digito);

        if(this.operacion == 0){
            num1 = Double.parseDouble(txtResultado.getText().toString());
            Toast.makeText(this, "numero1: "+num1, Toast.LENGTH_SHORT).show();

        }else{
            num2 = Double.parseDouble(txtResultado.getText().toString());
            Toast.makeText(this, "numero2: "+num2, Toast.LENGTH_SHORT).show();
        }

    }

    private void  Precionado( Integer operacionPr){
        operacion=operacionPr;
        txtResultado.setText("");

    }

    private void Resultado(){

        if (operacion==1){
            resultado=num1+num2;
        }
        else if (operacion==2){
            resultado=num1-num2;
        }
        else if (operacion==3){
            resultado=num1*num2;
        }
        else if (operacion==4){
            resultado=num1/num2;
        }
        txtResultado.setText(""+resultado);

    }






    }

