package com.example.h_nr_.apprestaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btLogar;
    private EditText etNomeCliente;
    private EditText etMesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogar = (Button) findViewById(R.id.btLogar);
        etNomeCliente = (EditText) findViewById(R.id.etNomeCliente);
        etMesa = (EditText) findViewById(R.id.etMesa);

        String mesa=etMesa.getEditableText().toString();
        String nomecliente=etNomeCliente.getEditableText().toString();



        btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //verificar o login
                Intent intent = new Intent(MainActivity.this,PrincipalActivity.class);
                intent.putExtra("nomecliente", nomecliente);
                intent.putExtra("mesa", mesa);
                startActivity(intent);
            }
        });
    }




}
