package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class DessertsAdapter extends ArrayAdapter {
    Context context;
    int resource;
    List<Candies> listaDeDesserts;

    @Override
    public int getCount() {
        return listaDeDesserts.size();
    }


    public DessertsAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.listaDeDesserts = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(resource, parent, false);
        }

        Candies candy = listaDeDesserts.get(position);

        ImageView imageView = view.findViewById(R.id.ivCandies);
        imageView.setImageResource(candy.getResourceImage());

        TextView textView = view.findViewById(R.id.tvCandies);
        textView.setText(candy.getDescription());

        return view;
    }
}
