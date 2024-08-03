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

public class Coffecof extends AppCompatActivity {
    RecyclerView recyclerView88;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffecof);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView88=findViewById(R.id.recyclerView88);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.filter,"Filter Coffee"));
        list1.add(new ModelRecipeDosa(R.drawable.premimum,"Premium Coffee"));
        list1.add(new ModelRecipeDosa(R.drawable.sukku,"Sukku Coffee"));
        list1.add(new ModelRecipeDosa(R.drawable.black,"Black Coffee"));

        AdapterClassSoup adapter= new AdapterClassSoup(Coffecof.this,list1);
        recyclerView88.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(Coffecof.this,2);
        recyclerView88.setLayoutManager(gridLayoutManager);
    }
}