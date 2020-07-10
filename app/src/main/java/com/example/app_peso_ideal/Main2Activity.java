package com.example.app_peso_ideal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText peso,altura;
    Button sexo;
    Button pesos;
    TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sexo=(Button) findViewById(R.id.edtSexo);
        peso=(EditText) findViewById(R.id.edtPeso);
        altura=(EditText) findViewById(R.id.edtAltu);
        pesos=(Button) findViewById(R.id.btnPeso);
        getSupportActionBar().setTitle("Volver");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pesos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sexo.setError(null);
                peso.setError(null);
                altura.setError(null);
                String posibleNumero = sexo.getText().toString();
                String posibleNumero1 = peso.getText().toString();
                String posibleNumero2 = altura.getText().toString();
                if ("".equals(posibleNumero)) {
                    sexo.setError("Introduce tu sexo");
                    sexo.requestFocus();
                    return;
                }
                if ("".equals(posibleNumero2)) {
                    altura.setError("Introduce tu altura");
                    altura.requestFocus();
                    return;
                }
                if ("".equals(posibleNumero1)) {
                    peso.setError("Introduce tu peso");
                    peso.requestFocus();
                    return;
                }
                String sex;
                Integer pes,altu;
                sex = sexo.getText().toString();
                pes = Integer.parseInt(peso.getText().toString());
                altu = Integer.parseInt(altura.getText().toString());
                peso.getText().clear();
                altura.getText().clear();
                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                i.putExtra("sexo", sex);
                i.putExtra("peso", pes);
                i.putExtra("altura", altu);
                startActivity(i);
            }
        });








    }
}
