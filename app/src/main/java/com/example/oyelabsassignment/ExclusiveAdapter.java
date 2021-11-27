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

public class ExclusiveAdapter extends RecyclerView.Adapter<ExclusiveAdapter.Holder> {
    ArrayList<ExclusiveItem> items;
    public ExclusiveAdapter(ArrayList<ExclusiveItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.exclusive_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        ExclusiveItem item = items.get(holder.getAdapterPosition());
        holder.name.setText(item.getName());
        holder.desc.setText(item.getDescription());
        holder.price.setText(item.getPrice());
        holder.quantity.setText(item.getQuantity());
        Glide.with(holder.imageView).load(item.getImagesrc()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView name,desc,price,quantity;
        ImageView imageView;
        public Holder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.textview);
            desc = (TextView) itemView.findViewById(R.id.textview2);
            price = (TextView) itemView.findViewById(R.id.textview3);
            quantity = (TextView) itemView.findViewById(R.id.textview4);
            imageView = itemView.findViewById(R.id.img);
        }
    }
}
