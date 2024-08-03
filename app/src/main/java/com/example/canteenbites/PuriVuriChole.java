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

public class PuriVuriChole extends AppCompatActivity {
    RecyclerView recyclerView17;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_puri_vuri_chole);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView17=findViewById(R.id.recyclerView17);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.cholebhature,"Chole Bhature"));
        list1.add(new ModelRecipeDosa(R.drawable.paneerbhature,"Paneer Chole Bhature"));

        AdapterClassSoup adapter= new AdapterClassSoup(PuriVuriChole.this,list1);
        recyclerView17.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(PuriVuriChole.this,2);
        recyclerView17.setLayoutManager(gridLayoutManager);
    }
}