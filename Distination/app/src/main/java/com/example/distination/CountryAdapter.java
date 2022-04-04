package com.example.distination;

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

public class CountryAdapter extends ArrayAdapter<Countries> {
    List<Countries>countries;
    public CountryAdapter(@NonNull Context context, int resource, @NonNull List<Countries> objects) {
        super(context, resource, objects);
        countries = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.country, parent , false);
        Countries theCountry = countries.get(position);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.itemName);
        TextView price = view.findViewById(R.id.itemprice);
        ImageView mapp = view.findViewById(R.id.mapv);
        TextView baio = view.findViewById(R.id.baiov);

        imageView.setImageResource(theCountry.getImage());
        textView.setText(theCountry.getCountryName());
        price.setText(theCountry.getMoney());
        mapp.setImageResource(theCountry.getMap());
        baio.setText(theCountry.getBaio());

        return view;

    }
}
