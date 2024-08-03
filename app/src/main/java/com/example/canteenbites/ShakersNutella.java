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

public class ShakersNutella extends AppCompatActivity {
    RecyclerView recyclerView57;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shakers_nutella);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView57=findViewById(R.id.recyclerView57);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.choconutella,"Chocochip Nutella"));
        list1.add(new ModelRecipeDosa(R.drawable.nutellabanana,"Nutella Banana"));
        list1.add(new ModelRecipeDosa(R.drawable.nutellablast,"Nutella Chocolate Blast"));

        AdapterClassSoup adapter= new AdapterClassSoup(ShakersNutella.this,list1);
        recyclerView57.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ShakersNutella.this,2);
        recyclerView57.setLayoutManager(gridLayoutManager);
    }
}