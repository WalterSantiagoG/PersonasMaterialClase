package com.example.santiago.personasmaterialclase;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {

    private RecyclerView listado;
    private ArrayList<Persona> personas;
    private Resources res;
    private AdaptadorPersona adapter;
    private LinearLayoutManager llm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listado = (RecyclerView)findViewById(R.id.lstPersonas);
        res = this.getResources();
        personas = new ArrayList<>();

        /*personas.add(new Persona(R.drawable.images2,"1145432156","Juan","Sanjuan",2));
        personas.add(new Persona(R.drawable.images3,"1145432157","Manuel","Perez",2));
        personas.add(new Persona(R.drawable.images,"1145432158","Angelina","Sarmiento",2));
        personas.add(new Persona(R.drawable.images2,"1145432156","Juan","Sanjuan",2));
        personas.add(new Persona(R.drawable.images3,"1145432157","Manuel","Perez",2));
        personas.add(new Persona(R.drawable.images,"1145432158","Angelina","Sarmiento",2));
        personas.add(new Persona(R.drawable.images2,"1145432156","Juan","Sanjuan",2));
        personas.add(new Persona(R.drawable.images3,"1145432157","Manuel","Perez",2));
        personas.add(new Persona(R.drawable.images,"1145432158","Angelina","Sarmiento",2));*/

        adapter = new AdaptadorPersona(this,personas);
        llm = new LinearLayoutManager(this);
        listado.setLayoutManager(llm);
        listado.setAdapter(adapter);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

    }

    public void agregar(View v){
        Intent i = new Intent(Principal.this,CrearPersonas.class);
        startActivity(i);
    }

}
