package com.example.matthallowell.dogseek;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends android.app.ListActivity {

    private static final String TAG = "ListActivity";
    private ArrayList<Breed> tmp;
    private Breed[] breeds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");

        setListAdapter(new DogAdapter());
    }

    @Override
    protected void onStart(){
        Log.d(TAG,"onStart");
        super.onStart();
        Intent intent = getIntent();
        tmp = (ArrayList<Breed>) intent.getSerializableExtra("Breeds");
        //breeds = tmp.toArray(new Breed[tmp.size()]);
        for (Breed breed : tmp) {
            Log.d(TAG, "Printing breeds as toasts within ListActivity");
            Toast.makeText(this, breed.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    class DogAdapter extends BaseAdapter{
        private LayoutInflater inflater;

        @Override
        public int getCount(){return 0;}

        @Override
        public Object getItem(int i){return null;}

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
//            View row = view;
//            if (view == null){
//                if (inflater == null){
//                    inflater = (LayoutInflater) ListActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                    row = inflater.inflate(R.layout.activity_details, viewGroup, false);
//                }
//            }
//            //Setup resource images
//            TextView name = row.findViewById(R.id.text1);
//            TextView description = row.findViewById(R.id.text2);
//
//            Breed breed = breeds[i];
//            name.setText(breed.getName());
//            description.setText(breed.getShortDescription());
//            //Setup resource images
//            return row;
            return null;
        }
    }
}
