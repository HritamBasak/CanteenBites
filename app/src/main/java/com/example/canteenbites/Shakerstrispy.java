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

public class Shakerstrispy extends AppCompatActivity {
    RecyclerView recyclerView52;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shakerstrispy);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView52), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView52=findViewById(R.id.recyclerView52);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.ferrerorocher,"Ferrero Rocher"));
        list1.add(new ModelRecipeDosa(R.drawable.nutellabrownie,"Nutella Brownie Crumble"));
        list1.add(new ModelRecipeDosa(R.drawable.cookieshake,"Cookie and Cream"));
        list1.add(new ModelRecipeDosa(R.drawable.redvelvetshake,"Red Velvet Rose"));
        list1.add(new ModelRecipeDosa(R.drawable.tiramisushake,"Tiramisy"));
        list1.add(new ModelRecipeDosa(R.drawable.verryberryshake,"Verry Berry"));
        list1.add(new ModelRecipeDosa(R.drawable.hazelnutshake,"Hazel Nut Cookie"));
        list1.add(new ModelRecipeDosa(R.drawable.belgiumshake,"Belgium Chocolate"));
        list1.add(new ModelRecipeDosa(R.drawable.strawberryshakee,"Strawberry Pinky Penny"));
        list1.add(new ModelRecipeDosa(R.drawable.gulkandhshake,"Gulkandh Gulabi Cookie"));

        AdapterClassSoup adapter= new AdapterClassSoup(Shakerstrispy.this,list1);
        recyclerView52.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(Shakerstrispy.this,2);
        recyclerView52.setLayoutManager(gridLayoutManager);
    }
}