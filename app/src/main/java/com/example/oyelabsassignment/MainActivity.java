package com.example.oyelabsassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    SliderView sliderView;
    RecyclerView recyclerView;
    RecyclerView grecyclerView,bsrecyclerView;
    int[] images = {R.drawable.freshveg,R.drawable.freshveg,R.drawable.freshveg};

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //slider
        sliderView = findViewById(R.id.image_slider);
        Slideradapter slideradapter = new Slideradapter(images);

        sliderView.setSliderAdapter(slideradapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        ArrayList<ExclusiveItem> items = new ArrayList<>();
        items.add(new ExclusiveItem(0,"Organic Banana",getDrawable(R.drawable.banana),"7pcs, Priceg","$4.99","+"));
        items.add(new ExclusiveItem(0,"Red Apple",getDrawable(R.drawable.fruits),"1Kg, Priceg","$4.99","+"));
        items.add(new ExclusiveItem(0,"Organic Banana",getDrawable(R.drawable.banana),"7pcs, Priceg","$4.99","+"));
        items.add(new ExclusiveItem(0,"Red Apple",getDrawable(R.drawable.fruits),"1Kg, Priceg","$4.99","+"));

        ExclusiveAdapter adapter = new ExclusiveAdapter(items);
        recyclerView = findViewById(R.id.offer_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);


        //grocery recycler
        ArrayList<GroceryItem> gitems = new ArrayList<>();
        gitems.add(new GroceryItem(0,R.drawable.pulses,"Pulses"));
        gitems.add(new GroceryItem(0,R.drawable.ricesack,"Ricesack"));
        gitems.add(new GroceryItem(0,R.drawable.pulses,"Pulses"));
        gitems.add(new GroceryItem(0,R.drawable.ricesack,"Ricesack"));

        GroceryAdapter gadapter = new GroceryAdapter(MainActivity.this,gitems);
        grecyclerView = findViewById(R.id.grocery_recycler);
        grecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));
        grecyclerView.setAdapter(gadapter);



        //bestselling recycler
        ArrayList<BestsellingItem> bsitems = new ArrayList<>();
        bsitems.add(new BestsellingItem(0,"Bell Pepper Red",getDrawable(R.drawable.bellpepper),"$4.99","+"));
        bsitems.add(new BestsellingItem(0,"Ginger",getDrawable(R.drawable.ginger),"$4.99","+"));
        bsitems.add(new BestsellingItem(0,"Bell Pepper Red",getDrawable(R.drawable.bellpepper),"$4.99","+"));
        bsitems.add(new BestsellingItem(0,"Ginger",getDrawable(R.drawable.ginger),"$4.99","+"));

        BestsellingAdapter bsadapter = new BestsellingAdapter(bsitems);
        bsrecyclerView = findViewById(R.id.bestselling_recycler);
        bsrecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));
        bsrecyclerView.setAdapter(bsadapter);

    }
}