package com.codepathms.cp.tripplannerapp.models;

import com.codepathms.cp.tripplannerapp.database.MyDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

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
@Table(database = MyDatabase.class)
public class Stop extends BaseModel{

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
    String location; //city name

    @Column
    int pricePoint; //1-4 ($-$$$$)

    @Column
    long prevStopId;

    @Column
    long nextStopId;

    @Column
    String imageUrl;

    @Column
    long itineraryId;

    @Column
    String placeId;

    @Column
    int sequenceNumber;

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

    public void setItineraryId(long itineraryId) {
        this.itineraryId = itineraryId;
    }
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }
    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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

    public long getItineraryId() {
        return itineraryId;
    }

    public String getPlaceId() {
        return placeId;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

}
