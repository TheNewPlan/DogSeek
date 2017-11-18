package com.example.matthallowell.dogseek;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class ListActivity extends android.app.ListActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new BreedAdapter());
    }

    class BreedAdapter extends BaseAdapter{
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
        public View getView(int position, View convertView, ViewGroup parent){
            View row = convertView;
            return row;
        }
    }
}
