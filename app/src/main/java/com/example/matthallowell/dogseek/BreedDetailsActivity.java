package com.example.matthallowell.dogseek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Matt Hallowell on 11/18/2017.
 */

public class BreedDetailsActivity extends Activity {

    private static final String TAG = "DetailsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breed_list_item);
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart");

        super.onStart();
        // The activity is about to become visible.
        Intent intent = getIntent();
        if (intent != null) {
            TextView name = findViewById(R.id.text1);
            TextView description = findViewById(R.id.text2);
            ImageView icon = findViewById(R.id.image);
            name.setText(intent.getCharSequenceExtra("Name"));
            //getActionBar().setTitle(intent.getCharSequenceExtra("Name"));
            description.setText(intent.getCharSequenceExtra("Description"));
        }
    }
}