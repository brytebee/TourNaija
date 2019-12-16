package com.example.tournaija;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the hotels text view
        TextView hotels =  findViewById(R.id.hotels);

        // set an onClickListener on the hotels text view
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create an intent to start the hotels activity
                Intent hotels_intent = new Intent(MainActivity.this, HotelsActivity.class);

                // start the hotels activity
                startActivity(hotels_intent);
            }
        });

        // find the restaurants text view
        TextView restaurants =  findViewById(R.id.restaurants);

        // set an onClickListener on the restaurants text view
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create an intent to start the restaurants activity
                Intent restaurants_intent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // start the restaurants activity
                startActivity(restaurants_intent);
            }
        });

        // find the restaurants text view
        TextView stadiums =  findViewById(R.id.stadiums);

        // set an onClickListener on the stadiums text view
        stadiums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create an intent to start the stadiums activity
                Intent stadiums_intent = new Intent(MainActivity.this, StadiumsActivity.class);

                // start the stadiums activity
                startActivity(stadiums_intent);
            }
        });

        // find the restaurants text view
        TextView museums =  findViewById(R.id.museums);

        // set an onClickListener on the stadiums text view
        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create an intent to start the stadiums activity
                Intent museums_intent = new Intent(MainActivity.this, MuseumsActivity.class);

                // start the stadiums activity
                startActivity(museums_intent);
            }
        });

        // find the restaurants text view
        TextView malls =  findViewById(R.id.malls);

        // set an onClickListener on the stadiums text view
        malls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create an intent to start the stadiums activity
                Intent malls_intent = new Intent(MainActivity.this, MallListActivity.class);

                // start the stadiums activity
                startActivity(malls_intent);
            }
        });
    }
}
