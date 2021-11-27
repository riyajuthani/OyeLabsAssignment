package com.example.oyelabsassignment;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class BestsellingAdapter extends RecyclerView.Adapter<BestsellingAdapter.BsHolder> {
    ArrayList<BestsellingItem> bsitems;
    public BestsellingAdapter(ArrayList<BestsellingItem> bsitems) {
        this.bsitems = bsitems;
    }

    @NonNull
    @Override
    public BsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View bsview = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bestselling_item,parent,false);
        return new BsHolder(bsview);
    }

    @Override
    public void onBindViewHolder(@NonNull BsHolder bsholder, int position) {

        BestsellingItem bsitem = bsitems.get(bsholder.getAdapterPosition());
        bsholder.bsname.setText(bsitem.getName());
        bsholder.bsprice.setText(bsitem.getPrice());
        bsholder.bsquantity.setText(bsitem.getQuantity());
        Glide.with(bsholder.bsimageView).load(bsitem.getImagesrc()).into(bsholder.bsimageView);

    }

    @Override
    public int getItemCount() {
        return bsitems.size();
    }

    public class BsHolder extends RecyclerView.ViewHolder {
        TextView bsname,bsprice,bsquantity;
        ImageView bsimageView;
        public BsHolder(@NonNull View bsitemView) {
            super(bsitemView);
            bsname = (TextView) bsitemView.findViewById(R.id.bstextview);
            bsprice = (TextView) bsitemView.findViewById(R.id.bstextview3);
            bsquantity = (TextView) bsitemView.findViewById(R.id.bstextview4);
            bsimageView = bsitemView.findViewById(R.id.bsimg);
        }
    }
}
