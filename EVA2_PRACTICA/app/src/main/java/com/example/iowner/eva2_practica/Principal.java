package com.example.iowner.eva2_practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{
    Restaurant[] restaurantes = {new Restaurant("Cafe y reposteria","Cafe, pastelitos, etc",R.drawable.bourkestreetbakery,"Calle 1 Col Perez","15627",R.drawable.bourkestreetbakery3x),
            new Restaurant("Cafe Dead","El mejor cafe",R.drawable.cafedeadend,"Calle 3 Col Holguin","12374",R.drawable.cafedeadend3x),
            new Restaurant("Cafe Lois","Todo tipo de cafe al estilo de Lois",R.drawable.cafeloisl,"Calle 2 Col Gonzales","123759",R.drawable.cafeloisl3x),
            new Restaurant("Postres y mas","Todo tipo de postres",R.drawable.fiveleaves,"Calle 4 Col Herrera","23127",R.drawable.fiveleaves3x),
            new Restaurant("Cafe Lore","Cafes",R.drawable.cafelore,"Calle 10 Col Herrera","1531617",R.drawable.cafelore3x),
            new Restaurant("Meats Graham","Todo tipo de comidas",R.drawable.grahamavenuemeats,"Calle 12 Col Hernandez","15127",R.drawable.grahamavenuemeats3x),
            new Restaurant("Cafe Home","Cafe como el de tu casa",R.drawable.homei,"Calle 7 Col Campillo","11327",R.drawable.homei3x),
            new Restaurant("Po's Atelier","Restaurant 5 estrellas",R.drawable.posatelier,"Calle 8 Col Gomez","114127",R.drawable.posatelier3x),
            new Restaurant("Teakha","Carnes y mas",R.drawable.teakha,"Calle 23 Col Centro","15124551",R.drawable.upstate3x),
            new Restaurant("Traif","Comidas y cenas VIP",R.drawable.traif,"Calle Perez Col Norte","1234156627",R.drawable.traif3x),
            new Restaurant("Barra Fina","Restaurante Gourment",R.drawable.barrafina,"Calle 42 Col Industrias","7682134",R.drawable.barrafina3x),
            new Restaurant("Pizzas Pepe Roni","Pizzas",R.drawable.confessional,"Calle Allende Col Emiliano","65227",R.drawable.confessional3x),
            new Restaurant("Brochetas","Carnes y mas",R.drawable.donostia,"Calle 1 Col SENTE","35277",R.drawable.donostia3x),
            new Restaurant("Paninis Panin","Sandwich y paninis",R.drawable.forkeerestaurant,"Calle Primera Col Rodriguez","99532",R.drawable.forkeerestaurant3x),
            new Restaurant("Postres Delicia","Los mejores postres",R.drawable.haighschocolate,"Calle 41 Col Perez","151237",R.drawable.haighschocolate3x),
            new Restaurant("Express","Cafes expresso",R.drawable.palominoespresso,"Calle Sierra de alla Col Aca","62512357",R.drawable.palominoespresso3x),
            new Restaurant("Comida de mar","Todo tipo de mariscos",R.drawable.petiteoyster,"Calle Segunda Col Segunda","654627",R.drawable.petiteoyster3x),
            new Restaurant("Dinners","Diners y mas",R.drawable.royaloak,"Calle Sur Col Este","1111127",R.drawable.royaloak3x),
            new Restaurant("Postres y cafe","Cafes y postres",R.drawable.thaicafe,"Calle Mangos Col Delicias","5563472",R.drawable.thaicafe3x),
            new Restaurant("Upstate","Alitas y mas",R.drawable.upstate,"Calle Melon Col Delicias","78693",R.drawable.upstate3x),
            new Restaurant("Wolf Waffles","Waffles",R.drawable.wafflewolf,"Calle 1 Col Perez","324354",R.drawable.wafflewolf3x)};

    ListView list;
    Intent iRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        list = findViewById(R.id.list_Res);
        list.setAdapter(new Adapter(this,R.layout.restaurant,restaurantes));
        list.setOnItemClickListener(this);
        iRes = new Intent(this,DetalleRes.class);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        iRes.putExtra("img",restaurantes[i].imagen);
        iRes.putExtra("imgG",restaurantes[i].imagenG);
        iRes.putExtra("nom",restaurantes[i].sNombreRes);
        iRes.putExtra("des",restaurantes[i].sDescripcion);
        iRes.putExtra("dir",restaurantes[i].sDireccion);
        iRes.putExtra("tel",restaurantes[i].sTele);


        startActivity(iRes);

    }
}
