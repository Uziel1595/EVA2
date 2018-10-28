package com.example.iowner.eva2_10_cuadros_dialogo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public void general(View v){
        new AlertDialog.Builder(this)
                .setTitle("MI CUADRO DE DIALOGO")
                .setMessage("Cuadro de dialogo general")
                .setPositiveButton("TA GUENO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Principal.this, "DIJITES QUE ESTABA GUENO", Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton("NOPIS", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Principal.this, "DIJITES QUE NEL", Toast.LENGTH_LONG).show();
                    }
                })
                .setNeutralButton("ME VALE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Principal.this, "DIJITES QUE TE VALIA UN CACAHUETE", Toast.LENGTH_LONG).show();
                    }
                })
                .create().show();
    }
    public void personalizado(View v){
        TextView txtView1;
        final EditText editTxt1;
        Button btn1;
        final Dialog dMiCuadrito = new Dialog(this);
        dMiCuadrito.setContentView(R.layout.mi_cuadro_dialogo);
        txtView1 = dMiCuadrito.findViewById(R.id.txtView1);
        editTxt1 = dMiCuadrito.findViewById(R.id.editTxt1);
        btn1 = dMiCuadrito.findViewById(R.id.btn1);
        txtView1.setText("Mi Cuadrito");
        editTxt1.setHint("Dame tu nombre");
        btn1.setText("SALUDAR!!");
        dMiCuadrito.create();
        dMiCuadrito.show();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Principal.this, "HOLA "+editTxt1.getText().toString()+"!!!", Toast.LENGTH_LONG).show();
                dMiCuadrito.dismiss();
            }
        });
    }
}
