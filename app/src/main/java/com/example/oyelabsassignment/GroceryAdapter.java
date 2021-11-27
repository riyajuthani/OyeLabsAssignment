package com.example.oyelabsassignment;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class GroceryAdapter extends RecyclerView.Adapter<GroceryAdapter.GHolder> {
    ArrayList<GroceryItem> gitems;
    MainActivity mainActivity;
    public GroceryAdapter(MainActivity mainActivity, ArrayList<GroceryItem> gitems) {
        this.gitems = gitems;
        this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public GHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grocery_item,parent,false);
        return new GHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GHolder gholder, int position) {

        GroceryItem gitem = gitems.get(gholder.getAdapterPosition());
        gholder.gname.setText(gitem.getName());
        gholder.gimageView.setImageResource(gitem.getImagesrc());
        gholder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainActivity,Pulsespage.class);
                mainActivity.startActivity(intent);
            }
        });
//        Glide.with(gholder.gimageView).load(gitem.getImagesrc()).into(gholder.gimageView);

    }

    @Override
    public int getItemCount() {
        return gitems.size();
    }

    public class GHolder extends RecyclerView.ViewHolder {
        TextView gname;
        ImageView gimageView;
        public GHolder(@NonNull View gitemView) {
            super(gitemView);
            gimageView = gitemView.findViewById(R.id.gimg);
            gname = (TextView) gitemView.findViewById(R.id.gtxt);

        }
    }
}
