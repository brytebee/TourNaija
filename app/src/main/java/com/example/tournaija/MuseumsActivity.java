package com.example.tournaija;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> placeArrayList = new ArrayList<>();

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

        PlaceAdapter placeAdapter = new PlaceAdapter(this, placeArrayList);
        ListView placeList = findViewById(R.id.place_layout);

        // hooking the adapter
        placeList.setAdapter(placeAdapter);
    }

}
