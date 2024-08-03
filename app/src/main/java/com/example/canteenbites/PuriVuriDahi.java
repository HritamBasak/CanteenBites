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

public class PuriVuriDahi extends AppCompatActivity {
    RecyclerView recyclerView11;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_puri_vuri_dahi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView11=findViewById(R.id.recyclerView11);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.malaivada,"Malai Dahi Vada"));
        list1.add(new ModelRecipeDosa(R.drawable.dahipapdi,"Dahi Papidi"));
        list1.add(new ModelRecipeDosa(R.drawable.dahisamosa,"Dahi Samosa"));
        list1.add(new ModelRecipeDosa(R.drawable.dahikachodi,"Dahi Kachodi"));
        list1.add(new ModelRecipeDosa(R.drawable.rajkachodi,"Raj kachodi"));
        list1.add(new ModelRecipeDosa(R.drawable.dhoklachat,"Dokla Chat"));

        AdapterClassSoup adapter= new AdapterClassSoup(PuriVuriDahi.this,list1);
        recyclerView11.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(PuriVuriDahi.this,2);
        recyclerView11.setLayoutManager(gridLayoutManager);
    }
}