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

public class ZuzuCornDog extends AppCompatActivity {
    RecyclerView recyclerView37;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zuzu_corn_dog);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView37=findViewById(R.id.recyclerView37);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.korean,"Korean Corn Dog(Veg)"));
        list1.add(new ModelRecipeDosa(R.drawable.koreannonveg,"Korean Corn Dog(Non-Veg)"));


        AdapterClassSoup adapter= new AdapterClassSoup(ZuzuCornDog.this,list1);
        recyclerView37.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ZuzuCornDog.this,2);
        recyclerView37.setLayoutManager(gridLayoutManager);
    }
}