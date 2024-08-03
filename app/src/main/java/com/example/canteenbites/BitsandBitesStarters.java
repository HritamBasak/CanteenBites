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

public class BitsandBitesStarters extends AppCompatActivity {
    RecyclerView recyclerView9;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bitsand_bites_starters);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView9=findViewById(R.id.recyclerView9);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.vegmanchurian,"Veg Manchurian"));
        list1.add(new ModelRecipeDosa(R.drawable.gobimanchurian,"Gobi Manchurian"));
        list1.add(new ModelRecipeDosa(R.drawable.crispycorn,"Crispy Corn"));
        list1.add(new ModelRecipeDosa(R.drawable.eggmanchurian,"Egg Manchurian"));
        list1.add(new ModelRecipeDosa(R.drawable.eggchilli,"Egg Chilli"));
        list1.add(new ModelRecipeDosa(R.drawable.chillichicken,"Chilli Chicken"));
        list1.add(new ModelRecipeDosa(R.drawable.gingerchickn,"Ginger Chicken"));
        list1.add(new ModelRecipeDosa(R.drawable.chillipaneer,"Chilli Paneer"));
        list1.add(new ModelRecipeDosa(R.drawable.eggsixtyfive,"Egg 65"));
        list1.add(new ModelRecipeDosa(R.drawable.chicdrumsticks,"Chicken DrumSticks"));
        list1.add(new ModelRecipeDosa(R.drawable.chickenwings,"Chicken Wings"));
        list1.add(new ModelRecipeDosa(R.drawable.chilliprawns,"Chilli Prawns"));
        list1.add(new ModelRecipeDosa(R.drawable.chillifish,"Chilli Fish"));
        list1.add(new ModelRecipeDosa(R.drawable.fishcutlet,"Fish Cutlet"));

        AdapterClassSoup adapter= new AdapterClassSoup(BitsandBitesStarters.this,list1);
        recyclerView9.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(BitsandBitesStarters.this,2);
        recyclerView9.setLayoutManager(gridLayoutManager);
    }
}