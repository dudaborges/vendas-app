package com.example.vendasdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
    }

    public void abrir_tela_Inicio(View v){
        Intent it_telaInicio = new Intent(this, TelaInicio.class);
        startActivity(it_telaInicio);
    }

    public void abrir_tela_cadastro(View v){
        Intent it_telaCadastro = new Intent(this, TelaCadastro.class);
        startActivity(it_telaCadastro);
    }
}