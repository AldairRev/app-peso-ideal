package com.example.app_peso_ideal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView comenzar;
    TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final PantallaCarga pantallaCarga = new PantallaCarga(MainActivity.this);

        comenzar = (TextView) findViewById(R.id.tvComenzar);
        pantallaCarga.iniciarPantallaCarga();
        Handler hander = new Handler();
        hander.postDelayed(new Runnable() {
            @Override
            public void run() {
                pantallaCarga.dissmissDialog();
            }
        },5000);

        comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comenzar = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(comenzar);
            }
        });
    }
}
