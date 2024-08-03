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

public class ZuzuWaffle extends AppCompatActivity {
    RecyclerView recyclerView34;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zuzu_waffle);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView34=findViewById(R.id.recyclerView34);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.maple,"Maple Butter Waffle"));
        list1.add(new ModelRecipeDosa(R.drawable.chocolatewaffle,"Milk Chocolate Waffle"));
        list1.add(new ModelRecipeDosa(R.drawable.darkchocowaffle,"Dark Chocolate Waffle"));
        list1.add(new ModelRecipeDosa(R.drawable.butterscothwaffle,"ButterScoth Waffle"));
        list1.add(new ModelRecipeDosa(R.drawable.nutella,"Nutella Waffle"));
        list1.add(new ModelRecipeDosa(R.drawable.kitkatwaffle,"Kit Kat Waffle"));
        list1.add(new ModelRecipeDosa(R.drawable.strawberrywaffle,"Strawberry Waffle"));
        list1.add(new ModelRecipeDosa(R.drawable.blueberry,"BlueBerry Waffle"));
        list1.add(new ModelRecipeDosa(R.drawable.redvelvetwaffle,"RedVelvet Waffle"));
        list1.add(new ModelRecipeDosa(R.drawable.triple,"Triple Chocolate Waffle"));
        list1.add(new ModelRecipeDosa(R.drawable.pancakee,"Pan Cake"));
        list1.add(new ModelRecipeDosa(R.drawable.chocopancake,"Chocolate Pan Cake"));
        list1.add(new ModelRecipeDosa(R.drawable.wafflestick,"Waffle Stick"));
        list1.add(new ModelRecipeDosa(R.drawable.chocopancake,"Chocolate Pan Cake"));


        AdapterClassSoup adapter= new AdapterClassSoup(ZuzuWaffle.this,list1);
        recyclerView34.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ZuzuWaffle.this,2);
        recyclerView34.setLayoutManager(gridLayoutManager);
    }
}