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

public class ZuzuMenu extends AppCompatActivity {
    TextView juice;
    TextView coco;
    TextView gola;
    TextView waffle;
    TextView bowl;
    TextView omlette;
    TextView corn;
    TextView thai;
    TextView boba;
    TextView popcorn;
    TextView burmese;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zuzu_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        juice=findViewById(R.id.buono);
        juice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ZuzuMenu.this,ZuzuJuice.class);
                startActivity(i);
            }
        });
        coco=findViewById(R.id.curries);
        coco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ZuzuMenu.this,ZuzuCoconut.class);
                startActivity(i);
            }
        });
        gola=findViewById(R.id.roti);
        gola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ZuzuMenu.this,ZuzuGola.class);
                startActivity(i);
            }
        });
        waffle=findViewById(R.id.soup);
        waffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ZuzuMenu.this,ZuzuWaffle.class);
                startActivity(i);
            }
        });
        bowl=findViewById(R.id.noodles);
        bowl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ZuzuMenu.this,ZuzuBowl.class);
                startActivity(i);
            }
        });
        omlette=findViewById(R.id.idli);
        omlette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ZuzuMenu.this,ZuzuOmlette.class);
                startActivity(i);
            }
        });
        corn=findViewById(R.id.friedrice);
        corn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ZuzuMenu.this,ZuzuCornDog.class);
                startActivity(i);
            }
        });
        thai=findViewById(R.id.tandoori);
        thai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ZuzuMenu.this,ZuzuThai.class);
                startActivity(i);
            }
        });
        boba=findViewById(R.id.boba);
        boba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ZuzuMenu.this,ZuzuBoba.class);
                startActivity(i);
            }
        });
        popcorn=findViewById(R.id.starters);
        popcorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ZuzuMenu.this,ZuzuPopcorn.class);
                startActivity(i);
            }
        });
        burmese=findViewById(R.id.burmese);
        burmese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ZuzuMenu.this,ZuzuBurmese.class);
                startActivity(i);
            }
        });
    }
}