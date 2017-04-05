package com.codepathms.cp.tripplannerapp.models;

import org.parceler.Parcel;

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

@Parcel(analyze={User.class})
public class User {

    long id;
    String username;
    String userPreferences;
    String imageUrl;
    ArrayList<Itinerary> savedItineraries;
    ArrayList<Itinerary> visitedItineraries;


    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserPreferences(String userPreferences) {
        this.userPreferences = userPreferences;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setSavedItineraries(ArrayList<Itinerary> savedItineraries) {
        this.savedItineraries = savedItineraries;
    }

    public void setVisitedItineraries(ArrayList<Itinerary> visitedItineraries) {
        this.visitedItineraries = visitedItineraries;
    }

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
