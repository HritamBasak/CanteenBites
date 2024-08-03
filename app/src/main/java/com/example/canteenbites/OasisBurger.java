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

public class OasisBurger extends AppCompatActivity {
    RecyclerView recyclerView21;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_oasis_burger);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView21=findViewById(R.id.recyclerView21);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.vegburger,"Veg Burger"));
        list1.add(new ModelRecipeDosa(R.drawable.paneerburger,"Paneer Burger"));
        list1.add(new ModelRecipeDosa(R.drawable.bbqburger,"BBQ Cottage Burger"));
        list1.add(new ModelRecipeDosa(R.drawable.juicylucy,"Juicy Lucy Burger"));
        list1.add(new ModelRecipeDosa(R.drawable.chickenburger,"Crunchy Chicken Burger"));
        list1.add(new ModelRecipeDosa(R.drawable.chickenburgerr,"Fiery Chicken Burger"));

        AdapterClassSoup adapter= new AdapterClassSoup(OasisBurger.this,list1);
        recyclerView21.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(OasisBurger.this,2);
        recyclerView21.setLayoutManager(gridLayoutManager);
    }
}