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

public class OasisFranky extends AppCompatActivity {
    RecyclerView recyclerView28;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_oasis_franky);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView28=findViewById(R.id.recyclerView28);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.frankyy,"Chat Pata Frankie"));
        list1.add(new ModelRecipeDosa(R.drawable.paneerfranky,"Paneer Tikka Frankie"));
        list1.add(new ModelRecipeDosa(R.drawable.eggfranky,"Egg Spread Frankie"));
        list1.add(new ModelRecipeDosa(R.drawable.bombayfrankie,"Bombay Street Chicken Frankie"));
        list1.add(new ModelRecipeDosa(R.drawable.chickefrankie,"Punjabi Chicken Tikka Frankie"));

        AdapterClassSoup adapter= new AdapterClassSoup(OasisFranky.this,list1);
        recyclerView28.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(OasisFranky.this,2);
        recyclerView28.setLayoutManager(gridLayoutManager);
    }
}