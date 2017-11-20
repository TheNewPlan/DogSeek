package com.example.matthallowell.dogseek;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.pwittchen.swipe.library.Swipe;
import com.github.pwittchen.swipe.library.SwipeListener;

public class BreedDetailsActivity extends AppCompatActivity {

    private static final String TAG = "DetailsActivity";
    private Swipe swipe;
    private String uriName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toast.makeText(this, "Swipe left to return.\nSwipe down for the AKC.", Toast.LENGTH_SHORT).show();
        swipe = new Swipe();
        swipe.setListener(new SwipeListener() {
            @Override
            public void onSwipingLeft(MotionEvent event) {

            }

            @Override
            public void onSwipedLeft(MotionEvent event) {
                finish();
            }

            @Override
            public void onSwipingRight(MotionEvent event) {

            }

            @Override
            public void onSwipedRight(MotionEvent event) {
            }

            @Override
            public void onSwipingUp(MotionEvent event) {

            }

            @Override
            public void onSwipedUp(MotionEvent event) {

            }

            @Override
            public void onSwipingDown(MotionEvent event) {
            }

            @Override
            public void onSwipedDown(MotionEvent event) {
                String url = "https://www.akc.org/dog-breeds/" + uriName;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        Log.d(TAG, "onCreate");
    }
    @Override
    protected void onStart() {
        Log.d(TAG, "onStart");

        super.onStart();
        // The activity is about to become visible.
        Intent intent = getIntent();
        if (intent != null) {
            uriName = intent.getStringExtra("Name");
            TextView name = findViewById(R.id.text1);
            TextView group = findViewById(R.id.GroupTextView);
            TextView size = findViewById(R.id.SizeTextView);
            TextView coat = findViewById(R.id.CoatTextView);
            TextView shedding = findViewById(R.id.SheddingTextView);
            TextView hypoallergenic = findViewById(R.id.HypoallergenicTextView);
            TextView trainability = findViewById(R.id.TrainabiltyTextView);
            TextView grooming = findViewById(R.id.GroomingTextView);
            TextView barking = findViewById(R.id.BarkingTextView);
            TextView energy = findViewById(R.id.EnergyTextView);

            ImageView icon = findViewById(R.id.image);
            name.setText(intent.getCharSequenceExtra("Name"));
            group.setText(intent.getCharSequenceExtra("Group"));
            size.setText(intent.getCharSequenceExtra("Size"));
            coat.setText(intent.getCharSequenceExtra("Coat"));
            shedding.setText(intent.getCharSequenceExtra("Shedding"));
            hypoallergenic.setText(intent.getCharSequenceExtra("Hypoallergenic"));
            trainability.setText(intent.getCharSequenceExtra("Trainability"));
            grooming.setText(intent.getCharSequenceExtra("Grooming"));
            barking.setText(intent.getCharSequenceExtra("Barking"));
            energy.setText(intent.getCharSequenceExtra("Energy"));
        }
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent event){
        swipe.dispatchTouchEvent(event);
        return BreedDetailsActivity.super.dispatchTouchEvent(event);
    }
}