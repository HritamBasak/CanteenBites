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

public class BitsandBitesCurry extends AppCompatActivity {
    RecyclerView recyclerView3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bitsand_bites_curry);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView3=findViewById(R.id.recyclerView3);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.tandooriroti,"Tandoori Roti"));
        list1.add(new ModelRecipeDosa(R.drawable.butterroti,"Butter Roti"));
        list1.add(new ModelRecipeDosa(R.drawable.rumaliroti,"Rumali Roti"));
        list1.add(new ModelRecipeDosa(R.drawable.kulcha,"Plain Kulcha"));
        list1.add(new ModelRecipeDosa(R.drawable.butterkulcha,"Butter Kulcha"));
        list1.add(new ModelRecipeDosa(R.drawable.butternun,"Butter Nun"));
        list1.add(new ModelRecipeDosa(R.drawable.garlicnun,"Garlic Nun"));

        AdapterClassRoti adapter= new AdapterClassRoti(BitsandBitesCurry.this,list1);
        recyclerView3.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(BitsandBitesCurry.this,2);
        recyclerView3.setLayoutManager(gridLayoutManager);
    }
}