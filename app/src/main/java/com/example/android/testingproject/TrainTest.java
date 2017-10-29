package com.example.android.testingproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TrainTest extends AppCompatActivity {

    private TextView mSrcTextView;
    private TextView mDestTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_test);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mSrcTextView = (TextView) findViewById(R.id.source_textview);
        mDestTextView = (TextView) findViewById(R.id.destination_textview);
        Intent intent = getIntent();
        if(intent.hasExtra(Intent.EXTRA_TEXT)) {
            String[] values = intent.getStringExtra(Intent.EXTRA_TEXT).split(" ");
            mSrcTextView.setText(values[0]);
            mDestTextView.setText(values[1]);
        }
    }
}
