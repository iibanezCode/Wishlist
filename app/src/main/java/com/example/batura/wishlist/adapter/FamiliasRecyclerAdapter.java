package com.example.batura.wishlist.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.batura.wishlist.R;
import com.example.batura.wishlist.model.Family;

import java.util.List;

public class FamiliasRecyclerAdapter extends RecyclerView.Adapter<FamiliasRecyclerAdapter.FamiliasViewHolder> {

    private final Context context;
    private List<Family> families;

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    public FamiliasRecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public FamiliasViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        CardView c = (CardView) LayoutInflater.from(context).inflate(R.layout.familias_card_view_item, viewGroup, false);
        return new FamiliasRecyclerAdapter.FamiliasViewHolder(c);
    }

    @Override
    public void onBindViewHolder(@NonNull FamiliasViewHolder familiasViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return families.size();
    }

    public class FamiliasViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNombreFamilias;

        public FamiliasViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
