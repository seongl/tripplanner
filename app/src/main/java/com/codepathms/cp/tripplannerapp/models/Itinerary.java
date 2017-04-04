package com.codepathms.cp.tripplannerapp.models;

import java.util.ArrayList;

/**
 * Created by melissa on 4/3/17.
 */

/* Itinerary fields:
    Id
    Title
    Description
    CreatedBy (UserId)
    Tags: food, outdoor, city, loud, italian
    Rating
    Location (city?)
    TimeDuration (calculated after full itinerary saved)
    Distance
    ImageUrl
    Stops (list of Stops)

 */

public class Itinerary {

    long id;
    String title;
    String description;
    String tags;
    int rating; //1-5
    String location; //City name
    int timeDuration; //In hours
    float distance;  //In miles
    String imageUrl;
    ArrayList<Stop> stops;
    //User createdByUser; //is this needed?

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTags() {
        return tags;
    }

    public int getRating() {
        return rating;
    }

    public String getLocation() {
        return location;
    }

    public int getTimeDuration() {
        return timeDuration;
    }

    public float getDistance() {
        return distance;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ArrayList<Stop> getStops() {
        return stops;
    }

}
