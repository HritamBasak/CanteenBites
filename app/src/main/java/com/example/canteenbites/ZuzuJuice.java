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

public class ZuzuJuice extends AppCompatActivity {
    RecyclerView recyclerView31;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zuzu_juice);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView31=findViewById(R.id.recyclerView31);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.lime,"Fresh Lime"));
        list1.add(new ModelRecipeDosa(R.drawable.buttermilk,"Butter Milk"));
        list1.add(new ModelRecipeDosa(R.drawable.sodalime,"Soda Lime"));
        list1.add(new ModelRecipeDosa(R.drawable.applejuice,"Apple Juice"));
        list1.add(new ModelRecipeDosa(R.drawable.amlajuice,"Amla Juice"));
        list1.add(new ModelRecipeDosa(R.drawable.avogadojuice,"Avogado Juice"));
        list1.add(new ModelRecipeDosa(R.drawable.carrotjuice,"Carrot Juice"));
        list1.add(new ModelRecipeDosa(R.drawable.bananajuice,"Banana Juice"));
        list1.add(new ModelRecipeDosa(R.drawable.guavajuice,"Guava Juice"));
        list1.add(new ModelRecipeDosa(R.drawable.mangojuice,"Mango Juice"));
        list1.add(new ModelRecipeDosa(R.drawable.orangejuice,"Orange Juice"));
        list1.add(new ModelRecipeDosa(R.drawable.watermelonjuice,"Watermelon Juice"));


        AdapterClassSoup adapter= new AdapterClassSoup(ZuzuJuice.this,list1);
        recyclerView31.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ZuzuJuice.this,2);
        recyclerView31.setLayoutManager(gridLayoutManager);
    }
}