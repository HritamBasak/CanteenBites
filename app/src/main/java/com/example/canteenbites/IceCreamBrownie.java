package com.example.canteenbites;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Adapter5.AdapterSundae;
import Model.ModelRecipeDosa;

public class IceCreamBrownie extends AppCompatActivity {
    RecyclerView recyclerView74;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ice_cream_brownie);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView74=findViewById(R.id.recyclerView74);
        ArrayList<ModelRecipeDosa> list=new ArrayList<>();
        list.add(new ModelRecipeDosa(R.drawable.brow,"Rich Chocolate brownie topped with vanilla ice cream and sprinkles"));

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView74.setLayoutManager(linearLayoutManager);

        AdapterSundae adapterSundae=new AdapterSundae(this,list);
        recyclerView74.setAdapter(adapterSundae);
    }
}