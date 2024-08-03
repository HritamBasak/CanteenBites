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

public class ShakersOreons extends AppCompatActivity {
    RecyclerView recyclerView200;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shakers_oreons);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView200=findViewById(R.id.recyclerView200);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.c,"Oreo Choco Chip"));
        list1.add(new ModelRecipeDosa(R.drawable.cc,"Choco Oreo"));
        list1.add(new ModelRecipeDosa(R.drawable.ccc,"Blueberry Oreo"));
        list1.add(new ModelRecipeDosa(R.drawable.blackcurrent,"Black Currant Oreo"));
        list1.add(new ModelRecipeDosa(R.drawable.cccc,"Kitkat Oreo"));

        AdapterClassSoup adapter= new AdapterClassSoup(ShakersOreons.this,list1);
        recyclerView200.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ShakersOreons.this,2);
        recyclerView200.setLayoutManager(gridLayoutManager);
    }
}