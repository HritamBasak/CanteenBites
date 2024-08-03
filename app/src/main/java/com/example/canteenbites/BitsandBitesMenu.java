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

public class BitsandBitesMenu extends AppCompatActivity {
    TextView dosa;
    TextView roti;
    TextView curries;
    TextView soup;
    TextView idli;
    TextView friedrice;
    TextView noodles;
    TextView tandoori;
    TextView starters;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bitsand_bites_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dosa = findViewById(R.id.buono);
        dosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BitsandBitesMenu.this, BitsandBitesActivity.class);
                startActivity(intent);
            }
        });
        curries = findViewById(R.id.curries);
        curries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BitsandBitesMenu.this, BitsandBitesRoti.class);
                startActivity(intent);
            }
        });
        roti = findViewById(R.id.roti);
        roti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BitsandBitesMenu.this, BitsandBitesCurry.class);
                startActivity(intent);
            }
        });
        soup = findViewById(R.id.soup);
        soup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BitsandBitesMenu.this, BitsandBitesSoup.class);
                startActivity(intent);
            }
        });
        idli = findViewById(R.id.idli);
        idli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BitsandBitesMenu.this, BitsandBitesIdli.class);
                startActivity(intent);
            }
        });
        friedrice = findViewById(R.id.friedrice);
        friedrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BitsandBitesMenu.this, BitsandBitesFriedRice.class);
                startActivity(intent);
            }
        });
        noodles = findViewById(R.id.noodles);
        noodles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BitsandBitesMenu.this, BitsandBitesNoodles.class);
                startActivity(intent);
            }
        });
        tandoori = findViewById(R.id.tandoori);
        tandoori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BitsandBitesMenu.this, BitsandBitesTandoori.class);
                startActivity(intent);
            }
        });
        starters=findViewById(R.id.starters);
        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BitsandBitesMenu.this, BitsandBitesStarters.class);
                startActivity(intent);
            }
        });
    }
}