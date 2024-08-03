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

public class PuriVuriChaat extends AppCompatActivity {
    RecyclerView recyclerView12;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_puri_vuri_chaat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView12=findViewById(R.id.recyclerView12);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.samosaragada,"Samosa Ragada"));
        list1.add(new ModelRecipeDosa(R.drawable.cholesamosa,"Chole Samosa"));
        list1.add(new ModelRecipeDosa(R.drawable.cholekachodi,"Chole Kachodi"));
        list1.add(new ModelRecipeDosa(R.drawable.papidiragada,"Papidi Ragada"));
        list1.add(new ModelRecipeDosa(R.drawable.alootikkichole,"Aloo Tikki Chole"));

        AdapterClassSoup adapter= new AdapterClassSoup(PuriVuriChaat.this,list1);
        recyclerView12.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(PuriVuriChaat.this,2);
        recyclerView12.setLayoutManager(gridLayoutManager);
    }
}