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

public class BitsandBitesRoti extends AppCompatActivity {
    RecyclerView recyclerView2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bitsand_bites_roti);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView100), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView2=findViewById(R.id.recyclerView2);
        ArrayList<ModelRecipeDosa> list1=new ArrayList<>();
        list1.add(new ModelRecipeDosa(R.drawable.butterchicken,"ButterChicken"));
        list1.add(new ModelRecipeDosa(R.drawable.kadalchicken,"Kadal Chicken"));
        list1.add(new ModelRecipeDosa(R.drawable.chickentikka,"Chicken Tikka Masala"));
        list1.add(new ModelRecipeDosa(R.drawable.chickendopyaza,"Chicken Do Pyaza"));
        list1.add(new ModelRecipeDosa(R.drawable.chickendahiwala,"Chicken Dahiwala"));
        list1.add(new ModelRecipeDosa(R.drawable.chickenpatiala,"Chicken Patiala"));
        list1.add(new ModelRecipeDosa(R.drawable.eggcurry,"Egg Curry"));
        list1.add(new ModelRecipeDosa(R.drawable.paneermasala,"Paneer Butter Masala"));
        list1.add(new ModelRecipeDosa(R.drawable.kadaipan,"Kadai Paneer"));
        list1.add(new ModelRecipeDosa(R.drawable.palakpan,"Palak Paneer"));
        list1.add(new ModelRecipeDosa(R.drawable.gobimasala,"Gobi Masala"));
        list1.add(new ModelRecipeDosa(R.drawable.gobicurry,"Gobi Curry"));
        list1.add(new ModelRecipeDosa(R.drawable.hydchicken,"Hyderabadi Chicken Curry"));
        list1.add(new ModelRecipeDosa(R.drawable.tomatocurry,"Tomato Curry"));

        AdapterClassRoti adapter= new AdapterClassRoti(BitsandBitesRoti.this,list1);
        recyclerView2.setAdapter(adapter);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(BitsandBitesRoti.this,2);
        recyclerView2.setLayoutManager(gridLayoutManager);
    }
}