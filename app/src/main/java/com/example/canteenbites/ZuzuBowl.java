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

public class ZuzuBowl extends AppCompatActivity {
    RecyclerView recyclerView35;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zuzu_bowl);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView35=findViewById(R.id.recyclerView35);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.fruitbowl,"Fruit Bowl"));
        list1.add(new ModelRecipeDosa(R.drawable.vegsalad,"Veg Salad"));
        list1.add(new ModelRecipeDosa(R.drawable.eggsalad,"Egg Salad"));
        list1.add(new ModelRecipeDosa(R.drawable.chickensalad,"Chicken Salad"));
        list1.add(new ModelRecipeDosa(R.drawable.vegexocticsalad,"Veg Exoctic Salad"));


        AdapterClassSoup adapter= new AdapterClassSoup(ZuzuBowl.this,list1);
        recyclerView35.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ZuzuBowl.this,2);
        recyclerView35.setLayoutManager(gridLayoutManager);
    }
}