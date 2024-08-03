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

public class ZuzuBoba extends AppCompatActivity {
    RecyclerView recyclerView38;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zuzu_boba);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView38=findViewById(R.id.recyclerView38);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.bobatea,"Boba Tea"));
        list1.add(new ModelRecipeDosa(R.drawable.bobacoffee,"Boba Coffee"));
        list1.add(new ModelRecipeDosa(R.drawable.bobastrawberry,"Boba Strawberry"));
        list1.add(new ModelRecipeDosa(R.drawable.bobachoc,"Boba Chocolate"));
        list1.add(new ModelRecipeDosa(R.drawable.bobamango,"Boba Mango"));
        list1.add(new ModelRecipeDosa(R.drawable.bobalemon,"Boba Lemon"));


        AdapterClassSoup adapter= new AdapterClassSoup(ZuzuBoba.this,list1);
        recyclerView38.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ZuzuBoba.this,2);
        recyclerView38.setLayoutManager(gridLayoutManager);
    }
}