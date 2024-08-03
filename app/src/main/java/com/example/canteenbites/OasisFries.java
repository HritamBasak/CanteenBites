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

public class OasisFries extends AppCompatActivity {
    RecyclerView recyclerView27;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_oasis_fries);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView27=findViewById(R.id.recyclerView27);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.frenchfries,"French Fries"));
        list1.add(new ModelRecipeDosa(R.drawable.cheeseballs,"Japanese CheeseBalls"));
        list1.add(new ModelRecipeDosa(R.drawable.vegnuggets,"Veg Nuggets"));
        list1.add(new ModelRecipeDosa(R.drawable.chickennuggets,"Chicken Nuggets"));
        list1.add(new ModelRecipeDosa(R.drawable.buffalowings,"Buffalo Fried Chicken Wings"));
        list1.add(new ModelRecipeDosa(R.drawable.friedlollipop,"Fried Lollipop"));

        AdapterClassSoup adapter= new AdapterClassSoup(OasisFries.this,list1);
        recyclerView27.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(OasisFries.this,2);
        recyclerView27.setLayoutManager(gridLayoutManager);
    }
}