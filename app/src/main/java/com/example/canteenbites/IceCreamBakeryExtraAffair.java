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

import Adapter5.AdapterHotchoco;
import Model.ModelRecipeDosa;

public class IceCreamBakeryExtraAffair extends AppCompatActivity {
    RecyclerView recyclerView73;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ice_cream_bakery_extra_affair);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView73=findViewById(R.id.recyclerView73);
        ArrayList<ModelRecipeDosa> list=new ArrayList<>();
        list.add(new ModelRecipeDosa(R.drawable.vanilla,"Vanilla"));
        list.add(new ModelRecipeDosa(R.drawable.nuttycoffee,"Nutty Coffee"));
        list.add(new ModelRecipeDosa(R.drawable.saltedcaramel,"Salted Caramel"));

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView73.setLayoutManager(gridLayoutManager);


        AdapterHotchoco adapterHotchoco=new AdapterHotchoco(list,this);
        recyclerView73.setAdapter(adapterHotchoco);
    }
}