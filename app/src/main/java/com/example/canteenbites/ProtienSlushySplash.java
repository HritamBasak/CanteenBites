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

public class ProtienSlushySplash extends AppCompatActivity {
    RecyclerView recyclerView62;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_protien_slushy_splash);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView62=findViewById(R.id.recyclerView62);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.virginmogito,"Virgin Mojito"));
        list1.add(new ModelRecipeDosa(R.drawable.blueangel,"Blue Angel"));
        list1.add(new ModelRecipeDosa(R.drawable.strawberryslushy,"Strawberry"));
        list1.add(new ModelRecipeDosa(R.drawable.berryverry,"Verry Berry"));
        list1.add(new ModelRecipeDosa(R.drawable.wat,"Watermelon"));
        list1.add(new ModelRecipeDosa(R.drawable.greenapple,"Green Apple"));

        AdapterClassSoup adapter= new AdapterClassSoup(ProtienSlushySplash.this,list1);
        recyclerView62.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ProtienSlushySplash.this,2);
        recyclerView62.setLayoutManager(gridLayoutManager);
    }
}