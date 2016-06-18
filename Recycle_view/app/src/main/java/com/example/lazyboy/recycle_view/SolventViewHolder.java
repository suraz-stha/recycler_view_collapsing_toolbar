package com.example.lazyboy.recycle_view;

import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by lazyboy on 3/23/2016.
 */
public class SolventViewHolder extends RecyclerView.ViewHolder {
    public TextView countryName;
    public ImageView countryPhoto;


    public SolventViewHolder(View itemView) {
        super(itemView);
        countryName = (TextView) itemView.findViewById(R.id.country_name);
        countryPhoto = (ImageView) itemView.findViewById(R.id.country_photo);
    }

}
