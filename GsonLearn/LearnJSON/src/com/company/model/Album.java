package com.company.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Album {

    @SerializedName("userId")
    @Expose
    private Integer mUserId;

    @SerializedName("id")
    @Expose
    private Integer mId;

    @SerializedName("title")
    @Expose
    private String mTitle;

    public Album() {
    }

    public Album(Integer mUserId, Integer mId, String mTitle) {
        this.mUserId = mUserId;
        this.mId = mId;
        this.mTitle = mTitle;
    }

    public Integer getmUserId() {
        return mUserId;
    }

    public void setmUserId(Integer mUserId) {
        this.mUserId = mUserId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    @Override
    public String toString() {
        return "Album{" +
                "mUserId=" + mUserId +
                ", mId=" + mId +
                ", mTitle='" + mTitle + '\'' +
                '}';
    }
}
