package com.example.avance2;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

import com.example.avance2.R;

public class PantallaCarga {
    private Activity activity;
    private AlertDialog dialog;

    PantallaCarga (Activity myactivity){
        activity = myactivity;
    }

    void iniciarPantallaCarga(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity,R.style.Theme_AppCompat_Light_NoActionBar);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.pantalla_carga, null));
        builder.setCancelable(false);

        dialog = builder.create();
        dialog.show();
    }

    void dissmissDialog(){
        dialog.dismiss();
    }
}
