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

public class IceCreamBakeryhotchoco extends AppCompatActivity {
    RecyclerView recyclerView70;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ice_cream_bakeryhotchoco);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView70=findViewById(R.id.recyclerView70);
        ArrayList<ModelRecipeDosa> list=new ArrayList<>();
        list.add(new ModelRecipeDosa(R.drawable.darknight,"Dark Night(Dark Chocolate)"));
        list.add(new ModelRecipeDosa(R.drawable.glassy,"Glossy(Milk Chocolate)"));
        list.add(new ModelRecipeDosa(R.drawable.mochamocha,"Hot Chocolates(Coffee+Chocolate)"));
        list.add(new ModelRecipeDosa(R.drawable.whitechocolate,"Milyway(White Chocolate)"));

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView70.setLayoutManager(gridLayoutManager);


        AdapterHotchoco adapterHotchoco=new AdapterHotchoco(list,this);
        recyclerView70.setAdapter(adapterHotchoco);
    }
}