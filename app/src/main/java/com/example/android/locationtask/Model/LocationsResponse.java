package com.example.android.locationtask.Model;

import com.example.android.locationtask.Model.Location;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class LocationsResponse {
    @SerializedName("locations")
    private ArrayList<Location> locations;

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }
}
