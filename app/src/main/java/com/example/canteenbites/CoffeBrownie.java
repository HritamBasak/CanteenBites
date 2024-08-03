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

public class CoffeBrownie extends AppCompatActivity {
    RecyclerView recyclerView85;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffe_brownie);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView85=findViewById(R.id.recyclerView85);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.b,"Brownie with Hot Chocolate"));
        list1.add(new ModelRecipeDosa(R.drawable.bb,"Brownie With Ice Cream"));


        AdapterClassSoup adapter= new AdapterClassSoup(CoffeBrownie.this,list1);
        recyclerView85.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(CoffeBrownie.this,2);
        recyclerView85.setLayoutManager(gridLayoutManager);
    }
}