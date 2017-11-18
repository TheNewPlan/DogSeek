package com.example.matthallowell.dogseek;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListBreedActivity extends ListActivity {

    private static final String TAG = "ListBreedActivity";
    private ArrayList<Breed> tmp;
    private Breed[] filteredbreeds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        Intent intent = getIntent();
        tmp = (ArrayList<Breed>) intent.getSerializableExtra("Breeds");
        filteredbreeds = tmp.toArray(new Breed[tmp.size()]);
        setListAdapter(new DogAdapter());
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Log.d(TAG, "onListItemClick position=" + position + " id=" + id + " " + filteredbreeds[position].getName());
        Intent intent = new Intent(ListBreedActivity.this, BreedDetailsActivity.class);
        intent.putExtra("Name", filteredbreeds[position].getName());
        intent.putExtra("Description", filteredbreeds[position].getLongDescription());
        startActivity(intent);
    }

    class DogAdapter extends BaseAdapter{

        private LayoutInflater inflater;

        @Override
        public int getCount(){return filteredbreeds.length;}

        @Override
        public Object getItem(int i){return filteredbreeds[i];}

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View row = view;
            if (view == null){
                if (inflater == null) {
                    inflater = (LayoutInflater) ListBreedActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                }
                row = inflater.inflate(R.layout.activity_details, viewGroup, false);
            }
            //Setup resource images
            TextView name = row.findViewById(R.id.text1);
            TextView description = row.findViewById(R.id.text2);

            Breed breed = filteredbreeds[i];
            name.setText(breed.getName());
            description.setText(breed.getShortDescription());
            //Setup resource images
            return row;
        }
    }
}
