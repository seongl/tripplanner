package com.codepathms.cp.tripplannerapp.application;

import android.app.Application;

import com.codepathms.cp.tripplannerapp.models.UserParse;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.interceptors.ParseLogInterceptor;

/**
 * Created by seonglee on 4/15/17.
 */

public class TripplannerApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models here
        ParseObject.registerSubclass(UserParse.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("codepathms") // should correspond to APP_ID env variable
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server("https://codepathms.herokuapp.com/parse/").build());
    }
}