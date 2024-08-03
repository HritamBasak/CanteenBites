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

public class ShakersFrappes extends AppCompatActivity {
    RecyclerView recyclerView56;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shakers_frappes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView56=findViewById(R.id.recyclerView56);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.belgiumfrappe,"Belgium Frappe"));
        list1.add(new ModelRecipeDosa(R.drawable.caramelfrappe,"Caramel Frappuccino"));
        list1.add(new ModelRecipeDosa(R.drawable.whitefrappe,"White Mocha Frappe"));
        list1.add(new ModelRecipeDosa(R.drawable.redvelvetfrappe,"Red Velvet Frappe"));
        list1.add(new ModelRecipeDosa(R.drawable.javafrappe,"Java Chip Frappe"));
        list1.add(new ModelRecipeDosa(R.drawable.doublefrappe,"Double Mocha Frappe"));


        AdapterClassSoup adapter= new AdapterClassSoup(ShakersFrappes.this,list1);
        recyclerView56.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(ShakersFrappes.this,2);
        recyclerView56.setLayoutManager(gridLayoutManager);
    }
}