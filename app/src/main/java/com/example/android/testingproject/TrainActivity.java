package com.example.android.testingproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TrainActivity extends AppCompatActivity {

    private List<String> sources = new ArrayList<>();
    private List<String> destinations = new ArrayList<>();
    private String source=null;
    private String destination=null;
    private Spinner mSrcSpinner;
    private Spinner mDestSpinner;
    private Button mButton;

    private void populateLists (List<String> list1, List<String> list2) {
        list1.add(0, getResources().getString(R.string.train_source1));
        list1.add(1, getResources().getString(R.string.train_source2));
        list1.add(2, getResources().getString(R.string.train_source3));
        list2.add(0, getResources().getString(R.string.train_source1));
        list2.add(1, getResources().getString(R.string.train_source2));
        list2.add(2, getResources().getString(R.string.train_source3));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        populateLists(sources, destinations);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mSrcSpinner = (Spinner) findViewById(R.id.train_source_spinner);
        mDestSpinner = (Spinner) findViewById(R.id.train_destination_spinner);
        mSrcSpinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sources));
        mDestSpinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, destinations));
        mSrcSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        source = (String) parent.getItemAtPosition(position);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        source = "";
                    }
                }
        );
        mDestSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        destination = (String) parent.getItemAtPosition(position);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        destination = "";
                    }
                }
        );
        mButton = (Button) findViewById(R.id.train_book_button);
        mButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if((source != null) && !source.equals("") && (destination != null) && !destination.equals("")) {
                            startTestActivity();
                        }
                    }
                }
        );
    }

    private void startTestActivity() {
        if (!source.equalsIgnoreCase(destination)) {
            Intent intent = new Intent(this, TrainTest.class);
            intent.putExtra(Intent.EXTRA_TEXT, source + " " + destination);
            startActivity(intent);
        }
        else {
            Toast toast = Toast.makeText(this, "Source and Destination cannot be the same.", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
