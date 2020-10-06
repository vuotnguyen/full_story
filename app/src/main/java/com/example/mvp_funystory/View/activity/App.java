package com.example.mvp_funystory.View.activity;

import android.app.Application;

import androidx.room.Room;

import com.example.mvp_funystory.database.AppDB;

public class App extends Application {
    protected AppDB appDB;
    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
         initDB();
    }

    private void initDB() {
        appDB = Room.databaseBuilder(getApplicationContext(),AppDB.class,"database2").createFromAsset("fullstory.db").build();

    }

    public AppDB getAppDB() {
        return appDB;
    }

    public static App getInstance() {
        return instance;
    }
}
