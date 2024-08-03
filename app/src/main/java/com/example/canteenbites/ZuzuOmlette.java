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

public class ZuzuOmlette extends AppCompatActivity {
    RecyclerView recyclerView36;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zuzu_omlette);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView36=findViewById(R.id.recyclerView36);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.boiledegg,"Boiled Egg"));
        list1.add(new ModelRecipeDosa(R.drawable.plainomlette,"Plain Omlette"));
        list1.add(new ModelRecipeDosa(R.drawable.masalaomlette,"Masala Omlette"));
        list1.add(new ModelRecipeDosa(R.drawable.mushroomomlette,"Mushroom Omlette"));
        list1.add(new ModelRecipeDosa(R.drawable.eggbhurji,"Egg Bhurji"));
        list1.add(new ModelRecipeDosa(R.drawable.breadomlette,"Bread Omlette"));
        list1.add(new ModelRecipeDosa(R.drawable.cheesebreadomlette,"Cheese Bread Omlette"));
        list1.add(new ModelRecipeDosa(R.drawable.frechomlettesandwich,"French Omlette Sandwich"));
        list1.add(new ModelRecipeDosa(R.drawable.mushroomfrench,"Mushroom French Omlette Sandwich"));


        AdapterClassSoup adapter= new AdapterClassSoup(ZuzuOmlette.this,list1);
        recyclerView36.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ZuzuOmlette.this,2);
        recyclerView36.setLayoutManager(gridLayoutManager);
    }
}