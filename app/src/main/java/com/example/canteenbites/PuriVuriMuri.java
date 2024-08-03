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

public class PuriVuriMuri extends AppCompatActivity {
    RecyclerView recyclerView14;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_puri_vuri_muri);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView14=findViewById(R.id.recyclerView14);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.bhelpuri,"BhelPuri"));
        list1.add(new ModelRecipeDosa(R.drawable.popcornbhel,"PopCorn Bhel"));
        list1.add(new ModelRecipeDosa(R.drawable.jalmuri,"JalMuri"));
        list1.add(new ModelRecipeDosa(R.drawable.kurkurebhel,"Kurkure Bhel"));

        AdapterClassSoup adapter= new AdapterClassSoup(PuriVuriMuri.this,list1);
        recyclerView14.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(PuriVuriMuri.this,2);
        recyclerView14.setLayoutManager(gridLayoutManager);
    }
}