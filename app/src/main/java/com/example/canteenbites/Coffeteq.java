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

public class Coffeteq extends AppCompatActivity {
    RecyclerView recyclerView90;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffeteq);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView90=findViewById(R.id.recyclerView90);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.teaa,"Special Tea"));
        list1.add(new ModelRecipeDosa(R.drawable.badamtea,"Badam Tea"));
        list1.add(new ModelRecipeDosa(R.drawable.lemontea,"Lemon Tea"));
        list1.add(new ModelRecipeDosa(R.drawable.greentea,"Green Tea"));
        list1.add(new ModelRecipeDosa(R.drawable.blacktea,"Black Tea"));

        AdapterClassSoup adapter= new AdapterClassSoup(Coffeteq.this,list1);
        recyclerView90.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(Coffeteq.this,2);
        recyclerView90.setLayoutManager(gridLayoutManager);
    }
}