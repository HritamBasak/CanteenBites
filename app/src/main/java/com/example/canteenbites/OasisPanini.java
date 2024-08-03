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

public class OasisPanini extends AppCompatActivity {
    RecyclerView recyclerView24;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_oasis_panini);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView24=findViewById(R.id.recyclerView24);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.vegcheesepanini,"Veg Cheese Panini"));
        list1.add(new ModelRecipeDosa(R.drawable.paneerpanini,"Paneer Tikka Panini"));
        list1.add(new ModelRecipeDosa(R.drawable.tandooripanini,"Tandoori Panini"));
        list1.add(new ModelRecipeDosa(R.drawable.chickenpanini,"Chicken Panini"));
        list1.add(new ModelRecipeDosa(R.drawable.chikentikkapanini,"Chicken Tikka Panini"));

        AdapterClassSoup adapter= new AdapterClassSoup(OasisPanini.this,list1);
        recyclerView24.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(OasisPanini.this,2);
        recyclerView24.setLayoutManager(gridLayoutManager);
    }
}