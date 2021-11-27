package com.example.oyelabsassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Pulsespage extends AppCompatActivity {

    SliderView psliderView;

    int[] pimages = {R.drawable.pulsespage,R.drawable.pulsespage,R.drawable.pulsespage};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulsespage);

        //slider
        psliderView = findViewById(R.id.pimage_slider);
        Slideradapter slideradapter = new Slideradapter(pimages);
        psliderView.setSliderAdapter(slideradapter);
        psliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        psliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        psliderView.startAutoCycle();



    }
}