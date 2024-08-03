package com.example.canteenbites;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShakersMenu extends AppCompatActivity {
    TextView fruit;
    TextView choco;
    TextView trispy;
    TextView oreons;
    TextView banana;
    TextView friedrice;
    TextView noodles;
    TextView tandoori;
    TextView starters;
    TextView cake;
    TextView splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shakers_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        fruit=findViewById(R.id.buono);
        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShakersMenu.this,ShakersFruit.class);
                startActivity(intent);
            }
        });
        choco=findViewById(R.id.curries);
        choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShakersMenu.this,ShakersChocolate.class);
                startActivity(intent);
            }
        });
        trispy=findViewById(R.id.roti);
        trispy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShakersMenu.this,Shakerstrispy.class);
                startActivity(intent);
            }
        });
        oreons=findViewById(R.id.soup);
        oreons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShakersMenu.this,ShakersOreons.class);
                startActivity(intent);
            }
        });
        banana=findViewById(R.id.idli);
        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShakersMenu.this,Shakersbanana.class);
                startActivity(intent);
            }
        });
        friedrice=findViewById(R.id.friedrice);
        friedrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShakersMenu.this,ShakersBrownie.class);
                startActivity(intent);
            }
        });
        noodles=findViewById(R.id.noodles);
        noodles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShakersMenu.this,ShakersFrappes.class);
                startActivity(intent);
            }
        });
        tandoori=findViewById(R.id.tandoori);
        tandoori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShakersMenu.this,ShakersNutella.class);
                startActivity(intent);
            }
        });
        starters=findViewById(R.id.starters);
        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShakersMenu.this,ShakersCrunches.class);
                startActivity(intent);
            }
        });
        cake=findViewById(R.id.shakes);
        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShakersMenu.this,ShakersCake.class);
                startActivity(intent);
            }
        });
        splash=findViewById(R.id.cake);
        splash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ShakersMenu.this,ProtienSlushySplash.class);
                startActivity(intent);
            }
        });
    }
}