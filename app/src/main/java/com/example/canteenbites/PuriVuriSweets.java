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

public class PuriVuriSweets extends AppCompatActivity {
    RecyclerView recyclerView18;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_puri_vuri_sweets);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView18=findViewById(R.id.recyclerView18);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.gulabjamun,"Gulab Jamun"));
        list1.add(new ModelRecipeDosa(R.drawable.rasmalai,"Rasmalai"));
        list1.add(new ModelRecipeDosa(R.drawable.rajbhog,"Rajbhog"));
        list1.add(new ModelRecipeDosa(R.drawable.rasgulla,"Rasgulla"));

        AdapterClassSoup adapter= new AdapterClassSoup(PuriVuriSweets.this,list1);
        recyclerView18.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(PuriVuriSweets.this,2);
        recyclerView18.setLayoutManager(gridLayoutManager);
    }
}