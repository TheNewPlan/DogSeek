package com.example.matthallowell.dogseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static com.example.matthallowell.dogseek.Breeds.BARKINGFREQUENCIES;
import static com.example.matthallowell.dogseek.Breeds.COATS;
import static com.example.matthallowell.dogseek.Breeds.ENERGYLEVELS;
import static com.example.matthallowell.dogseek.Breeds.GROOMINGFREQUENCIES;
import static com.example.matthallowell.dogseek.Breeds.GROUPS;
import static com.example.matthallowell.dogseek.Breeds.SHEDDING;
import static com.example.matthallowell.dogseek.Breeds.SIZES;
import static com.example.matthallowell.dogseek.Breeds.TRAINABILITY;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Spinner groupSpinner = findViewById(R.id.groupSpinner);
        ArrayAdapter<String> groupAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, GROUPS);
        groupAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        groupSpinner.setAdapter(groupAdapter);
        groupSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "groupSpinner: " + GROUPS[position] +
                                " position=" + position + " id=" + id);
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "groupSpinner: unselected");
                    }
                });
        final Spinner sizeSpinner = findViewById(R.id.sizeSpinner);
        ArrayAdapter<String> sizeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, SIZES);
        sizeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sizeSpinner.setAdapter(sizeAdapter);
        sizeSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "sizeSpinner: " + SIZES[position] +
                                " position=" + position + " id=" + id);
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "sizeSpinner: unselected");
                    }
                });
        final Spinner coatSpinner = findViewById(R.id.coatSpinner);
        ArrayAdapter<String> coatAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, COATS);
        coatAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        coatSpinner.setAdapter(coatAdapter);
        coatSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "coatSpinner: " + COATS[position] +
                                " position=" + position + " id=" + id);
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "coatSpinner: unselected");
                    }
                });
        final Spinner sheddingSpinner = findViewById(R.id.sheddingSpinner);
        ArrayAdapter<String> sheddingAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, SHEDDING);
        sheddingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sheddingSpinner.setAdapter(sheddingAdapter);
        sheddingSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "sheddingSpinner: " + SHEDDING[position] +
                                " position=" + position + " id=" + id);
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "sheddingSpinner: unselected");
                    }
                });
        final Spinner trainabilitySpinner = findViewById(R.id.trainabilitySpinner);
        ArrayAdapter<String> trainabilityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, TRAINABILITY);
        trainabilityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        trainabilitySpinner.setAdapter(trainabilityAdapter);
        trainabilitySpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "trainabilitySpinner: " + TRAINABILITY[position] +
                                " position=" + position + " id=" + id);
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "trainabilitySpinner: unselected");
                    }
                });
        final Spinner groomingSpinner = findViewById(R.id.groomingSpinner);
        ArrayAdapter<String> groomingAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, GROOMINGFREQUENCIES);
        groomingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        groomingSpinner.setAdapter(groomingAdapter);
        groomingSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "groomingSpinner: " + GROOMINGFREQUENCIES[position] +
                                " position=" + position + " id=" + id);
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "groomingSpinner: unselected");
                    }
                });
        final Spinner barkingSpinner = findViewById(R.id.barkingSpinner);
        ArrayAdapter<String> barkingAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, BARKINGFREQUENCIES);
        barkingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        barkingSpinner.setAdapter(barkingAdapter);
        barkingSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "barkingSpinner: " + BARKINGFREQUENCIES[position] +
                                " position=" + position + " id=" + id);
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "barkingSpinner: unselected");
                    }
                });
        final Spinner energySpinner = findViewById(R.id.energySpinner);
        ArrayAdapter<String> energyAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, ENERGYLEVELS);
        energyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        energySpinner.setAdapter(energyAdapter);
        energySpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "energySpinner: " + ENERGYLEVELS[position] +
                                " position=" + position + " id=" + id);
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "energySpinner: unselected");
                    }
                });


    }
}
