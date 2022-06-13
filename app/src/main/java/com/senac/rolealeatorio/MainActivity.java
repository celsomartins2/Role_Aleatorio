package com.senac.rolealeatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button Finalizar = findViewById(R.id.Finalizar);
       Button Limpar = findViewById(R.id.Limpar);

        EditText editTextNome = findViewById(R.id.editTextNome);
        EditText editTextSobreNome = findViewById(R.id.editTextTextSobreNome);
        EditText editTextCPF = findViewById(R.id.editTextCPF);
        EditText editTextDataNascimento = findViewById(R.id.editTextDataNacimento);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextSenha = findViewById(R.id.editTextSenha);




       Finalizar.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Ok finalizado", Toast.LENGTH_SHORT).show();

               Usuario usuario = new Usuario();
               usuario.nome = editTextNome.getText().toString();
               usuario.sobrenome = editTextSobreNome.getText().toString();
               usuario.CPF = editTextCPF.getText().toString();
               usuario.dataNacismento = new Date(editTextDataNascimento.getText().toString());
               usuario.email = editTextEmail.getText().toString();
               usuario.senha = editTextSenha.getText().toString();

               Toast.makeText(MainActivity.this, usuario.toString(), Toast.LENGTH_LONG).show();





           }
       });
       Limpar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editTextNome.setText("");
               editTextSobreNome.setText("");
               editTextEmail.setText("");
               editTextSenha.setText("");
               editTextCPF.setText("");
               editTextDataNascimento.setText("");
           }
       });
    }
}