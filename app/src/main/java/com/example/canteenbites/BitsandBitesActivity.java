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

import Adapter.AdapterClassDosa;
import Model.ModelRecipeDosa;

public class BitsandBitesActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bitsand_bites);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView=findViewById(R.id.recyclerView6);
        ArrayList<ModelRecipeDosa> list=new ArrayList<>();
        list.add(new ModelRecipeDosa(R.drawable.ravadosa,"Rava Dosa"));
        list.add(new ModelRecipeDosa(R.drawable.plaindosa,"Plain Dosa"));
        list.add(new ModelRecipeDosa(R.drawable.masaladosa,"Masala Dosa"));
        list.add(new ModelRecipeDosa(R.drawable.oniondosa,"Onion Dosa"));
        list.add(new ModelRecipeDosa(R.drawable.pizzadosa,"Pizza Dosa"));
        list.add(new ModelRecipeDosa(R.drawable.eggdosa,"Egg Dosa"));
        list.add(new ModelRecipeDosa(R.drawable.paneerdosa,"Paneer Dosa"));
        list.add(new ModelRecipeDosa(R.drawable.cheesedosa,"Cheese Dosa"));
        list.add(new ModelRecipeDosa(R.drawable.chickendosa,"Spicy Chicken Dosa"));
        list.add(new ModelRecipeDosa(R.drawable.gheedosa,"Plain Ghee Dosa"));
        list.add(new ModelRecipeDosa(R.drawable.upmadosa,"Upma Dosa"));


        AdapterClassDosa adapter=new AdapterClassDosa(BitsandBitesActivity.this,list);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(BitsandBitesActivity.this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

    }
}