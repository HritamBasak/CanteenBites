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

public class Coffeemuffin extends AppCompatActivity {
    RecyclerView recyclerView86;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffeemuffin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView86=findViewById(R.id.recyclerView86);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.chocmuffin,"Chocolate Muffin"));
        list1.add(new ModelRecipeDosa(R.drawable.bananamuffin,"Banana Muffin"));
        list1.add(new ModelRecipeDosa(R.drawable.redmuffin,"Red Velvet Muffin"));

        AdapterClassSoup adapter= new AdapterClassSoup(Coffeemuffin.this,list1);
        recyclerView86.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(Coffeemuffin.this,2);
        recyclerView86.setLayoutManager(gridLayoutManager);
    }
}