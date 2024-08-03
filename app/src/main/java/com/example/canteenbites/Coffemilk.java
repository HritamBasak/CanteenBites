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

public class Coffemilk extends AppCompatActivity {
    RecyclerView recyclerView89;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffemilk);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView89=findViewById(R.id.recyclerView89);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.hotmilk,"Hot Milk"));
        list1.add(new ModelRecipeDosa(R.drawable.sukkumilk,"Sukku Milk"));
        list1.add(new ModelRecipeDosa(R.drawable.horlicks,"Horlicks"));
        list1.add(new ModelRecipeDosa(R.drawable.badammilk,"Badam Milk"));
        list1.add(new ModelRecipeDosa(R.drawable.hotchocolate,"Hot Chocolate"));

        AdapterClassSoup adapter= new AdapterClassSoup(Coffemilk.this,list1);
        recyclerView89.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(Coffemilk.this,2);
        recyclerView89.setLayoutManager(gridLayoutManager);
    }
}