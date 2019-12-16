package com.example.tournaija;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends ArrayAdapter {

    public PlaceAdapter(@NonNull Context context, @NonNull ArrayList<Place> places) {
        super(context, 0, places);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Place currentSong = (Place) getItem(position);
        TextView placeName = listItemView.findViewById(R.id.place);
        placeName.setText(currentSong.getName());
        TextView placeDescription = listItemView.findViewById(R.id.place_description);
        placeDescription.setText(currentSong.getDescription());
        ImageView placeImage =listItemView.findViewById(R.id.imageId);
        placeImage.setImageResource(currentSong.getImageId());

        return listItemView;
    }
}
