package com.example.android.locationtask.Model;

import com.google.gson.annotations.SerializedName;

public class Location {
    @SerializedName("title")
    private String title;
    @SerializedName("lattitude")
    private double lattitude;
    @SerializedName("longitude")
    private double longitude;

    public Location(String title, double lattitude, double longitude) {
        this.title = title;
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLattitude() {
        return lattitude;
    }

    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
