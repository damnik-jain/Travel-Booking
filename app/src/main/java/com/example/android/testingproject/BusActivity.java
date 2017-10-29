package com.example.android.testingproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
