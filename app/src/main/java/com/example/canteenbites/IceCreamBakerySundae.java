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

import Adapter5.AdapterSundae;
import Model.ModelRecipeDosa;

public class IceCreamBakerySundae extends AppCompatActivity {
    RecyclerView recyclerView71;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ice_cream_bakery_sundae);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView71=findViewById(R.id.recyclerView71);
        ArrayList<ModelRecipeDosa> list=new ArrayList<>();
        list.add(new ModelRecipeDosa(R.drawable.darknightsundae,"Dark Night Sundae"));
        list.add(new ModelRecipeDosa(R.drawable.glossysundae,"Glossy Sundae"));
        list.add(new ModelRecipeDosa(R.drawable.mochasundae,"Mocha Sundae"));
        list.add(new ModelRecipeDosa(R.drawable.caramelsundae,"Salted Caramel Sundae"));
        list.add(new ModelRecipeDosa(R.drawable.frudgebrowniesundae,"Frudge Brownie Sundae"));

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView71.setLayoutManager(gridLayoutManager);

        AdapterSundae adapterSundae=new AdapterSundae(this,list);
        recyclerView71.setAdapter(adapterSundae);


    }
}