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

public class CoffeCake extends AppCompatActivity {
    RecyclerView recyclerView83;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffe_cake);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView83=findViewById(R.id.recyclerView83);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.bcake,"BlueBerry"));
        list1.add(new ModelRecipeDosa(R.drawable.strawcake,"Strawberry"));
        list1.add(new ModelRecipeDosa(R.drawable.butcake,"ButterScotch"));
        list1.add(new ModelRecipeDosa(R.drawable.blackcaje,"Black Forest"));
        list1.add(new ModelRecipeDosa(R.drawable.whiteforst,"White Forest"));
        list1.add(new ModelRecipeDosa(R.drawable.choccake,"Chocolate"));
        list1.add(new ModelRecipeDosa(R.drawable.almondcake,"Honey Almond"));
        list1.add(new ModelRecipeDosa(R.drawable.rockyroad,"Rocky Road"));
        list1.add(new ModelRecipeDosa(R.drawable.rvelvet,"Red Velvet"));
        list1.add(new ModelRecipeDosa(R.drawable.pincake,"Pineapple"));

        AdapterClassSoup adapter= new AdapterClassSoup(CoffeCake.this,list1);
        recyclerView83.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(CoffeCake.this,2);
        recyclerView83.setLayoutManager(gridLayoutManager);
    }
}