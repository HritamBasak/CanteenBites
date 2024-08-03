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

public class IceCreamBakeryRoyal extends AppCompatActivity {
    RecyclerView recyclerView75;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ice_cream_bakery_royal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView75=findViewById(R.id.recyclerView75);
        ArrayList<ModelRecipeDosa> list=new ArrayList<>();
        list.add(new ModelRecipeDosa(R.drawable.rosegulkand,"Rose Gulkand"));
        list.add(new ModelRecipeDosa(R.drawable.date,"Dates"));
        list.add(new ModelRecipeDosa(R.drawable.anjeer,"Anjeer"));
        list.add(new ModelRecipeDosa(R.drawable.calcuttametha,"Calcutta Metha"));

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView75.setLayoutManager(gridLayoutManager);

        AdapterSundae adapterSundae=new AdapterSundae(this,list);
        recyclerView75.setAdapter(adapterSundae);
    }
}