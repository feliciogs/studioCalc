package com.calculadora.fegs.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    public Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnSomar,btnSubtrair,
            btnMultiplicar,btnDividir,btnIgual,btnBack,btnCE,btnPonto;

    public TextView text1,text2,text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnSomar = findViewById(R.id.btn_somar);
        btnSubtrair = findViewById(R.id.btn_subtrair);
        btnMultiplicar = findViewById(R.id.btn_multiplicar);
        btnDividir = findViewById(R.id.btn_dividir);

        btnIgual = findViewById(R.id.btn_igual);
        btnBack = findViewById(R.id.btn_back);
        btnCE = findViewById(R.id.btn_CE);
        btnPonto = findViewById(R.id.btn_ponto);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
    }
    public void fcbutton_1(View v){ }
    public void fcbutton_2(View v){ }
    public void fcbutton_3(View v){ }
    public void fcbutton_4(View v){ }
    public void fcbutton_5(View v){ }
    public void fcbutton_6(View v){ }
    public void fcbutton_7(View v){ }
    public void fcbutton_8(View v){ }
    public void fcbutton_9(View v){ }
    public void fcbutton_0(View v){ }
    public void fcbutton_Somar(View v){ }
    public void fcbutton_Subtrair(View v){ }
    public void fcbutton_Multiplicar(View v){ }
    public void fcbutton_Dividir(View v){ }
    public void fcbutton_Igual(View v){ }
    public void fcbutton_Back(View v){ }
    public void fcbutton_CE(View v){ }
    public void fcbutton_Ponto(View v){ }
    public void texte(View v){ }


}
