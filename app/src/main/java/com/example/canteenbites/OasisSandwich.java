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

public class OasisSandwich extends AppCompatActivity {
    RecyclerView recyclerView22;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_oasis_sandwich);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView22=findViewById(R.id.recyclerView22);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.cocktailsandwich,"Cocktail Sandwich"));
        list1.add(new ModelRecipeDosa(R.drawable.italiansand,"Italian Sandwich"));
        list1.add(new ModelRecipeDosa(R.drawable.cornsand,"Corn Cheese Sandwich"));
        list1.add(new ModelRecipeDosa(R.drawable.paneersand,"Paneer Sandwich"));
        list1.add(new ModelRecipeDosa(R.drawable.chickensand,"Chicken Tikka Sandwich"));
        list1.add(new ModelRecipeDosa(R.drawable.chickensandd,"Chicken Sandwich"));

        AdapterClassSoup adapter= new AdapterClassSoup(OasisSandwich.this,list1);
        recyclerView22.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(OasisSandwich.this,2);
        recyclerView22.setLayoutManager(gridLayoutManager);
    }
}