package com.example.avance2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ClientePeso.CalcularPesoIdeal;

public class Main3Activity extends AppCompatActivity {

    TextView tv;
    ImageView imgPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv = (TextView) findViewById(R.id.tv);
        imgPeso = (ImageView) findViewById(R.id.imgPeso);
        getSupportActionBar().setTitle("Volver");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();

        /*
        * -La regla Genero-
        * Genero 0 es hombre
        * Genero 1 es mujer
        * -La regla Peso-
        * Peso se mide por kg
        * -La regla Altura-
        * Se mide por cm
        * */

        Integer sex, pes, altu;

        if (extras != null) {
            pes = extras.getInt("peso");
            altu = extras.getInt("altura");
            sex = extras.getInt("sex");
            final CalcularPesoIdeal nuevo = new CalcularPesoIdeal();
            nuevo.setCategoria(sex);
            nuevo.setPeso(pes);
            nuevo.setTalla(altu);
            tv.setText(nuevo.mostrarResultado());
            if (nuevo.calcularIMC() <= 18.5) {
                imgPeso.setImageResource(R.drawable.bajo);
            } else if (nuevo.calcularIMC() < 25) {
                imgPeso.setImageResource(R.drawable.normal);
            } else if (nuevo.calcularIMC() < 30) {
                imgPeso.setImageResource(R.drawable.sobrepeso);
            } else {
                imgPeso.setImageResource(R.drawable.obeso);
            }
        }
    }
}