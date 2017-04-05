package com.codepathms.cp.tripplannerapp.models;

import org.parceler.Parcel;

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
@Parcel(analyze={Stop.class})
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

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPricePoint(int pricePoint) {
        this.pricePoint = pricePoint;
    }

    public void setPrevStopId(long prevStopId) {
        this.prevStopId = prevStopId;
    }

    public void setNextStopId(long nextStopId) {
        this.nextStopId = nextStopId;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

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
