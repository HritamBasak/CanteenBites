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

public class ShakersFruit extends AppCompatActivity {
    RecyclerView recyclerView50;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shakers_fruit);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView50=findViewById(R.id.recyclerView50);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.mangoshake,"Mango Madness"));
        list1.add(new ModelRecipeDosa(R.drawable.strawberryshakee,"Strawberry "));
        list1.add(new ModelRecipeDosa(R.drawable.blackcurrent,"Blackcurrent"));
        list1.add(new ModelRecipeDosa(R.drawable.bananashakee,"Banana Blast"));
        list1.add(new ModelRecipeDosa(R.drawable.lovelylitch,"Lovely Litchi"));
        list1.add(new ModelRecipeDosa(R.drawable.pinshake,"Pineapple Passion"));

        AdapterClassSoup adapter= new AdapterClassSoup(ShakersFruit.this,list1);
        recyclerView50.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ShakersFruit.this,2);
        recyclerView50.setLayoutManager(gridLayoutManager);
    }
}