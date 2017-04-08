package com.codepathms.cp.tripplannerapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codepathms.cp.tripplannerapp.R;

/**
 * Created by melissa on 4/5/17.
 */

public class ItineraryCreateTimelineFragment extends Fragment{

    public static ItineraryCreateTimelineFragment newInstance() {
        ItineraryCreateTimelineFragment itineraryCreateTimelineFragment = new ItineraryCreateTimelineFragment();
//        Bundle args = new Bundle();
//        args.putParcelable("itinerary", Parcels.wrap(itinerary));
//        itineraryCreateTimelineFragment.setArguments(args);
        return itineraryCreateTimelineFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_create_timeline, container, false);

        return v;

    }

}
