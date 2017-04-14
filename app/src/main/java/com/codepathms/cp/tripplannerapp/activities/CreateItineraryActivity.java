package com.codepathms.cp.tripplannerapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.codepathms.cp.tripplannerapp.R;
import com.codepathms.cp.tripplannerapp.fragments.ItineraryCreateFragment;
import com.codepathms.cp.tripplannerapp.models.Itinerary;

import org.parceler.Parcels;

public class CreateItineraryActivity extends AppCompatActivity implements ItineraryCreateFragment.OnItineraryCreatedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_itinerary);

        if (savedInstanceState == null) {
            ItineraryCreateFragment itineraryCreateFragment = ItineraryCreateFragment.newInstance();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flCreateItineraryContainer, itineraryCreateFragment, "ITINERARY_CREATE");
            ft.commit();
        }

    }

    @Override
    public void onItinerarySave(Itinerary newItinerary) {
        Intent intent = new Intent();
        intent.putExtra("NEW_ITINERARY", Parcels.wrap(newItinerary));
        setResult(RESULT_OK, intent);
        finish();

    }

}
