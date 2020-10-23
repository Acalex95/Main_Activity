package com.example.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import Clases.Planes;

public class Clientes_act extends AppCompatActivity {

    private Spinner spin1, spin2;
    private EditText edit;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes_act);

        spin1 = (Spinner)findViewById(R.id.spClientes);
        spin2 = (Spinner)findViewById(R.id. spPlanes);
        edit = (EditText)findViewById(R.id.et);
        texto = (TextView)findViewById(R.id.et);

        ArrayList<String> Listaclientes = (ArrayList<String>) getIntent().getSerializableExtra("Listaclientes");

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Listaclientes);

        spin1.setAdapter(adapt);

        ArrayList<String> listaPlanes = (ArrayList<String>) getIntent().getSerializableExtra("listaPlanes");

        ArrayAdapter<String> adap = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaPlanes);

        spin2.setAdapter(adap);

    }

    public void calcular (View v){

        String clientes = spin1.getSelectedItem().toString();
        String planes = spin2.getSelectedItem().toString();

        Planes plan = new Planes();

        if (clientes.equals("Juan") && planes.equals("Xtreme")){

            texto.setText("El precio es: "+ plan.getPlanXtreme());

        }
        if (clientes.equals("Juan") && planes.equals("Mindfullness")){

            texto.setText("El precio es: " + plan.getPlanMindfullness());
        }


    }
}