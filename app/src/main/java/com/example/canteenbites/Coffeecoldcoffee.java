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

public class Coffeecoldcoffee extends AppCompatActivity {
    RecyclerView recyclerView92;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffeecoldcoffee);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView92=findViewById(R.id.recyclerView92);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.coldcofeee,"Cold Coffee"));
        list1.add(new ModelRecipeDosa(R.drawable.chocolatecoldcofee,"Chocolate Cold Coffee"));
        list1.add(new ModelRecipeDosa(R.drawable.caramelcold,"Caramel Cold Coffee"));
        list1.add(new ModelRecipeDosa(R.drawable.nutellacold,"Nutella Cold Coffee"));

        AdapterClassSoup adapter= new AdapterClassSoup(Coffeecoldcoffee.this,list1);
        recyclerView92.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(Coffeecoldcoffee.this,2);
        recyclerView92.setLayoutManager(gridLayoutManager);
    }
}