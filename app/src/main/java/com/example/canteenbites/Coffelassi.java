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

public class Coffelassi extends AppCompatActivity {
    RecyclerView recyclerView93;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffelassi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView93=findViewById(R.id.recyclerView93);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.lassiii,"Lassi"));
        list1.add(new ModelRecipeDosa(R.drawable.blackcurrentlassi,"Black Currant Lassi"));
        list1.add(new ModelRecipeDosa(R.drawable.strawlassi,"Strawberry Lassi"));
        list1.add(new ModelRecipeDosa(R.drawable.mangolassi,"Mango Lassi"));

        AdapterClassSoup adapter= new AdapterClassSoup(Coffelassi.this,list1);
        recyclerView93.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(Coffelassi.this,2);
        recyclerView93.setLayoutManager(gridLayoutManager);
    }
}