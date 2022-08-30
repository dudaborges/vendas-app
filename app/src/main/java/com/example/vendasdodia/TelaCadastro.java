package com.example.vendasdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vendasdodia.modelo.Usuario;

public class TelaCadastro extends AppCompatActivity {

    private EditText etNome;
    private EditText etEmail;
    private EditText etSenha;
    private Button btCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        etNome = findViewById(R.id.etNome);
        etEmail = findViewById(R.id.etEmail);
        etSenha = findViewById(R.id.etSenha);
        btCadastrar = findViewById(R.id.btCadastrar);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recuperarDados();
            }
        });
    }

    private void recuperarDados() {
    if(etNome.getText().toString()==""||etEmail.getText().toString()==""||etSenha.getText().toString()==""){
        Toast.makeText(this, "Você deve preencher todos os dados", Toast.LENGTH_LONG);
    }else{
        Usuario u = new Usuario();
        u.setNome(etNome.getText().toString());
        u.setEmail(etEmail.getText().toString());
        u.setSenha(etSenha.getText().toString());
        
    }
    }

    public void abrir_tela_login(View v){
        Intent it_telaLogin = new Intent(this, TelaLogin.class);
        startActivity(it_telaLogin);
    }

    public void abrir_tela_Inicio(View v){
        Intent it_telaInicio = new Intent(this, TelaInicio.class);
        startActivity(it_telaInicio);
    }
}