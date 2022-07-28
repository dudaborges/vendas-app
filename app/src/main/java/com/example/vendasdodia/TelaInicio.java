package com.example.vendasdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicio);
    }

    public void abrir_tela_Inicio(View v){
        Intent it_telaInicio = new Intent(this, TelaInicio.class);
        startActivity(it_telaInicio);
    }

    public void abrir_tela_login(View v){
        Intent it_telaLogin = new Intent(this, TelaLogin.class);
        startActivity(it_telaLogin);
    }

    public void abrir_tela_Lista(View v){
        Intent it_telaLista = new Intent(this, TelaLista.class);
        startActivity(it_telaLista);
    }

    public void abrir_tela_Data(View v){
        Intent it_telaData = new Intent(this, TelaData.class);
        startActivity(it_telaData);
    }
}