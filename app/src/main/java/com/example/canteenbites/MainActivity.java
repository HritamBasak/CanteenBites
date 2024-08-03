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

public class MainActivity extends AppCompatActivity {
    TextView purivuri;
    TextView bits;
    TextView oasis;
    TextView zuzu;
    TextView shakers;
    TextView ice;
    TextView coffee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        purivuri=findViewById(R.id.purivuri);
        purivuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,BitsandBitesMenu.class);
                startActivity(i);
            }
        });
        bits=findViewById(R.id.bits);
        bits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,PuriVuriMenu.class);
                startActivity(i);
            }
        });
        oasis=findViewById(R.id.oasis);
        oasis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,OasisMenu.class);
                startActivity(i);
            }
        });
        zuzu=findViewById(R.id.zuzu);
        zuzu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,ZuzuMenu.class);
                startActivity(i);
            }
        });
        shakers=findViewById(R.id.shakers);
        shakers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,ShakersMenu.class);
                startActivity(i);
            }
        });
        ice=findViewById(R.id.icecream);
        ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,IceCreamBakeryMenu.class);
                startActivity(i);
            }
        });
        coffee=findViewById(R.id.coffee);
        coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,CoffeShop.class);
                startActivity(i);
            }
        });
    }
}