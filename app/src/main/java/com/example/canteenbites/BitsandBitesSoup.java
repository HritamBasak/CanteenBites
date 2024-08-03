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

public class BitsandBitesSoup extends AppCompatActivity {
    RecyclerView recyclerView4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bitsand_bites_soup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView4=findViewById(R.id.recyclerView4);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.tomatosoup,"TomatoSoup"));
        list1.add(new ModelRecipeDosa(R.drawable.vegcornsoup,"Veg Corn Soup"));
        list1.add(new ModelRecipeDosa(R.drawable.vegmanchow,"Veg Manchow Soup"));
        list1.add(new ModelRecipeDosa(R.drawable.hotandsour,"Hot and Sour Soup"));
        list1.add(new ModelRecipeDosa(R.drawable.lemonsoup,"Lemon Corriander Soup"));
        list1.add(new ModelRecipeDosa(R.drawable.mushroomsoup,"Mushroom Soup"));
        list1.add(new ModelRecipeDosa(R.drawable.cornsoup,"Chicken Corn Soup"));
        list1.add(new ModelRecipeDosa(R.drawable.clearsoup,"Chicken Clear Soup"));

        AdapterClassSoup adapter= new AdapterClassSoup(BitsandBitesSoup.this,list1);
        recyclerView4.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(BitsandBitesSoup.this,2);
        recyclerView4.setLayoutManager(gridLayoutManager);
    }
}