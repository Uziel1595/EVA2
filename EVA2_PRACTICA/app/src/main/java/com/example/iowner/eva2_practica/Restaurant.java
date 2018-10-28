package com.example.iowner.eva2_practica;

/**
 * Created by iOwner on 27/10/2018.
 */

public class Restaurant {
    String sNombreRes,sDescripcion,sDireccion,sTele;
    int imagen,imagenG;

    public Restaurant(String nom,String des, int imag,String direc,String tel, int imgG){
        sNombreRes = nom;
        sDescripcion = des;
        imagen = imag;
        sDireccion = direc;
        sTele = tel;
        imagen = imgG;
    }
}
