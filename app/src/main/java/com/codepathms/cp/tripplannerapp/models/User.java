package com.codepathms.cp.tripplannerapp.models;

import java.util.ArrayList;

/**
 * Created by melissa on 4/3/17.
 */

/* User fields:
    Id
    Username
    UserPreferences: food, item2, item3
    ImageUrl
    SavedItineraries (list)
    VisitedItineraries (list)
*/

public class User {

    long id;
    String username;
    String userPreferences;
    String imageUrl;
    ArrayList<Itinerary> savedItineraries;
    ArrayList<Itinerary> visitedItineraries;

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getUserPreferences() {
        return userPreferences;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ArrayList<Itinerary> getSavedItineraries() {
        return savedItineraries;
    }

    public ArrayList<Itinerary> getVisitedItineraries() {
        return visitedItineraries;
    }

}
