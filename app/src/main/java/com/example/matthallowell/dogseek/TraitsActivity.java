package com.example.matthallowell.dogseek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;

import static com.example.matthallowell.dogseek.Breed.barkingList;
import static com.example.matthallowell.dogseek.Breed.coatList;
import static com.example.matthallowell.dogseek.Breed.energyList;
import static com.example.matthallowell.dogseek.Breed.groomingList;
import static com.example.matthallowell.dogseek.Breed.groupList;
import static com.example.matthallowell.dogseek.Breed.hypoallergenicList;
import static com.example.matthallowell.dogseek.Breed.sheddingList;
import static com.example.matthallowell.dogseek.Breed.sizeList;
import static com.example.matthallowell.dogseek.Breed.trainabilityList;
import static com.example.matthallowell.dogseek.Breeds.BREEDS;


public class TraitsActivity extends AppCompatActivity {

    private static final String TAG = "TraitsActivity";
    private static ArrayList<Breed> filteredBreeds = new ArrayList<>();
    static Breed.Group groupSelected;
    static Breed.Size sizeSelected;
    static Breed.Coat coatSelected;
    static Breed.Shedding sheddingSelected;
    static Breed.Hypoallergenic hypoallergenicSelected;
    static Breed.Trainability trainabilitySelected;
    static Breed.Grooming groomingSelected;
    static Breed.BarkingFrequency barkingSelected;
    static Breed.Energy energySelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traits);

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
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "sheddingSpinner: unselected");
                    }
                });

        final Spinner hypoallergenicSpinner = findViewById(R.id.hypoallergenicSpinner);
        ArrayAdapter<Breed.Hypoallergenic> hypoallergenicAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, hypoallergenicList);
        hypoallergenicAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hypoallergenicSpinner.setAdapter(hypoallergenicAdapter);
        hypoallergenicSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Log.d(TAG, "hypoallergenicSpinner: " + hypoallergenicList.get(position) +
                                " position=" + position + " id=" + id);
                        hypoallergenicSelected = hypoallergenicList.get(position);
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "hypoallergenicSpinner: unselected");
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
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        Log.d(TAG, "energySpinner: unselected");
                    }
                });

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filterDogs();
                ArrayList<Breed> listBreeds = getFilteredDogs();
                Intent intent = new Intent();
                intent.setClass(TraitsActivity.this, ListBreedActivity.class);
                intent.putExtra("Breeds",listBreeds);
                startActivity(intent);
            }
        });
    }

    public void debugOpts() {
        Toast.makeText(this, "Group: " + groupSelected + "\n" + "Size: " + sizeSelected + "\n" + "Coat: " + coatSelected + "\n" + "Shedding: " + sheddingSelected + "\n" + "Hypoallergenic: " + hypoallergenicSelected + "\n" + "Trainability: " + trainabilitySelected + "\n" + "Grooming: " + groomingSelected + "\n" + "Barking: " + barkingSelected + "\n" + "Energy: " + energySelected, Toast.LENGTH_SHORT).show();
    }

    public ArrayList<Breed> getFilteredDogs(){
        return filteredBreeds;
    }

    public void filterDogs() {
        Toast.makeText(this, "filterDogs Called", Toast.LENGTH_SHORT).show();
        //debugOpts();
        //Clear out our filtered array, so that we don't return incorrect results
        filteredBreeds.clear();
        for (Breed breed : BREEDS) {
            if ((breed.group == groupSelected || groupSelected == breed.group.Any) &&
                    (breed.size == sizeSelected || sizeSelected == breed.size.Any) &&
                    (breed.coat == coatSelected || coatSelected == breed.coat.Any) &&
                    (breed.shedding == sheddingSelected || sheddingSelected == breed.shedding.Any) &&
                    (breed.hypoallergenic == hypoallergenicSelected || hypoallergenicSelected == breed.hypoallergenic.Any) &&
                    (breed.trainability == trainabilitySelected || trainabilitySelected == breed.trainability.Any) &&
                    (breed.grooming == groomingSelected || groomingSelected == breed.grooming.Any) &&
                    (breed.barkingFrequency == barkingSelected || barkingSelected == breed.barkingFrequency.Any) &&
                    (breed.energy == energySelected || energySelected == breed.energy.Any)){
                //If the breed meets the user requirements, add it to the array.
                filteredBreeds.add(breed);
            }
        }
    }
}
