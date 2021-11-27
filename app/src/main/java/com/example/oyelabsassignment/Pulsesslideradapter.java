package com.example.oyelabsassignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

public class Pulsesslideradapter extends SliderViewAdapter<Pulsesslideradapter.PHolder>{

    int[] pimages;

    public Pulsesslideradapter(int[] pimages){

        this.pimages = pimages;

    }

    @Override
    public PHolder onCreateViewHolder(ViewGroup pparent) {

        View pview = LayoutInflater.from(pparent.getContext())
                .inflate(R.layout.pulsesslider_item,pparent,false);
        return new PHolder(pview);
    }

    @Override
    public void onBindViewHolder(PHolder pviewHolder, int pposition) {

        pviewHolder.pimageView.setImageResource(pimages[pposition]);

    }

    @Override
    public int getCount() {
        return pimages.length;
    }

    public class PHolder extends  Pulsesslideradapter.ViewHolder{

        ImageView pimageView;

        public PHolder(View pitemView){
            super(pitemView);
            pimageView = pitemView.findViewById(R.id.pimgview);

        }
    }

}
