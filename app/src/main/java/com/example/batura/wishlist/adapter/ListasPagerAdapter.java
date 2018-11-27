package com.example.batura.wishlist.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.batura.wishlist.fragments.ListaIndividualFragment;
import com.example.batura.wishlist.model.Product;

import java.util.List;

public class ListasPagerAdapter extends FragmentStatePagerAdapter {


    public void setFamiliaresProductos(List<List<Product>> familiaresProductos) {
        this.familiaresProductos = familiaresProductos;
    }

    private List<List<Product>> familiaresProductos;

    public ListasPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        ListaIndividualFragment listaIndividualFragment = new ListaIndividualFragment();
        listaIndividualFragment.setProducts(familiaresProductos.get(i));
        return listaIndividualFragment;
    }

    @Override
    public int getCount() {
        return familiaresProductos.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return familiaresProductos.get(position).get(0).getUsername();
    }
}
