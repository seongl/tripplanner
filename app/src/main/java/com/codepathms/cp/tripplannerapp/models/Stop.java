package com.codepathms.cp.tripplannerapp.models;

/**
 * Created by melissa on 4/3/17.
 */

/* Stop fields:
    Id
    Title
    Description
    Tags: Restaurant, Italian
    Rating
    Location
    PricePoint
    PrevStopId
    NextStopId
    ImageUrl
 */

public class Stop {

    long id;
    String title;
    String description;
    String tags;
    int rating; //1-5
    String location; //city name
    int pricePoint; //1-4 ($-$$$$)
    long prevStopId;
    long nextStopId;
    String imageUrl;

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

    public int getPricePoint() {
        return pricePoint;
    }

    public long getPrevStopId() {
        return prevStopId;
    }

    public long getNextStopId() {
        return nextStopId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
