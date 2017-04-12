package com.codepathms.cp.tripplannerapp.database;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by melissa on 4/11/17.
 */

@Database(name = MyDatabase.NAME, version = MyDatabase.VERSION)
public class MyDatabase {
    public static final String NAME = "MyDataBase";

    public static final int VERSION = 1;
}