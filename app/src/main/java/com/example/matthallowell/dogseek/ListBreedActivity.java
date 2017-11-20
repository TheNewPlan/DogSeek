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
import android.widget.ImageView;
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
        intent.putExtra("DogGroup",Breed.getIconResource(filteredbreeds[position].getGroup()));
        intent.putExtra("Name", filteredbreeds[position].getName());
        intent.putExtra("Group", filteredbreeds[position].getGroup().toString());
        intent.putExtra("Size", filteredbreeds[position].getSize().toString());
        intent.putExtra("Coat", filteredbreeds[position].getCoat().toString());
        intent.putExtra("Shedding",filteredbreeds[position].getShedding().toString());
        intent.putExtra("Hypoallergenic",filteredbreeds[position].getisHypoallergenic().toString());
        intent.putExtra("Trainability",filteredbreeds[position].getTrainability().toString());
        intent.putExtra("Grooming",filteredbreeds[position].getGrooming().toString());
        intent.putExtra("Barking",filteredbreeds[position].getBarkingFrequency().toString());
        intent.putExtra("Energy",filteredbreeds[position].getEnergy().toString());
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
                row = inflater.inflate(R.layout.breed_list_item, viewGroup, false);
            }
            //Setup resource images
            ImageView icon = row.findViewById(R.id.image);
            TextView name = row.findViewById(R.id.text1);
            TextView description = row.findViewById(R.id.text2);

            Breed breed = filteredbreeds[i];
            name.setText(breed.getName());
            description.setText(breed.getShortDescription());
            icon.setImageResource(breed.getIconResource(breed.getGroup()));
            //Setup resource images
            return row;
        }
    }
}
