package br.edu.ifsuldeminas.mch.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ifsuldeminas.mch.calc";
    private Button buttonIgual, buttonC, buttonD, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonMais, buttonMenos, buttonVezes, buttonDividido;
    private TextView textViewResultado, textViewUltimaExpressao;
    private String expressao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResultado = findViewById(R.id.textViewResultadoID);
        textViewUltimaExpressao = findViewById(R.id.textViewUltimaExpressaoID);

        buttonIgual = findViewById(R.id.buttonIgualID);
        buttonC = findViewById(R.id.buttonResetID);
        buttonD = findViewById(R.id.buttonDeleteID);
        button0 = findViewById(R.id.buttonZeroID);
        button1 = findViewById(R.id.buttonUmID);
        button2 = findViewById(R.id.buttonDoisID);
        button3 = findViewById(R.id.buttonTresID);
        button4 = findViewById(R.id.buttonQuatroID);
        button5 = findViewById(R.id.buttonCincoID);
        button6 = findViewById(R.id.buttonSeisID);
        button7 = findViewById(R.id.buttonSeteID);
        button8 = findViewById(R.id.buttonOitoID);
        button9 = findViewById(R.id.buttonNoveID);
        buttonMais = findViewById(R.id.buttonSomaID);
        buttonMenos = findViewById(R.id.buttonSubtracaoID);
        buttonVezes = findViewById(R.id.buttonMultiplicacaoID);
        buttonDividido = findViewById(R.id.buttonDivisaoID);

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(expressao);
                expressao = expressao.substring(0,expressao.length()-1);
                textViewUltimaExpressao.setText(expressao);
                textViewResultado.setText("");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao = "";
                textViewUltimaExpressao.setText("");
                textViewResultado.setText("");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "0";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "1";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "2";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "3";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "4";
                textViewUltimaExpressao.setText(expressao);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "5";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "6";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "7";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "8";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "9";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "+";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "-";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonVezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "*";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonDividido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expressao += "/";
                textViewUltimaExpressao.setText(expressao);
            }
        });

        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculable avaliadorExpressao = null;
                try {
                    avaliadorExpressao = new ExpressionBuilder(expressao).build();

                    Double resultado = avaliadorExpressao.calculate();

                    textViewResultado.setText(resultado.toString());
                } catch (Exception e) {
                    Log.d(TAG, e.getMessage());
                }
            }
        });
    }
}



