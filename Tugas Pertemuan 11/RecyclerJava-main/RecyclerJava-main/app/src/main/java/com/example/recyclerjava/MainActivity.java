package com.example.recyclerjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerPersonas.OnSelected {

    RecyclerView recyclerView;

    RecyclerPersonas recyclerPersonas;

    List<Persona> listaPersonas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instancias();

        recyclerView.setAdapter(recyclerPersonas);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),RecyclerView.VERTICAL,false));
        recyclerPersonas.notifyDataSetChanged();


        listaPersonas.add(new Persona("https://owcdn.net/img/62bbeba74d5cb.png","PAPER REX"));
        listaPersonas.add(new Persona("https://upload.wikimedia.org/wikipedia/en/thumb/2/24/Sentinels_Logo.svg/1200px-Sentinels_Logo.svg.png","SENTINELS"));
        listaPersonas.add(new Persona("https://revivalpedia.s3.ap-southeast-1.amazonaws.com/images/teams/1619773863-Crazy%20Raccoon.png","CRAZY RACCOON"));
        listaPersonas.add(new Persona("https://liquipedia.net/commons/images/9/92/Liberty_2021_full_lightmode.png","HAVAN LIBERTY"));
        listaPersonas.add(new Persona("https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Bren_Esports.png/1200px-Bren_Esports.png","BERN ESPORTS"));

    }

    private void instancias() {

        listaPersonas = new ArrayList();
        recyclerView = findViewById(R.id.listado);
        recyclerPersonas = new RecyclerPersonas(listaPersonas,MainActivity.this);


    }


    @Override
    public void SelectedNombre(Persona persona) {
        Toast.makeText(getApplicationContext(),"Nombre: "+persona.nombre,Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Detalle.class);
        intent.putExtra("imagen",persona.imagen);
        intent.putExtra("nombre",persona.nombre);
        intent.putExtra("apellido",persona.apellido);
        startActivity(intent);
    }
}