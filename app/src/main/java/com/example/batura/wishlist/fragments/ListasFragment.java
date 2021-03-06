package com.example.batura.wishlist.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.batura.wishlist.R;
import com.example.batura.wishlist.adapter.ListasPagerAdapter;
import com.example.batura.wishlist.model.Product;

import java.util.List;

public class ListasFragment extends Fragment {

    public void setFamiliaresProductos(List<List<Product>> familiaresProductos) {
        this.familiaresProductos = familiaresProductos;
    }

    private List<List<Product>> familiaresProductos;
    private ViewPager pagerFamiliares;

    public ListasFragment() {
    }

    public static ListasFragment newInstance() {
        ListasFragment fragment = new ListasFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listas, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pagerFamiliares = view.findViewById(R.id.vpFamiliares);
        ListasPagerAdapter listasPagerAdapter = new ListasPagerAdapter(getChildFragmentManager());
        listasPagerAdapter.setFamiliaresProductos(familiaresProductos);
        pagerFamiliares.setAdapter(listasPagerAdapter);

        TabLayout tabLayout = view.findViewById(R.id.tabsFamiliares);
        tabLayout.setupWithViewPager(pagerFamiliares);
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
