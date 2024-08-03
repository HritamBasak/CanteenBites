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

public class CoffePastry extends AppCompatActivity {
    RecyclerView recyclerView80;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_coffe_pastry);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView80=findViewById(R.id.recyclerView80);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.vanillapastry,"Vanilla"));
        list1.add(new ModelRecipeDosa(R.drawable.redvelvetpastry,"Red Velvet"));
        list1.add(new ModelRecipeDosa(R.drawable.strawpastry,"Strawberry"));
        list1.add(new ModelRecipeDosa(R.drawable.butpastry,"ButterScotch"));
        list1.add(new ModelRecipeDosa(R.drawable.pinepastry,"Pineapple"));
        list1.add(new ModelRecipeDosa(R.drawable.blackpastry,"Black Forest"));
        list1.add(new ModelRecipeDosa(R.drawable.choroll,"Chocolate Roll"));
        list1.add(new ModelRecipeDosa(R.drawable.chocochippastry,"Choco chips"));
        list1.add(new ModelRecipeDosa(R.drawable.kitkatpastry,"Kit-Kat"));
        list1.add(new ModelRecipeDosa(R.drawable.honeyalmond,"Honey Almond"));
        list1.add(new ModelRecipeDosa(R.drawable.rainbow,"Rainbow"));
        list1.add(new ModelRecipeDosa(R.drawable.blackvelvet,"Black Velvet"));
        list1.add(new ModelRecipeDosa(R.drawable.richcake,"Rich Chocolate"));
        list1.add(new ModelRecipeDosa(R.drawable.ferrerorochercake,"Ferrero Rochero"));

        AdapterClassSoup adapter= new AdapterClassSoup(CoffePastry.this,list1);
        recyclerView80.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(CoffePastry.this,2);
        recyclerView80.setLayoutManager(gridLayoutManager);
    }
}