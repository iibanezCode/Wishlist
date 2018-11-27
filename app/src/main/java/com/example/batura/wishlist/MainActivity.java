package com.example.batura.wishlist;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.batura.wishlist.fragments.CuentaFragment;
import com.example.batura.wishlist.fragments.FamiliasFragment;
import com.example.batura.wishlist.fragments.ListaIndividualFragment;
import com.example.batura.wishlist.fragments.ListasFragment;
import com.example.batura.wishlist.fragments.MiListaFragment;
import com.example.batura.wishlist.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        checkSharedPreferences();

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_Listas) {
            ListasFragment listasFragment = new ListasFragment();
            listasFragment.setFamiliaresProductos(crearLista());
            getSupportFragmentManager().beginTransaction().replace(R.id.contentMain, listasFragment).commit();
        } else if (id == R.id.nav_Familias) {
            getSupportFragmentManager().beginTransaction().replace(R.id.contentMain, FamiliasFragment.newInstance()).commit();
        } else if (id == R.id.nav_MiLista) {
            getSupportFragmentManager().beginTransaction().replace(R.id.contentMain, MiListaFragment.newInstance()).commit();
        } else if (id == R.id.nav_Cuenta) {
            getSupportFragmentManager().beginTransaction().replace(R.id.contentMain, CuentaFragment.newInstance()).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private List<List<Product>> crearLista() {
        List<Product> products = new ArrayList<>();
        Product product = new Product(0, "calcetines", "http://www.google.es/", "Igor");
        Product product1 = new Product(0, "calcetines2", "enlace3", "Igor");
        Product product2 = new Product(0, "calcetines2", "enlace3", "Igor");
        Product product3 = new Product(0, "calcetines2", "enlace3", "Igor");
        Product product4 = new Product(0, "calcetines2", "enlace3", "Igor");
        Product product5 = new Product(0, "calcetines2", "enlace3", "Igor");
        Product product6 = new Product(0, "calcetines2", "enlace3", "Igor");
        Product product7 = new Product(0, "calcetines2", "enlace3", "Igor");
        Product product8 = new Product(0, "calcetines2", "enlace3", "Igor");
        Product product9 = new Product(0, "calcetines2", "enlace3", "Igor");

        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);

        List<List<Product>> familiaresProductos = new ArrayList<>();
        familiaresProductos.add(products);
        familiaresProductos.add(products);
        familiaresProductos.add(products);
        familiaresProductos.add(products);
        familiaresProductos.add(products);
        familiaresProductos.add(products);
        familiaresProductos.add(products);
        familiaresProductos.add(products);
        familiaresProductos.add(products);
        return familiaresProductos;
    }

    private void checkSharedPreferences() {

    }
}
