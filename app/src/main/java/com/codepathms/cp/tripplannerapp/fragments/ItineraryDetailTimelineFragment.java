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
import com.codepathms.cp.tripplannerapp.models.Stop_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

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

        stopsList.addAll(getStops());


        return v;
    }

    public ArrayList<Stop> getStops() {
        //TODO: Get stops from Parse DB

        Itinerary parentItinerary = (Itinerary) Parcels.unwrap(getArguments().getParcelable("itinerary"));
        List<Stop> stopList = SQLite.select().from(Stop.class).where(Stop_Table.itineraryId.eq(parentItinerary.getId())).queryList();

        //ArrayList<Stop> stopsList = new ArrayList<>();

        /*
        if (stopList.size() == 0) {
            //some Stop mock data
            Stop stop1 = new Stop();
            stop1.setTitle("Fancy Restaurant");
            stop1.setLocation("11 College Ave, Los Gatos, CA 95030, USA");
            Stop stop2 = new Stop();
            stop2.setTitle("Ice Cream Shop");
            stop2.setLocation("2948 College Ave, Berkeley, CA 94705, USA");
            stopsList.add(stop1);
            stopsList.add(stop2);
            return stopsList;

        }*/

        return (ArrayList<Stop>) stopList;

    }
}
