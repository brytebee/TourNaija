package com.example.tournaija;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestuarantsFragment extends Fragment {
    ArrayList<Place> placeArrayList = new ArrayList<>();

    public RestuarantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        placeArrayList.add(new Place("Radisson Blu Anchorage Hotel, Lagos",
                "Situated in the heart of Lagos, Nigeria, Radisson " +
                        "Blu Anchorage Hotel, is a stunning masterpiece styled " +
                        "by famous Swedish hospitality designer, Christian Lundwall. " +
                        "The Radisson Blu Anchorage Hotel, Lagos, Nigeria is nestled " +
                        "along the Lagos Lagoon on Victoria Island in the midst of the " +
                        "business district and banking area. This Lagos hotel has " +
                        "170 air-conditioned rooms, including 8 unique and opulently " +
                        "furnished suites, offering both stunning city and lagoon views. " +
                        "The Voyage buffet-style restaurant serves a range of eclectic, " +
                        "international cuisine and local dishes, while overlooking " +
                        "the Lagos Lagoon. The View bar lounge is ideal for snacks and " +
                        "drinks, and perfect for a Classic Cocktail as the sun sets. " +
                        "Providing jetty access, the Surface Bar and Grill on the terrace " +
                        "offers outdoor dining overlooking the lagoon. Guests enjoy free " +
                        "access to the hotel fitness area, complete with cardiovascular gym, " +
                        "massage room, outdoor infinity swimming pool, and steam room.The hotel " +
                        "boasts two upscale boardrooms and four spacious meeting rooms, all " +
                        "offering natural light as well as all the modern, audiovisual " +
                        "equipment expected of a World Class Hotel. All you need for " +
                        "a successful stay!",
                R.drawable.radisson_blu));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), placeArrayList);
        ListView placeList = rootView.findViewById(R.id.place_layout);

        // hooking the adapter
        placeList.setAdapter(placeAdapter);

        return rootView;
    }

}
