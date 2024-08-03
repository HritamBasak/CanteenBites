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

public class PuriVuriPuchka extends AppCompatActivity {
    RecyclerView recyclerView10;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_puri_vuri_puchka);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView10=findViewById(R.id.recyclerView10);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.panipuri,"Pani Puri"));
        list1.add(new ModelRecipeDosa(R.drawable.dahipuri,"Dahi Puri"));
        list1.add(new ModelRecipeDosa(R.drawable.sevpuri,"Sev Puri"));
        list1.add(new ModelRecipeDosa(R.drawable.masalapuri,"Masala Puri"));

        AdapterClassSoup adapter= new AdapterClassSoup(PuriVuriPuchka.this,list1);
        recyclerView10.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(PuriVuriPuchka.this,2);
        recyclerView10.setLayoutManager(gridLayoutManager);
    }
}