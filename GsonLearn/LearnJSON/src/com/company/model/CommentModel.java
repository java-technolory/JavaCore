package com.company.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommentModel {

    @SerializedName("postId")
    @Expose
    private Integer mPostId;

    @SerializedName("id")
    @Expose
    private Integer mId;

    @SerializedName("name")
    @Expose
    private String mName;

    @SerializedName("email")
    @Expose
    private String mEmail;

    @SerializedName("body")
    @Expose
    private String mBody;

    public CommentModel() {
    }

    public CommentModel(Integer mPostId, Integer mId, String mName, String mEmail, String mBody) {
        this.mPostId = mPostId;
        this.mId = mId;
        this.mName = mName;
        this.mEmail = mEmail;
        this.mBody = mBody;
    }

    public Integer getmPostId() {
        return mPostId;
    }

    public void setmPostId(Integer mPostId) {
        this.mPostId = mPostId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmBody() {
        return mBody;
    }

    public void setmBody(String mBody) {
        this.mBody = mBody;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "mPostId=" + mPostId +
                ", mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mBody='" + mBody + '\'' +
                '}';
    }
}
