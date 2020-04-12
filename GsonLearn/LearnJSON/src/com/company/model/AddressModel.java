package com.company.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddressModel {
    @Expose
    @SerializedName("street")
    private String mStreet;

    @Expose
    @SerializedName("suite")
    private String mSuite;

    @Expose
    @SerializedName("city")
    private String mCity;

    @Expose
    @SerializedName("zipcode")
    private String mZipCode;

    @Expose
    @SerializedName("geo")
    private GeographyModel mGeography;

    public AddressModel() {
    }

    public AddressModel(String mStreet, String mSuite, String mCity, String mZipCode, GeographyModel mGeography) {
        this.mStreet = mStreet;
        this.mSuite = mSuite;
        this.mCity = mCity;
        this.mZipCode = mZipCode;
        this.mGeography = mGeography;
    }

    public String getmStreet() {
        return mStreet;
    }

    public void setmStreet(String mStreet) {
        this.mStreet = mStreet;
    }

    public String getmSuite() {
        return mSuite;
    }

    public void setmSuite(String mSuite) {
        this.mSuite = mSuite;
    }

    public String getmCity() {
        return mCity;
    }

    public void setmCity(String mCity) {
        this.mCity = mCity;
    }

    public String getmZipCode() {
        return mZipCode;
    }

    public void setmZipCode(String mZipCode) {
        this.mZipCode = mZipCode;
    }

    public GeographyModel getmGeography() {
        return mGeography;
    }

    public void setmGeography(GeographyModel mGeography) {
        this.mGeography = mGeography;
    }

    @Override
    public String toString() {
        return "AddressModel{" +
                "mStreet='" + mStreet + '\'' +
                ", mSuite='" + mSuite + '\'' +
                ", mCity='" + mCity + '\'' +
                ", mZipCode='" + mZipCode + '\'' +
                ", mGeography=" + mGeography +
                '}';
    }
}
