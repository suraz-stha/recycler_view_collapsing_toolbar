package com.example.lazyboy.recycle_view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by lazyboy on 3/23/2016.
 */
public class SolventRecyclerViewAdapter extends RecyclerView.Adapter<SolventViewHolder> {
    private List<ItemObjects> itemList;
    private Context context;

    public SolventRecyclerViewAdapter(Context context, List<ItemObjects> itemlist) {
        this.itemList = itemlist;
        this.context = context;

    }

    @Override
    public SolventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.solvent_list, null);
        SolventViewHolder rcv = new SolventViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(SolventViewHolder holder, int position) {
        holder.countryName.setText(itemList.get(position).getName());
        holder.countryPhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {

        return this.itemList.size();
    }


}
