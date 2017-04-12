package com.codepathms.cp.tripplannerapp.models;

import com.codepathms.cp.tripplannerapp.database.MyDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ColumnIgnore;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import org.parceler.Parcel;

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
@Parcel(analyze={Itinerary.class})
@Table(database = MyDatabase.class)
public class Itinerary extends BaseModel {

    @Column
    @PrimaryKey (autoincrement=true)
    long id;

    @Column
    String title;

    @Column
    String description;

    @Column
    String tags;

    @Column
    int rating; //1-5

    @Column
    String location; //City name

    @Column
    int timeDuration; //In hours

    @Column
    float distance;  //In miles

    @Column
    String imageUrl;

    @ColumnIgnore
    ArrayList<Stop> stops;

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

    public void setTimeDuration(int timeDuration) {
        this.timeDuration = timeDuration;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setStops(ArrayList<Stop> stops) {
        this.stops = stops;
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
