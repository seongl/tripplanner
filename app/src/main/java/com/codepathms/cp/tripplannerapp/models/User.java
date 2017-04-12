package com.codepathms.cp.tripplannerapp.models;

import com.codepathms.cp.tripplannerapp.database.MyDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

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
@Table(database = MyDatabase.class)
public class User extends BaseModel{

    @Column
    @PrimaryKey (autoincrement=true)
    long id;

    @Column
    String username;

    @Column
    String userPreferences;

    @Column
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
        /*
        if (savedItineraries == null) {
            List<Itinerary> itineraryList = new Select().from(Itinerary.class).where(Condition.column(Itinerary_Table.PERSONID).eq(getId())).queryList();
            savedItineraries.addAll(itineraryList);
        }
        return savedItineraries;
        */
    }

    public ArrayList<Itinerary> getVisitedItineraries() {
        return visitedItineraries;
    }

}
