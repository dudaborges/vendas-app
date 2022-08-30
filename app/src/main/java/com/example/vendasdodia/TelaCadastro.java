package com.example.vendasdodia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vendasdodia.modelo.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.security.Principal;

public class TelaCadastro extends AppCompatActivity {

    private EditText etNome;
    private EditText etEmail;
    private EditText etSenha;
    private Button btCadastrar;
    private FirebaseAuth mAuth;
    private Usuario u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        etNome = findViewById(R.id.etNome);
        etEmail = findViewById(R.id.etEmail);
        etSenha = findViewById(R.id.etSenha);
        btCadastrar = findViewById(R.id.btCadastrar);
        mAuth = FirebaseAuth.getInstance();

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recuperarDados();
                criarLogin();
            }
        });
    }

    private void criarLogin() {
        mAuth.createUserWithEmailAndPassword(u.getEmail(), u.getSenha()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    startActivity(new Intent(TelaCadastro.this, TelaInicio.class));
                }else{
                    Toast.makeText(TelaCadastro.this, "Erro ao criar o login", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void recuperarDados() {
    if(etNome.getText().toString()==""||etEmail.getText().toString()==""||etSenha.getText().toString()==""){
        Toast.makeText(this, "Você deve preencher todos os dados", Toast.LENGTH_LONG);
    }else{
        u = new Usuario();
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