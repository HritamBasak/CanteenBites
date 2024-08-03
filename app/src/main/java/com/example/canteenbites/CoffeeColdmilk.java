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

public class CoffeeColdmilk extends AppCompatActivity {
    RecyclerView recyclerView91;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffee_coldmilk);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView91=findViewById(R.id.recyclerView91);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.rosemilk,"Special Rose Milk"));
        list1.add(new ModelRecipeDosa(R.drawable.specbadam,"Special Badam Milk"));
        list1.add(new ModelRecipeDosa(R.drawable.specpista,"Special Pista Milk"));

        AdapterClassSoup adapter= new AdapterClassSoup(CoffeeColdmilk.this,list1);
        recyclerView91.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(CoffeeColdmilk.this,2);
        recyclerView91.setLayoutManager(gridLayoutManager);
    }
}