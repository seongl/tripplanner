package com.codepathms.cp.tripplannerapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.codepathms.cp.tripplannerapp.R;
import com.codepathms.cp.tripplannerapp.activities.CreateItineraryActivity;
import com.codepathms.cp.tripplannerapp.activities.ItineraryDetailActivity;
import com.codepathms.cp.tripplannerapp.adapters.ItineraryArrayAdapter;
import com.codepathms.cp.tripplannerapp.models.Itinerary;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by melissa on 4/4/17.
 */

public class ItineraryListFragment extends Fragment {
    private final int REQUEST_CODE = 20;

    List<Itinerary> itineraryList;
    private ItineraryArrayAdapter itineraryAdapter;
    public ListView lvItineraries;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_itinerary_list, container, false);

        //Get Itineraries ListView and set Adapter
        lvItineraries = (ListView) v.findViewById(R.id.lvItineraries);
        lvItineraries.setAdapter(itineraryAdapter);

        lvItineraries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Itinerary selectedItinerary = itineraryList.get(position);
                Intent i = new Intent(getActivity().getApplicationContext(), ItineraryDetailActivity.class);
                i.putExtra("itinerary", Parcels.wrap(selectedItinerary));
                startActivityForResult(i, REQUEST_CODE);

            }
        });

        FloatingActionButton fabCreate = (FloatingActionButton) v.findViewById(R.id.fabCreate);
        fabCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(), CreateItineraryActivity.class);
                startActivity(i);

            }
        });

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        itineraryList = new ArrayList<>();
        itineraryAdapter = new ItineraryArrayAdapter(getActivity(), itineraryList);

        /* creating some mock data */
        Itinerary it1 = new Itinerary();
        it1.setTitle("Dinner and Dessert");
        Itinerary it2 = new Itinerary();
        it2.setTitle("Biking and Picnic at the beach");
        itineraryList.add(it1);
        itineraryList.add(it2);
    }
}
