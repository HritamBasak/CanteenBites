package com.example.canteenbites;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Adapter5.AdapterSundae;
import Model.ModelRecipeDosa;

public class IceCreamBakeryChocoaffair extends AppCompatActivity {
    RecyclerView recyclerView77;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ice_cream_bakery_chocoaffair);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView77=findViewById(R.id.recyclerView77);
        ArrayList<ModelRecipeDosa> list=new ArrayList<>();
        list.add(new ModelRecipeDosa(R.drawable.darknight,"Dark Night"));
        list.add(new ModelRecipeDosa(R.drawable.glassy,"Glossy Chocolate"));
        list.add(new ModelRecipeDosa(R.drawable.chocoast,"Choco Asteroid"));
        list.add(new ModelRecipeDosa(R.drawable.darkast,"Dark Asteroid"));
        list.add(new ModelRecipeDosa(R.drawable.mochamocha,"Mocha-Mocha"));
        list.add(new ModelRecipeDosa(R.drawable.cocomilk,"Milky Way"));
        list.add(new ModelRecipeDosa(R.drawable.bonbourn,"Bon-Bourn"));
        list.add(new ModelRecipeDosa(R.drawable.oreoice,"OreoRide"));
        list.add(new ModelRecipeDosa(R.drawable.chocobounty,"ChocoBounty"));
        list.add(new ModelRecipeDosa(R.drawable.chocopeanutbutter,"Choco Peanut-Butter"));

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView77.setLayoutManager(gridLayoutManager);

        AdapterSundae adapterSundae=new AdapterSundae(this,list);
        recyclerView77.setAdapter(adapterSundae);
    }
}