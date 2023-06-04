package com.example.intransit;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicial);

        Button botaoLogin = findViewById(R.id.botao_de_login);
        Button botaoAcesso = findViewById(R.id.botao_de_acesso);

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para tratar o clique no botão de login
                // Por exemplo, abrir uma nova atividade de login
            }
        });

        botaoAcesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para tratar o clique no botão de primeiro acesso
                // Por exemplo, abrir uma nova atividade de primeiro acesso
            }
        });
    }
}

