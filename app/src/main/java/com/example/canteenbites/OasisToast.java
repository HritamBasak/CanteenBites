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

public class OasisToast extends AppCompatActivity {
    RecyclerView recyclerView25;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_oasis_toast);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView25=findViewById(R.id.recyclerView25);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.mumbaitoast,"Mumbai Style Toast"));
        list1.add(new ModelRecipeDosa(R.drawable.mushroomtoasy,"Mushroom Toast"));
        list1.add(new ModelRecipeDosa(R.drawable.masalatoast,"Masala Cheese Toast"));
        list1.add(new ModelRecipeDosa(R.drawable.paneertoast,"Spicy Paneer Toast"));
        list1.add(new ModelRecipeDosa(R.drawable.chicktoast,"Mumbai Style Chicken Toast"));
        list1.add(new ModelRecipeDosa(R.drawable.chillitoast,"Chicken Chilli Cheese Toast"));

        AdapterClassSoup adapter= new AdapterClassSoup(OasisToast.this,list1);
        recyclerView25.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(OasisToast.this,2);
        recyclerView25.setLayoutManager(gridLayoutManager);
    }
}