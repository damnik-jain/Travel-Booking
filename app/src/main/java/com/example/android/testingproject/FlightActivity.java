package com.example.android.testingproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FlightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
