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

public class PuriVuriBhaji extends AppCompatActivity {
    RecyclerView recyclerView16;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_puri_vuri_bhaji);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView16=findViewById(R.id.recyclerView16);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.pavbhajii,"Pav Bhaji"));
        list1.add(new ModelRecipeDosa(R.drawable.cheesepavbhaji,"Cheese Pav Bhaji"));
        list1.add(new ModelRecipeDosa(R.drawable.masalapavbhaji,"Masala Pav Bhaji"));
        list1.add(new ModelRecipeDosa(R.drawable.paneerpavbhaji,"Paneer Pav Bhaji"));

        AdapterClassSoup adapter= new AdapterClassSoup(PuriVuriBhaji.this,list1);
        recyclerView16.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(PuriVuriBhaji.this,2);
        recyclerView16.setLayoutManager(gridLayoutManager);
    }
}