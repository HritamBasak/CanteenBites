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

public class Shakersbanana extends AppCompatActivity {
    RecyclerView recyclerView54;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shakersbanana);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView54=findViewById(R.id.recyclerView54);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.strawban,"Strawberry Banana"));
        list1.add(new ModelRecipeDosa(R.drawable.oreobanana,"Oreo Banana"));
        list1.add(new ModelRecipeDosa(R.drawable.chocochipbanana,"Chocochip Banana"));
        list1.add(new ModelRecipeDosa(R.drawable.browniebanana,"Brownie Banana"));
        list1.add(new ModelRecipeDosa(R.drawable.caramelbanana,"Caramel Banana"));
        list1.add(new ModelRecipeDosa(R.drawable.bananagulkand,"Banana Gulkand"));
        list1.add(new ModelRecipeDosa(R.drawable.bananaberry,"Banana Berry"));

        AdapterClassSoup adapter= new AdapterClassSoup(Shakersbanana.this,list1);
        recyclerView54.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(Shakersbanana.this,2);
        recyclerView54.setLayoutManager(gridLayoutManager);
    }
}