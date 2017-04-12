package com.codepathms.cp.tripplannerapp.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.codepathms.cp.tripplannerapp.R;
import com.codepathms.cp.tripplannerapp.models.Itinerary;

/**
 * Created by melissa on 4/5/17.
 */

public class ItineraryCreateHeaderFragment extends Fragment{

    OnItineraryCreatedListener mCallback;

    // Container Activity must implement this interface
    public interface OnItineraryCreatedListener {
        public void onItinerarySave(Itinerary newItinerary);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (OnItineraryCreatedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnItineraryCreatedListener");
        }

    }

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
                mCallback.onItinerarySave(itinerary);
            }
        });

        return v;

    }


    public Itinerary saveItinerary() {
        //TODO: Create new Itinerary object, Save Itinerary to Parse DB here

        Itinerary it = new Itinerary();
        it.setTitle("New Itinerary!");
        it.save();
        return it;

    }
}
