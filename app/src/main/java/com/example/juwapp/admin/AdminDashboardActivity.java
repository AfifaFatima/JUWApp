package com.example.juwapp.admin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.juwapp.R;
import com.example.juwapp.helperClases.FeaturedAdapter;
import com.example.juwapp.helperClases.FeaturedHelperClass;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class AdminDashboardActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton menu;
    RecyclerView featuredR, featureBookR;
    FeaturedAdapter adapter;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        menu = (ImageButton) findViewById(R.id.top_menu);

        featuredR = (RecyclerView) findViewById(R.id.featured_recycler);
        featureBookR = (RecyclerView) findViewById(R.id.featured_book_recycler);

        //Menu Hooks
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav_bar);

        navigationdrawer();

        featuredR();
        featuredBookR();

    }

    private void navigationdrawer() {
        //Navigation Drawer
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);
                else drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else
            super.onBackPressed();
    }

    private void featuredBookR() {

        featureBookR.setHasFixedSize(true);
        featureBookR.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass> featuredList = new ArrayList<>();

        featuredList.add(new FeaturedHelperClass(R.drawable.book1, "Human Computer Interactions"));
        featuredList.add(new FeaturedHelperClass(R.drawable.book2, "Information Technology"));
        featuredList.add(new FeaturedHelperClass(R.drawable.book3, "Computer Communication and Network"));
        featuredList.add(new FeaturedHelperClass(R.drawable.book4, "Data Mining"));
        featuredList.add(new FeaturedHelperClass(R.drawable.book5, "Artificial Intelligence and Machine Learning"));

        adapter = new FeaturedAdapter(featuredList);

        featureBookR.setAdapter(adapter);
    }

    private void featuredR() {

        featuredR.setHasFixedSize(true);
        featuredR.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass> featuredList = new ArrayList<>();

        featuredList.add(new FeaturedHelperClass(R.drawable.book1, "Human Computer Interactions"));
        featuredList.add(new FeaturedHelperClass(R.drawable.book2, "Information Technology"));
        featuredList.add(new FeaturedHelperClass(R.drawable.book3, "Computer Communication and Network"));
        featuredList.add(new FeaturedHelperClass(R.drawable.book4, "Data Mining"));
        featuredList.add(new FeaturedHelperClass(R.drawable.book5, "Artificial Intelligence and Machine Learning"));

        adapter = new FeaturedAdapter(featuredList);

        featuredR.setAdapter(adapter);
    }
}