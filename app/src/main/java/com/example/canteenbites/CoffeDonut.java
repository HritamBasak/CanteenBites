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

public class CoffeDonut extends AppCompatActivity {
    RecyclerView recyclerView84;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffe_donut);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView84=findViewById(R.id.recyclerView84);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.chocdonut,"Chocolate Doughnut"));
        list1.add(new ModelRecipeDosa(R.drawable.strawdonut,"Strawberry Doughnut"));
        list1.add(new ModelRecipeDosa(R.drawable.vanilladonut,"Vanilla Doughnut"));
        list1.add(new ModelRecipeDosa(R.drawable.minidonut,"Mini Doughnut"));

        AdapterClassSoup adapter= new AdapterClassSoup(CoffeDonut.this,list1);
        recyclerView84.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(CoffeDonut.this,2);
        recyclerView84.setLayoutManager(gridLayoutManager);
    }
}