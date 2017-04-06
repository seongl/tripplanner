package com.codepathms.cp.tripplannerapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.codepathms.cp.tripplannerapp.R;
import com.codepathms.cp.tripplannerapp.adapters.StopArrayAdapter;
import com.codepathms.cp.tripplannerapp.models.Itinerary;
import com.codepathms.cp.tripplannerapp.models.Stop;

import org.parceler.Parcels;

import java.util.ArrayList;

/**
 * Created by melissa on 4/4/17.
 */

public class ItineraryDetailTimelineFragment extends Fragment {

    ListView lvStops;
    ArrayList<Stop> stopsList;
    private StopArrayAdapter stopsAdapter;

    public static ItineraryDetailTimelineFragment newInstance(Itinerary itinerary) {
        ItineraryDetailTimelineFragment itineraryDetailTimelineFragment = new ItineraryDetailTimelineFragment();
        Bundle args = new Bundle();
        args.putParcelable("itinerary", Parcels.wrap(itinerary));
        itineraryDetailTimelineFragment.setArguments(args);
        return itineraryDetailTimelineFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_itinerary_detail_timeline, container, false);
        lvStops = (ListView) v.findViewById(R.id.lvStops);

        stopsList = new ArrayList<Stop>();
        stopsAdapter = new StopArrayAdapter(getActivity(), stopsList);
        lvStops.setAdapter(stopsAdapter);

        /* some Stop mock data */
        Stop stop1 = new Stop();
        stop1.setTitle("Fancy Restaurant");
        Stop stop2 = new Stop();
        stop2.setTitle("Ice Cream Shop");
        stopsList.add(stop1);
        stopsList.add(stop2);

        return v;
    }
}
