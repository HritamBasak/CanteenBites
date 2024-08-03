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

public class OasisBread extends AppCompatActivity {
    RecyclerView recyclerView23;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_oasis_bread);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView23=findViewById(R.id.recyclerView23);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.toastgarlibread,"Chicken Toast Gralic Bread"));
        list1.add(new ModelRecipeDosa(R.drawable.corngarlicbread,"Chicken Corn Garlic Bread"));
        list1.add(new ModelRecipeDosa(R.drawable.arabita,"Mushroom Arabita"));
        list1.add(new ModelRecipeDosa(R.drawable.tikkagrarlicbread,"Chickn Tikka Garli Bread"));

        AdapterClassSoup adapter= new AdapterClassSoup(OasisBread.this,list1);
        recyclerView23.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(OasisBread.this,2);
        recyclerView23.setLayoutManager(gridLayoutManager);
    }
}