package com.example.batura.wishlist.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.batura.wishlist.R;
import com.example.batura.wishlist.adapter.ListasRecyclerAdapter;
import com.example.batura.wishlist.model.Product;

import java.util.ArrayList;
import java.util.List;


public class ListaIndividualFragment extends Fragment {

    RecyclerView rv;

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    private List<Product> products;

    public ListaIndividualFragment() {
    }

    public static ListaIndividualFragment newInstance() {
        ListaIndividualFragment fragment = new ListaIndividualFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_individual, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv = view.findViewById(R.id.rvListas);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(new ListasRecyclerAdapter(products, getContext()));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }
}
