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

public class ZuzuGola extends AppCompatActivity {
    RecyclerView recyclerView33;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zuzu_gola);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView33=findViewById(R.id.recyclerView33);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.icetealyche,"Ice Tea Lychee"));
        list1.add(new ModelRecipeDosa(R.drawable.icepeachtea,"Ice Tea Peach"));
        list1.add(new ModelRecipeDosa(R.drawable.redros,"Ice Red Rose"));
        list1.add(new ModelRecipeDosa(R.drawable.icewatermelon,"Ice Watermelon"));
        list1.add(new ModelRecipeDosa(R.drawable.mangogola,"Ice Mango"));
        list1.add(new ModelRecipeDosa(R.drawable.iceorange,"Ice Orange"));


        AdapterClassSoup adapter= new AdapterClassSoup(ZuzuGola .this,list1);
        recyclerView33.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ZuzuGola.this,2);
        recyclerView33.setLayoutManager(gridLayoutManager);
    }
}