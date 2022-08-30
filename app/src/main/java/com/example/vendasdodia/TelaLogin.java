package com.example.vendasdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.vendasdodia.modelo.Usuario;
import com.google.firebase.auth.FirebaseAuth;

public class TelaLogin extends AppCompatActivity {

    private EditText etEmail;
    private EditText etSenha;
    private Button btLogar;
    private FirebaseAuth mAuth;

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