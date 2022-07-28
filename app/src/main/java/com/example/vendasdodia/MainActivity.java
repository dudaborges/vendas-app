package com.example.vendasdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void abrir_tela_cadastro(View v){
        Intent it_telaCadastro = new Intent(this, TelaCadastro.class);
        startActivity(it_telaCadastro);
    }

}
