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

public class ZuzuBurmese extends AppCompatActivity {
    RecyclerView recyclerView41;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zuzu_burmese);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView41=findViewById(R.id.recyclerView41);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.atho,"Burmese Atho Veg"));
        list1.add(new ModelRecipeDosa(R.drawable.athoegg,"Burmese Atho Egg"));
        list1.add(new ModelRecipeDosa(R.drawable.chickennn,"Burmese Atho Chicken"));
        list1.add(new ModelRecipeDosa(R.drawable.eggmasala,"Burmese Egg Masala"));


        AdapterClassSoup adapter= new AdapterClassSoup(ZuzuBurmese.this,list1);
        recyclerView41.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ZuzuBurmese.this,2);
        recyclerView41.setLayoutManager(gridLayoutManager);
    }
}