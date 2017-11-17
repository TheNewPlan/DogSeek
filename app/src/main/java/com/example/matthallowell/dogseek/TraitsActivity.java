package com.example.matthallowell.dogseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static com.example.matthallowell.dogseek.Breed.barkingList;
import static com.example.matthallowell.dogseek.Breed.coatList;
import static com.example.matthallowell.dogseek.Breed.energyList;
import static com.example.matthallowell.dogseek.Breed.groomingList;
import static com.example.matthallowell.dogseek.Breed.groupList;
import static com.example.matthallowell.dogseek.Breed.sheddingList;
import static com.example.matthallowell.dogseek.Breed.sizeList;
import static com.example.matthallowell.dogseek.Breed.trainabilityList;


public class TraitsActivity extends AppCompatActivity {

    private static final String TAG = "TraitsActivity";
    static Breed.Group groupSelected;
    static Breed.Size sizeSelected;
    static Breed.Coat coatSelected;
    static Breed.Shedding sheddingSelected;
    static boolean isHypoallergenic;
    static Breed.Trainability trainabilitySelected;
    static Breed.Grooming groomingSelected;
    static Breed.BarkingFrequency barkingSelected;
    static Breed.Energy energySelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Spinner groupSpinner = findViewById(R.id.groupSpinner);
        ArrayAdapter<Breed.Group> groupAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, groupList);
        groupAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        groupSpinner.setAdapter(groupAdapter);
        groupSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "groupSpinner: " + groupList.get(position) +
                                " position=" + position + " id=" + id);
                        groupSelected = groupList.get(position);
                        debugOpts();
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "groupSpinner: unselected");
                    }
                });
        final Spinner sizeSpinner = findViewById(R.id.sizeSpinner);
        ArrayAdapter<Breed.Size> sizeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sizeList);
        sizeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sizeSpinner.setAdapter(sizeAdapter);
        sizeSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "sizeSpinner: " + sizeList.get(position) +
                                " position=" + position + " id=" + id);
                        sizeSelected = sizeList.get(position);
                        debugOpts();
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "sizeSpinner: unselected");
                    }
                });
        final Spinner coatSpinner = findViewById(R.id.coatSpinner);
        ArrayAdapter<Breed.Coat> coatAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, coatList);
        coatAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        coatSpinner.setAdapter(coatAdapter);
        coatSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "coatSpinner: " + coatList.get(position) +
                                " position=" + position + " id=" + id);
                        coatSelected = coatList.get(position);
                        debugOpts();
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "coatSpinner: unselected");
                    }
                });
        final Spinner sheddingSpinner = findViewById(R.id.sheddingSpinner);
        ArrayAdapter<Breed.Shedding> sheddingAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, sheddingList);
        sheddingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sheddingSpinner.setAdapter(sheddingAdapter);
        sheddingSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "sheddingSpinner: " + sheddingList.get(position) +
                                " position=" + position + " id=" + id);
                        sheddingSelected = sheddingList.get(position);
                        debugOpts();
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "sheddingSpinner: unselected");
                    }
                });
        final Spinner trainabilitySpinner = findViewById(R.id.trainabilitySpinner);
        ArrayAdapter<Breed.Trainability> trainabilityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, trainabilityList);
        trainabilityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        trainabilitySpinner.setAdapter(trainabilityAdapter);
        trainabilitySpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "trainabilitySpinner: " + trainabilityList.get(position) +
                                " position=" + position + " id=" + id);
                        trainabilitySelected = trainabilityList.get(position);
                        debugOpts();
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "trainabilitySpinner: unselected");
                    }
                });
        final Spinner groomingSpinner = findViewById(R.id.groomingSpinner);
        ArrayAdapter<Breed.Grooming> groomingAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, groomingList);
        groomingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        groomingSpinner.setAdapter(groomingAdapter);
        groomingSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "groomingSpinner: " + groomingList.get(position) +
                                " position=" + position + " id=" + id);
                        groomingSelected = groomingList.get(position);
                        debugOpts();
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "groomingSpinner: unselected");
                    }
                });
        final Spinner barkingSpinner = findViewById(R.id.barkingSpinner);
        ArrayAdapter<Breed.BarkingFrequency> barkingAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, barkingList);
        barkingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        barkingSpinner.setAdapter(barkingAdapter);
        barkingSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "barkingSpinner: " + barkingList.get(position) +
                                " position=" + position + " id=" + id);
                        barkingSelected = barkingList.get(position);
                        debugOpts();
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "barkingSpinner: unselected");
                    }
                });
        final Spinner energySpinner = findViewById(R.id.energySpinner);
        ArrayAdapter<Breed.Energy> energyAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, energyList);
        energyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        energySpinner.setAdapter(energyAdapter);
        energySpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "energySpinner: " + energyList.get(position) +
                                " position=" + position + " id=" + id);
                        energySelected = energyList.get(position);
                        debugOpts();
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "energySpinner: unselected");
                    }
                });


    }
    public void debugOpts(){
        Toast.makeText(this, "Group: " + groupSelected + "\n" + "Size: " + sizeSelected + "\n" + "Coat: " + coatSelected + "\n" + "Shedding: " + sheddingSelected + "\n" + "Trainability: " + trainabilitySelected + "\n" + "Grooming: " + groomingSelected + "\n" + "Barking: " + barkingSelected + "\n" + "Energy: " + energySelected, Toast.LENGTH_LONG).show();
    }

    public static void filterDogs(){

    }
}
