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

import Adapter.AdapterClassRoti;
import Model.ModelRecipeDosa;

public class BitsandBitesFriedRice extends AppCompatActivity {
    RecyclerView recyclerView6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bitsand_bites_fried_rice4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView6=findViewById(R.id.recyclerView6);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.vegrice,"Veg Fried Rice"));
        list1.add(new ModelRecipeDosa(R.drawable.manchurianrice,"Veg Manchurian Fried Rice"));
        list1.add(new ModelRecipeDosa(R.drawable.gobirice,"Gobi Fried Rice"));
        list1.add(new ModelRecipeDosa(R.drawable.eggrice,"Egg Fried Rice"));
        list1.add(new ModelRecipeDosa(R.drawable.chickenrice,"Chicken Fried Rice"));
        list1.add(new ModelRecipeDosa(R.drawable.paneerrice,"Paneer Fried Rice"));
        list1.add(new ModelRecipeDosa(R.drawable.babycornrice,"BabyCorn Fried Rice"));
        list1.add(new ModelRecipeDosa(R.drawable.mushroomrice,"Mushroom Fried Rice"));

        AdapterClassRoti adapter= new AdapterClassRoti(BitsandBitesFriedRice.this,list1);
        recyclerView6.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(BitsandBitesFriedRice.this,2);
        recyclerView6.setLayoutManager(gridLayoutManager);
    }
}