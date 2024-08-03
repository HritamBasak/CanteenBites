package com.example.canteenbites;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.AdapterClassSoup;
import Model.ModelRecipeDosa;

public class CoffeeCupcake extends AppCompatActivity {
    RecyclerView recyclerView82;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffee_cupcake);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView82=findViewById(R.id.recyclerView82);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.choccup,"Chocolate Cup Cake"));
        list1.add(new ModelRecipeDosa(R.drawable.redvelvcup,"Red Velvet Cup cake"));
        list1.add(new ModelRecipeDosa(R.drawable.vancup,"Vanilla Cup Cake"));
        list1.add(new ModelRecipeDosa(R.drawable.raincup,"Rainbow Cup Cake"));

        AdapterClassSoup adapter= new AdapterClassSoup(CoffeeCupcake.this,list1);
        recyclerView82.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(CoffeeCupcake.this,2);
        recyclerView82.setLayoutManager(gridLayoutManager);
    }
}