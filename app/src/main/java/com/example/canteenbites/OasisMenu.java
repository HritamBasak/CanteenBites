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

public class OasisMenu extends AppCompatActivity {
    TextView buono;
    TextView burger;
    TextView sandwich;
    TextView bread;
    TextView panini;
    TextView toast;
    TextView fries;
    TextView franky;
    TextView shawarma;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_oasis_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        buono=findViewById(R.id.buono);
        buono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(OasisMenu.this,OasisBuono.class);
                startActivity(i);
            }
        });
        burger=findViewById(R.id.curries);
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(OasisMenu.this,OasisBurger.class);
                startActivity(i);
            }
        });
        sandwich=findViewById(R.id.roti);
        sandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(OasisMenu.this,OasisSandwich.class);
                startActivity(i);
            }
        });
        bread=findViewById(R.id.soup);
        bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(OasisMenu.this,OasisBread.class);
                startActivity(i);
            }
        });
        panini=findViewById(R.id.idli);
        panini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(OasisMenu.this,OasisPanini.class);
                startActivity(i);
            }
        });
        toast=findViewById(R.id.friedrice);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(OasisMenu.this,OasisToast.class);
                startActivity(i);
            }
        });
        fries=findViewById(R.id.noodles);
        fries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(OasisMenu.this,OasisFries.class);
                startActivity(i);
            }
        });
        franky=findViewById(R.id.tandoori);
        franky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(OasisMenu.this,OasisFranky.class);
                startActivity(i);
            }
        });
        shawarma=findViewById(R.id.starters);
        shawarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(OasisMenu.this,OasisShawarma.class);
                startActivity(i);
            }
        });
    }
}