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

public class IceCreamBakeryToppings extends AppCompatActivity {
    RecyclerView recyclerView72;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ice_cream_bakery_toppings);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView72=findViewById(R.id.recyclerView72);
        ArrayList<ModelRecipeDosa> list=new ArrayList<>();
        list.add(new ModelRecipeDosa(R.drawable.nutss,"Nuts"));
        list.add(new ModelRecipeDosa(R.drawable.chocobrowniee,"Chocolate Brownie"));
        list.add(new ModelRecipeDosa(R.drawable.orangebrownie,"Orange Brownie"));
        list.add(new ModelRecipeDosa(R.drawable.wafflecone,"Waffle Cone"));

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView72.setLayoutManager(gridLayoutManager);

        AdapterSundae adapterSundae=new AdapterSundae(this,list);
        recyclerView72.setAdapter(adapterSundae);
    }
}