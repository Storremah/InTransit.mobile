package com.example.intransit;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private EditText editUsuario;
    private EditText editSenha;
    private CheckBox checkBoxMostrarSenha;
    private Button botaoLogin;
    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        editUsuario = findViewById(R.id.insert_usuario);
        editSenha = findViewById(R.id.insert_senha);
        checkBoxMostrarSenha = findViewById(R.id.mostrar_senha);
        botaoLogin = findViewById(R.id.botao_de_login);
        botaoVoltar = findViewById(R.id.botao_de_voltar);

        checkBoxMostrarSenha.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                editSenha.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            } else {
                editSenha.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }
        });

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para tratar o clique no botão de login
                String usuario = editUsuario.getText().toString();
                String senha = editSenha.getText().toString();
                // ... realizar a autenticação ou qualquer outra lógica desejada
            }
        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para tratar o clique no botão de voltar
                // Por exemplo, voltar para a tela anterior ou encerrar a atividade
            }
        });
    }
}
