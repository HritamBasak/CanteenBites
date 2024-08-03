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

public class BitsandBitesTandoori extends AppCompatActivity {
    RecyclerView recyclerView8;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bitsand_bites_tandoori);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView8=findViewById(R.id.recyclerView8);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.paneertikka,"Paneer Tikka"));
        list1.add(new ModelRecipeDosa(R.drawable.seekhkebabs,"Veg Seekh Kebabs"));
        list1.add(new ModelRecipeDosa(R.drawable.tandoorimushrom,"Tandoori Mushroom"));
        list1.add(new ModelRecipeDosa(R.drawable.tandooribabycorn,"Tandoori Babycorn"));
        list1.add(new ModelRecipeDosa(R.drawable.chickentikkakebab,"Chicken Tikka Kebab"));
        list1.add(new ModelRecipeDosa(R.drawable.chicacharikebab,"Chicken Achari Kebab"));
        list1.add(new ModelRecipeDosa(R.drawable.chicmalaikebab,"Chicken Malai Kebab"));
        list1.add(new ModelRecipeDosa(R.drawable.chictangri,"Chicken Tangdi Kebab"));
        list1.add(new ModelRecipeDosa(R.drawable.chicgarli,"Chicken Garli Kebab"));
        list1.add(new ModelRecipeDosa(R.drawable.tandoorichicken,"Tandoori Chicken"));
        list1.add(new ModelRecipeDosa(R.drawable.tandoorichickenwings,"Tandoori Chicken Wings"));

        AdapterClassSoup adapter= new AdapterClassSoup(BitsandBitesTandoori.this,list1);
        recyclerView8.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(BitsandBitesTandoori.this,2);
        recyclerView8.setLayoutManager(gridLayoutManager);
    }
}