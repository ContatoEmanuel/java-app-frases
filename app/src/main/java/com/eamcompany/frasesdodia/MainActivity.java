package com.eamcompany.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String[] frases ={
            "\"O importante não é vencer todos os dias, mas lutar sempre.\"\n" +
                    "\n" +
                    "Waldemar Valle Martins",
            "\"Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!\"\n" +
                    "\n" +
                    "Rui Barbosa",
            "\"É melhor conquistar a si mesmo do que vencer mil batalhas.\"\n" +
                    "\n" +
                    "Buda",
            "\"Quem ousou conquistar e saiu pra lutar, chega mais longe!\"\n" +
                    "\n" +
                    "Charlie Brown Jr",
            "\"Enquanto houver vontade de lutar haverá esperança de vencer.\"\n" +
                    "\n" +
                    "Santo Agostinho",
            "\"Difícil é ganhar um amigo em uma hora; fácil é ofendê-lo em um minuto.\"\n" +
                    "\n" +
                    "Provérbio Chinês",
            "\"O medo de perder tira a vontade de ganhar.\"\n" +
                    "\n" +
                    "Wanderley Luxemburgo"
        };

        int num=new Random().nextInt(7);
        TextView texto=findViewById(R.id.textResultado);
        texto.setText(frases[num]);
    }
}