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

public class ShakersChocolate extends AppCompatActivity {
    RecyclerView recyclerView51;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shakers_chocolate);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView51=findViewById(R.id.recyclerView51);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.kitkatshake,"KitKat"));
        list1.add(new ModelRecipeDosa(R.drawable.oreoshak,"Oreo Go Nuts"));
        list1.add(new ModelRecipeDosa(R.drawable.cookieshake,"Cookie and Cream"));
        list1.add(new ModelRecipeDosa(R.drawable.caramelshake,"Caramel Carnival"));
        list1.add(new ModelRecipeDosa(R.drawable.chocochipshake,"Triple Choco Chip"));
        list1.add(new ModelRecipeDosa(R.drawable.snickersshake,"Snickers"));
        list1.add(new ModelRecipeDosa(R.drawable.gemsshake,"Gems"));

        AdapterClassSoup adapter= new AdapterClassSoup(ShakersChocolate.this,list1);
        recyclerView51.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ShakersChocolate.this,2);
        recyclerView51.setLayoutManager(gridLayoutManager);
    }
}