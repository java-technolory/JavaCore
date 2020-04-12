package com.company.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TodoModel {
    @SerializedName("userId")
    @Expose
    private Integer mUserId;

    @SerializedName("id")
    @Expose
    private Integer mId;

    @SerializedName("title")
    @Expose
    private String mTitle;

    @SerializedName("completed")
    @Expose
    private String mCompleted;

    public TodoModel() {
    }

    public TodoModel(Integer mUserId, Integer mId, String mTitle, String mCompleted) {
        this.mUserId = mUserId;
        this.mId = mId;
        this.mTitle = mTitle;
        this.mCompleted = mCompleted;
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

    public String getmCompleted() {
        return mCompleted;
    }

    public void setmCompleted(String mCompleted) {
        this.mCompleted = mCompleted;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "mUserId=" + mUserId +
                ", mId=" + mId +
                ", mTitle='" + mTitle + '\'' +
                ", mCompleted='" + mCompleted + '\'' +
                '}';
    }
}
