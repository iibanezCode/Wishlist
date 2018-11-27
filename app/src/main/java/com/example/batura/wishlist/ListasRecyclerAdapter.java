package com.example.batura.wishlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.batura.wishlist.model.Product;

import java.util.List;

public class ListasRecyclerAdapter extends RecyclerView.Adapter<ListasRecyclerAdapter.ListasViewHolder> {

    private List<Product> products;
    private Context context;

    public ListasRecyclerAdapter(List<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @NonNull
    @Override
    public ListasViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        CardView c = (CardView) LayoutInflater.from(context).inflate(R.layout.listas_recycler_card_view_item, viewGroup, false);
        return new ListasViewHolder(c);
    }

    @Override
    public void onBindViewHolder(@NonNull ListasViewHolder cardView, int i) {
        cardView.ivProducto.setImageResource(R.mipmap.ic_launcher_round);
        cardView.tvNombre.setText(products.get(i).getName());
        cardView.tvUrl.setText(products.get(i).getUrl());

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ListasViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivProducto;
        private TextView tvNombre;
        private TextView tvUrl;

        public ListasViewHolder(@NonNull CardView c) {
            super(c);
            ivProducto = c.findViewById(R.id.imgProducto);
            tvNombre = c.findViewById(R.id.nombreProducto);
            tvUrl = c.findViewById(R.id.urlProducto);
        }

    }
}
