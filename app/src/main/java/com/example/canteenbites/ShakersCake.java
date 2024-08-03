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

public class ShakersCake extends AppCompatActivity {
    RecyclerView recyclerView61;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shakers_cake);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView61=findViewById(R.id.recyclerView61);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.redvelvetshake,"Red Velvet"));
        list1.add(new ModelRecipeDosa(R.drawable.blackforestshake,"Black Forest"));
        list1.add(new ModelRecipeDosa(R.drawable.almondshake,"White Almond"));
        list1.add(new ModelRecipeDosa(R.drawable.chocoshake,"Choco Roco Cake"));

        AdapterClassSoup adapter= new AdapterClassSoup(ShakersCake.this,list1);
        recyclerView61.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ShakersCake.this,2);
        recyclerView61.setLayoutManager(gridLayoutManager);
    }
}