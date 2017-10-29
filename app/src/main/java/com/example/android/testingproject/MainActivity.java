package com.example.android.testingproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton mFlightImageButton = (ImageButton) findViewById(R.id.flight_button);
        mFlightImageButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startAnActivity("flight");
                    }
                }
        );
        ImageButton mBusImageButton = (ImageButton) findViewById(R.id.bus_button);
        mBusImageButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startAnActivity("bus");
                    }
                }
        );
        ImageButton mTrainImageButton = (ImageButton) findViewById(R.id.train_button);
        mTrainImageButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startAnActivity("train");
                    }
                }
        );
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                mDrawerLayout.bringToFront();
                mDrawerLayout.requestLayout();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        NavigationView navigationView =  (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /**
     * Called when an item in menu is selected
     *
     * @param item The selected item
     * @return true to display the item as the selected item
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return mToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

    /**
     * Called when an item in the navigation menu is selected.
     *
     * @param item The selected item
     * @return true to display the item as the selected item
     */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.flight_menu: startAnActivity("flight");
                break;
            case R.id.bus_menu: startAnActivity("bus");
                break;
            case R.id.train_menu: startAnActivity("train");
                break;
            case R.id.share_app: //Functionality to be added
                break;
            default: return false;
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    /**
     * Starts an activity
     * 
     * @param destination activity is started based upon destination
     */
    private void startAnActivity(String destination) {
        switch (destination) {
            case "flight": startActivity(new Intent(this, FlightActivity.class));
                break;
            case "bus": startActivity(new Intent(this, BusActivity.class));
                break;
            case "train": startActivity(new Intent(this, TrainActivity.class));
                break;
        }
    }

}
