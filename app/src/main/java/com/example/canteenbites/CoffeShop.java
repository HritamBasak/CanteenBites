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

public class CoffeShop extends AppCompatActivity {
    TextView buono;
    TextView curries;
    TextView roti;
    TextView soup;
    TextView idli;
    TextView friedrice;
    TextView noodles;
    TextView tandoori;
    TextView starters;
    TextView milk;
    TextView tea;
    TextView coldmilk;
    TextView coldcoffee;
    TextView lassi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffe_shop);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        buono=findViewById(R.id.buono);
        buono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,CoffePastry.class);
                startActivity(i);
            }
        });
        curries=findViewById(R.id.curries);
        curries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,CoffeePuff.class);
                startActivity(i);
            }
        });
        roti=findViewById(R.id.roti);
        roti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,CoffeeCupcake.class);
                startActivity(i);
            }
        });
        soup=findViewById(R.id.soup);
        soup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,CoffeCake.class);
                startActivity(i);
            }
        });
        idli=findViewById(R.id.idli);
        idli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,CoffeDonut.class);
                startActivity(i);
            }
        });
        friedrice=findViewById(R.id.friedrice);
        friedrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,CoffeBrownie.class);
                startActivity(i);
            }
        });
        noodles=findViewById(R.id.noodles);
        noodles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,Coffeemuffin.class);
                startActivity(i);
            }
        });
        tandoori=findViewById(R.id.tandoori);
        tandoori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,Coffewaffles.class);
                startActivity(i);
            }
        });
        starters=findViewById(R.id.starters);
        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,Coffecof.class);
                startActivity(i);
            }
        });
        milk=findViewById(R.id.milk);
        milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,Coffemilk.class);
                startActivity(i);
            }
        });
        tea=findViewById(R.id.tea);
        tea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,Coffeteq.class);
                startActivity(i);
            }
        });
        coldmilk=findViewById(R.id.coldmilk);
        coldmilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,CoffeeColdmilk.class);
                startActivity(i);
            }
        });
        coldcoffee=findViewById(R.id.coldcoffees);
        coldcoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,Coffeecoldcoffee.class);
                startActivity(i);
            }
        });
        lassi=findViewById(R.id.lassi);
        lassi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(CoffeShop.this,Coffelassi.class);
                startActivity(i);
            }
        });
    }
}