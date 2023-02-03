package com.example.juwapp.user;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
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


public class DashboardActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    static final float END_SCALE = 0.7f;
    ImageButton menuIcon;
    RecyclerView featuredR, featureBookR;
    FeaturedAdapter adapter;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ConstraintLayout contentView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        menuIcon = (ImageButton) findViewById(R.id.menu_icon);
        contentView = findViewById(R.id.content);

        featuredR = (RecyclerView) findViewById(R.id.featured_recycler);
        featureBookR = (RecyclerView) findViewById(R.id.featured_book_recycler);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        navigationView = (NavigationView) findViewById(R.id.nav__view);

        navigationDrawer();
        featuredR();
        featuredBookR();

    }

    private void navigationDrawer() {

        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                }else {drawerLayout.openDrawer(GravityCompat.START);}
            }
        });
        animateNavigationDrawer();
    }


    private void animateNavigationDrawer() {
        //Add any color or remove it to use the default one!
        //To make it transparent use Color.Transparent in side setScrimColor();
        //drawerLayout.setScrimColor(Color.TRANSPARENT);
        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                // Scale the View based on current slide offset
                final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                final float offsetScale = 1 - diffScaledOffset;
                contentView.setScaleX(offsetScale);
                contentView.setScaleY(offsetScale);
                // Translate the View, accounting for the scaled width
                final float xOffset = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = contentView.getWidth() * diffScaledOffset / 2;
                final float xTranslation = xOffset - xOffsetDiff;
                contentView.setTranslationX(xTranslation);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else
            super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
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