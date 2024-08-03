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

import Adapter5.AdapterSundae;
import Model.ModelRecipeDosa;

public class IceCreamBakerySeason extends AppCompatActivity {
    RecyclerView recyclerView76;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ice_cream_bakery_season);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView76=findViewById(R.id.recyclerView76);
        ArrayList<ModelRecipeDosa> list=new ArrayList<>();
        list.add(new ModelRecipeDosa(R.drawable.chiku,"Chiku"));
        list.add(new ModelRecipeDosa(R.drawable.watice,"Watermelon"));
        list.add(new ModelRecipeDosa(R.drawable.mjushwatice,"Musk-WaterMelon"));
        list.add(new ModelRecipeDosa(R.drawable.guavaice,"Guava Chilli"));
        list.add(new ModelRecipeDosa(R.drawable.bananacaramel,"Banana Caramel"));
        list.add(new ModelRecipeDosa(R.drawable.strawice,"Strawberry"));
        list.add(new ModelRecipeDosa(R.drawable.plumice,"Plum"));
        list.add(new ModelRecipeDosa(R.drawable.cocoice,"Tender Coconut"));
        list.add(new ModelRecipeDosa(R.drawable.kiwiice,"Kiwi"));
        list.add(new ModelRecipeDosa(R.drawable.sitaphalice,"Sitaphal"));
        list.add(new ModelRecipeDosa(R.drawable.mangoice,"Mango"));
        list.add(new ModelRecipeDosa(R.drawable.mangovanilla,"Mango Vanilla"));


        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView76.setLayoutManager(gridLayoutManager);

        AdapterSundae adapterSundae=new AdapterSundae(this,list);
        recyclerView76.setAdapter(adapterSundae);
    }
}