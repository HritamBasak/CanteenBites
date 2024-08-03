package com.example.canteenbites;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PuriVuriMenu extends AppCompatActivity {
    TextView puchka;
    TextView dahi;
    TextView chaat;
    TextView pav;
    TextView muri;
    TextView dabeli;
    TextView bhaji;
    TextView chole;
    TextView sweets;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_puri_vuri_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        puchka=findViewById(R.id.buono);
        puchka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PuriVuriMenu.this,PuriVuriPuchka.class);
                startActivity(i);
            }
        });
        dahi=findViewById(R.id.curries);
        dahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PuriVuriMenu.this,PuriVuriDahi.class);
                startActivity(i);
            }
        });
        chaat=findViewById(R.id.roti);
        chaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PuriVuriMenu.this,PuriVuriChaat.class);
                startActivity(i);
            }
        });
        pav=findViewById(R.id.soup);
        pav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PuriVuriMenu.this,PuriVuriPav.class);
                startActivity(i);
            }
        });
        muri=findViewById(R.id.idli);
        muri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PuriVuriMenu.this,PuriVuriMuri.class);
                startActivity(i);
            }
        });
        dabeli=findViewById(R.id.friedrice);
        dabeli .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PuriVuriMenu.this,PuriVuridabeli.class);
                startActivity(i);
            }
        });
        bhaji=findViewById(R.id.noodles);
        bhaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PuriVuriMenu.this,PuriVuriBhaji.class);
                startActivity(i);
            }
        });
        chole=findViewById(R.id.tandoori);
        chole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PuriVuriMenu.this,PuriVuriChole.class);
                startActivity(i);
            }
        });
        sweets=findViewById(R.id.starters);
        sweets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(PuriVuriMenu.this,PuriVuriSweets.class);
                startActivity(i);
            }
        });
    }
}