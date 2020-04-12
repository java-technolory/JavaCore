package com.company.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeographyModel {
    @SerializedName("lat")
    @Expose
    private String mLatitude;    // vĩ độ

    @SerializedName("lng")
    @Expose
    private String mLongitude;   // kinh độ

    public GeographyModel() {
    }

    public GeographyModel(String mLatitude, String mLongitude) {
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
    }

    public String getmLatitude() {
        return mLatitude;
    }

    public void setmLatitude(String mLatitude) {
        this.mLatitude = mLatitude;
    }

    @Override
    public String toString() {
        return "Geography{" +
                "mLatitude='" + mLatitude + '\'' +
                ", mLongitude='" + mLongitude + '\'' +
                '}';
    }

    public String getmLongitude() {
        return mLongitude;
    }

    public void setmLongitude(String mLongitude) {
        this.mLongitude = mLongitude;
    }
}
