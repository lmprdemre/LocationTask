package com.example.android.locationtask.Service;

import com.example.android.locationtask.Model.LocationsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    // https://instalyticsdbplandiag814.blob.core.windows.net/mobiversite/location.json
    @GET("/mobiversite/location.json")
    Call<LocationsResponse> getLocations();

}
