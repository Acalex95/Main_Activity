package com.example.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.net.Inet4Address;
import java.util.ArrayList;

public class Menu extends AppCompatActivity {
private ViewFlipper vf;
private int[] images = {R.drawable.a, R.drawable.b, R.drawable.c};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        vf = (ViewFlipper)findViewById(R.id.slider);

        for (int i = 0; i< images.length; i++)
        {
         flip_images(images[i]);
        }

    }

    public void flip_images(int i)
    {
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);

        vf.addView(view);  // contiene arreglo de imagenes
        vf.setAutoStart(true);  // inicia automaticamente
        vf.setFlipInterval(2800); // tiempo de cambio de imagenes del slider

        vf.setInAnimation(this,android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);



    }
    public void maps(View v)
    {
        Intent i = new Intent(this, Maps_act.class);
        startActivity(i);

    }

    public void Informacion (View v)
    {
        Intent i = new Intent(this, Informacion.class);
        startActivity(i);
    }
    public void Cliente (View v ){

        ArrayList<String> clientes = new ArrayList<String>();
        ArrayList<String> planes = new ArrayList<String>();

        clientes.add("Juan");
        clientes.add("Diego");

        planes.add("Xtreme");
        planes.add("Mindfullness");


        Intent i = new Intent(this , Clientes_act.class);

        i.putExtra("Listaclientes",clientes);

        i.putExtra("listaPlanes",planes);

        startActivity(i);

    }
}