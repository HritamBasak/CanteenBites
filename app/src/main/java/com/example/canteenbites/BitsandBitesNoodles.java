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

public class BitsandBitesNoodles extends AppCompatActivity {
    RecyclerView recyclerView7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bitsand_bites_noodles);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView7=findViewById(R.id.recyclerView7);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.vegnoodles,"Veg Noodles"));
        list1.add(new ModelRecipeDosa(R.drawable.gobinoodles,"Gobi Noodles"));
        list1.add(new ModelRecipeDosa(R.drawable.eggnoodles,"Egg Noodles"));
        list1.add(new ModelRecipeDosa(R.drawable.chickennoodles,"Chicken Noodles"));
        list1.add(new ModelRecipeDosa(R.drawable.paneernoodles,"Paneer Noodles"));
        list1.add(new ModelRecipeDosa(R.drawable.mushroomnoodles,"Mushroom Noodles"));
        list1.add(new ModelRecipeDosa(R.drawable.babycornnoodles,"Babycorn Noodles"));

        AdapterClassRoti adapter= new AdapterClassRoti(BitsandBitesNoodles.this,list1);
        recyclerView7.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(BitsandBitesNoodles.this,2);
        recyclerView7.setLayoutManager(gridLayoutManager);
    }
}