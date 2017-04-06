package com.codepathms.cp.tripplannerapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.codepathms.cp.tripplannerapp.R;
import com.codepathms.cp.tripplannerapp.models.Stop;

import java.util.List;

import static com.codepathms.cp.tripplannerapp.R.id.tvItineraryTitle;

/**
 * Created by melissa on 4/4/17.
 */

public class StopArrayAdapter extends ArrayAdapter<Stop> {
    private Context context;

    public StopArrayAdapter(Context context, List<Stop> stops) {
        super(context, android.R.layout.simple_list_item_1, stops);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final Stop stop =  getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_stop, parent, false);
        }

        TextView tvStopTitle = (TextView) convertView.findViewById(R.id.tvStopTitle);
        tvStopTitle.setText(stop.getTitle());

        return convertView;
    }

}
