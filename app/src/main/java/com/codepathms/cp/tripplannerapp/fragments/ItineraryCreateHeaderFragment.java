package com.codepathms.cp.tripplannerapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.codepathms.cp.tripplannerapp.R;
import com.codepathms.cp.tripplannerapp.models.Itinerary;

import org.parceler.Parcels;

import static android.app.Activity.RESULT_OK;

/**
 * Created by melissa on 4/5/17.
 */

public class ItineraryCreateHeaderFragment extends Fragment{

    public static ItineraryCreateHeaderFragment newInstance() {
        ItineraryCreateHeaderFragment itineraryCreateHeaderFragment = new ItineraryCreateHeaderFragment();

        return itineraryCreateHeaderFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_create_header, container, false);


        Button btnCreateSave = (Button) v.findViewById(R.id.btnCreateSave);
        btnCreateSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Itinerary itinerary = saveItinerary();

                Intent intent = new Intent();
                intent.putExtra("NEW_ITINERARY", Parcels.wrap(itinerary));
                getActivity().setResult(RESULT_OK, intent);
                getActivity().finish();

            }
        });

        return v;

    }


    public Itinerary saveItinerary() {
        //TODO: Create new Itinerary object, Save Itinerary to Parse DB here

        Itinerary it = new Itinerary();
        it.setTitle("New Itinerary!");
        return it;

    }
}
