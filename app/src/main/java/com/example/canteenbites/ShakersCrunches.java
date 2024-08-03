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

public class ShakersCrunches extends AppCompatActivity {
    RecyclerView recyclerView58;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shakers_crunches);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView58=findViewById(R.id.recyclerView58);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.bananacrunch,"Banana Crunch"));
        list1.add(new ModelRecipeDosa(R.drawable.caramelcrunch,"Caramel Crunch"));
        list1.add(new ModelRecipeDosa(R.drawable.strawberrycrunch,"Strawberry Crunch"));

        AdapterClassSoup adapter= new AdapterClassSoup(ShakersCrunches.this,list1);
        recyclerView58.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ShakersCrunches.this,2);
        recyclerView58.setLayoutManager(gridLayoutManager);
    }
}