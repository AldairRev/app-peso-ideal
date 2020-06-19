package com.example.avance2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText sexo,peso,altura;
    Button pesos;
    TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sexo=(EditText) findViewById(R.id.edtSexo);
        peso=(EditText) findViewById(R.id.edtPeso);
        altura=(EditText) findViewById(R.id.edtAltu);
        salida=(TextView) findViewById(R.id.txvSalida);
        pesos=(Button) findViewById(R.id.btnPeso);

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
                sexo.getText().clear();
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
