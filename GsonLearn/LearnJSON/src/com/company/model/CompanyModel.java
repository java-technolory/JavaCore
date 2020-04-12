package com.company.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompanyModel {

    @Expose
    @SerializedName("name")
    private String mName;

    @Expose
    @SerializedName("catchPhrase")
    private String mCatchPhrase;

    @Expose
    @SerializedName("bs")
    private String mBs;

    public CompanyModel() {
    }

    public CompanyModel(String mName, String mCatchPhrase, String mBs) {
        this.mName = mName;
        this.mCatchPhrase = mCatchPhrase;
        this.mBs = mBs;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmCatchPhrase() {
        return mCatchPhrase;
    }

    public void setmCatchPhrase(String mCatchPhrase) {
        this.mCatchPhrase = mCatchPhrase;
    }

    public String getmBs() {
        return mBs;
    }

    public void setmBs(String mBs) {
        this.mBs = mBs;
    }

    @Override
    public String toString() {
        return "CompanyModel{" +
                "mName='" + mName + '\'' +
                ", mCatchPhrase='" + mCatchPhrase + '\'' +
                ", mBs='" + mBs + '\'' +
                '}';
    }
}
