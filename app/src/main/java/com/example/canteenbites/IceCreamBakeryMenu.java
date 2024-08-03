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

public class IceCreamBakeryMenu extends AppCompatActivity {
    TextView buono;
    TextView curries;
    TextView roti;
    TextView soup;
    TextView idli;
    TextView friedrice;;
    TextView noodles;
    TextView tandoori;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ice_cream_bakery_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        buono=findViewById(R.id.buono);
        buono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IceCreamBakeryMenu.this,IceCreamBakeryhotchoco.class);
                startActivity(intent);
            }
        });
        curries=findViewById(R.id.curries);
        curries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IceCreamBakeryMenu.this,IceCreamBakerySundae.class);
                startActivity(intent);
            }
        });
        roti=findViewById(R.id.roti);
        roti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IceCreamBakeryMenu.this,IceCreamBakeryToppings.class);
                startActivity(intent);
            }
        });
        soup=findViewById(R.id.soup);
        soup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IceCreamBakeryMenu.this,IceCreamBakeryExtraAffair.class);
                startActivity(intent);
            }
        });
        idli=findViewById(R.id.idli);
        idli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IceCreamBakeryMenu.this,IceCreamBrownie.class);
                startActivity(intent);
            }
        });
        friedrice=findViewById(R.id.friedrice);
        friedrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IceCreamBakeryMenu.this,IceCreamBakeryRoyal.class);
                startActivity(intent);
            }
        });
        noodles=findViewById(R.id.noodles);
        noodles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IceCreamBakeryMenu.this,IceCreamBakerySeason.class);
                startActivity(intent);
            }
        });
        tandoori=findViewById(R.id.tandoori);
        tandoori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IceCreamBakeryMenu.this,IceCreamBakeryChocoaffair.class);
                startActivity(intent);
            }
        });
    }
}