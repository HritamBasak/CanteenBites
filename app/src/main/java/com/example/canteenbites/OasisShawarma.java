package com.example.canteenbites;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.AdapterClassSoup;
import Model.ModelRecipeDosa;

public class OasisShawarma extends AppCompatActivity {

    RecyclerView recyclerView30;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_oasis_shawarma);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView30=findViewById(R.id.recyclerView30);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.shawarmaa,"Classic Arabian Shawarma improved with extra spicy Roasted Chicken"));
        list1.add(new ModelRecipeDosa(R.drawable.shawarmaaa,"A modern touch to the mystic Shawarma from the land of Persia"));
        list1.add(new ModelRecipeDosa(R.drawable.shawarmaaaa,"Indulge in the magic of mayo with a load of yummy Chicken"));

        AdapterClassSoup adapter= new AdapterClassSoup(OasisShawarma.this,list1);
        recyclerView30.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(OasisShawarma.this);
        recyclerView30.setLayoutManager(linearLayoutManager);
    }
}