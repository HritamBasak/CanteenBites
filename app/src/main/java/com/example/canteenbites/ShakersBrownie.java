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

public class ShakersBrownie extends AppCompatActivity {
    RecyclerView recyclerView55;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shakers_brownie);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView55=findViewById(R.id.recyclerView55);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.nutellabrownie,"Nutella Brownie"));
        list1.add(new ModelRecipeDosa(R.drawable.oreobrownie,"Oreo Brownie"));
        list1.add(new ModelRecipeDosa(R.drawable.chocochipbrownie,"Chocochip Brownie"));
        list1.add(new ModelRecipeDosa(R.drawable.chocobrownie,"Choco Brownie"));

        AdapterClassSoup adapter= new AdapterClassSoup(ShakersBrownie.this,list1);
        recyclerView55.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ShakersBrownie.this,2);
        recyclerView55.setLayoutManager(gridLayoutManager);
    }
}