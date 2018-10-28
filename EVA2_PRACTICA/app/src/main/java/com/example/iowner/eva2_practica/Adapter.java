package com.example.iowner.eva2_practica;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by iOwner on 27/10/2018.
 */

public class Adapter extends ArrayAdapter<Restaurant>{
    Context cContexto;
    int iLayoaut;
    Restaurant[] aRestaurantes;
    public Adapter(@NonNull Context context, int resource, @NonNull Restaurant[] objects) {
        super(context, resource, objects);
        cContexto = context;
        iLayoaut = resource;
        aRestaurantes = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LinearLayout layout;
        TextView txtRes, txtDes;

        View vFila = convertView;
        if(vFila == null){//no existe fila creeamos
            //PARA CREAR LA VISTA USAMOS LAYOUTINFLATER
            LayoutInflater liVista = ((Activity)cContexto).getLayoutInflater();
            vFila = liVista.inflate(iLayoaut,parent,false);

        }
        //VINCULAR WIDGETS
        layout = vFila.findViewById(R.id.layout);
        txtRes = vFila.findViewById(R.id.txtRes);
        txtDes = vFila.findViewById(R.id.txtDet);

        Restaurant cActual = aRestaurantes[position];

        layout.setBackgroundResource(cActual.imagen);
        txtRes.setText(cActual.sNombreRes);
        txtDes.setText(cActual.sDescripcion);
        return vFila;
    }
}
