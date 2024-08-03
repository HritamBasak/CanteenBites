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

public class CoffeePuff extends AppCompatActivity {
    RecyclerView recyclerView81;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffee_puff);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView81=findViewById(R.id.recyclerView81);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.vegp,"Veg Puff"));
        list1.add(new ModelRecipeDosa(R.drawable.eggpuff,"Egg Puff"));
        list1.add(new ModelRecipeDosa(R.drawable.paneerpuff,"Paneer Puff"));
        list1.add(new ModelRecipeDosa(R.drawable.chickenpuff,"Chicken Puff"));
        list1.add(new ModelRecipeDosa(R.drawable.chickenroll,"Chicken Roll"));
        list1.add(new ModelRecipeDosa(R.drawable.chickentikkaroll,"Chicken Tikka Roll"));
        list1.add(new ModelRecipeDosa(R.drawable.chickenhotdog,"Chicken Hot Dog"));

        AdapterClassSoup adapter= new AdapterClassSoup(CoffeePuff.this,list1);
        recyclerView81.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(CoffeePuff.this,2);
        recyclerView81.setLayoutManager(gridLayoutManager);
    }
}