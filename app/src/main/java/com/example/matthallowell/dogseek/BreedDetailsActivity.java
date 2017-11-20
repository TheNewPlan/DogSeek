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
        setContentView(R.layout.breed_list_item);
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
            TextView description = findViewById(R.id.text2);
            ImageView icon = findViewById(R.id.image);
            name.setText(intent.getCharSequenceExtra("Name"));
            //getActionBar().setTitle(intent.getCharSequenceExtra("Name"));
            description.setText(intent.getCharSequenceExtra("Description"));
        }
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent event){
        swipe.dispatchTouchEvent(event);
        return BreedDetailsActivity.super.dispatchTouchEvent(event);
    }
}