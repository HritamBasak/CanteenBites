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

public class OasisBuono extends AppCompatActivity {
    RecyclerView recyclerView20;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_oasis_buono);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView20=findViewById(R.id.recyclerView20);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.mumbaipizza,"Mumbai Style Pizza"));
        list1.add(new ModelRecipeDosa(R.drawable.mushroompizza,"Mushroom Pizza"));
        list1.add(new ModelRecipeDosa(R.drawable.paneerpizza,"Paneer Pizza"));
        list1.add(new ModelRecipeDosa(R.drawable.margaritapizza,"Margherita Pizza"));
        list1.add(new ModelRecipeDosa(R.drawable.chickenpizza,"Chicken Tikka Pizza"));
        list1.add(new ModelRecipeDosa(R.drawable.bbqpizza,"BBQ Chicken Pizza"));
        list1.add(new ModelRecipeDosa(R.drawable.tandooripizza,"Tandoori Chicken Pizza"));
        list1.add(new ModelRecipeDosa(R.drawable.mumbaichickenpizza,"Mumbai Chicken Pizza"));

        AdapterClassSoup adapter= new AdapterClassSoup(OasisBuono.this,list1);
        recyclerView20.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(OasisBuono.this,2);
        recyclerView20.setLayoutManager(gridLayoutManager);
    }
}