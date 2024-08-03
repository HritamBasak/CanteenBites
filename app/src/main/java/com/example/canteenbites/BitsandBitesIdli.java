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

public class BitsandBitesIdli extends AppCompatActivity {
    RecyclerView recyclerView5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bitsand_bites_idli);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView5=findViewById(R.id.recyclerView5);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.plainidli,"Plain Idli"));
        list1.add(new ModelRecipeDosa(R.drawable.butteridli,"Butter Idli"));
        list1.add(new ModelRecipeDosa(R.drawable.gheeidli,"Ghee Idli"));
        list1.add(new ModelRecipeDosa(R.drawable.kadampodi,"Kadam Podi Idli"));
        list1.add(new ModelRecipeDosa(R.drawable.tavaidli,"Tava Idli"));
        list1.add(new ModelRecipeDosa(R.drawable.idlisixtyfive,"Idli 65"));
        list1.add(new ModelRecipeDosa(R.drawable.idlisambhar,"Sambhar Idli"));

        AdapterClassRoti adapter= new AdapterClassRoti(BitsandBitesIdli.this,list1);
        recyclerView5.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(BitsandBitesIdli.this,2);
        recyclerView5.setLayoutManager(gridLayoutManager);
    }
}