package com.company.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PhotoModel {

    @SerializedName("albumId")
    @Expose
    private Integer mAlbumId;

    @SerializedName("id")
    @Expose
    private Integer mId;

    @SerializedName("title")
    @Expose
    private String mTitle;

    @SerializedName("url")
    @Expose
    private String mUrl;

    @SerializedName("thumbnailUrl")
    @Expose
    private String mThumbnailUrl;

    public PhotoModel() {
    }

    public PhotoModel(Integer mAlbumId, Integer mId, String mTitle, String mUrl, String mThumbnailUrl) {
        this.mAlbumId = mAlbumId;
        this.mId = mId;
        this.mTitle = mTitle;
        this.mUrl = mUrl;
        this.mThumbnailUrl = mThumbnailUrl;
    }

    public Integer getmAlbumId() {
        return mAlbumId;
    }

    public void setmAlbumId(Integer mAlbumId) {
        this.mAlbumId = mAlbumId;
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

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getmThumbnailUrl() {
        return mThumbnailUrl;
    }

    public void setmThumbnailUrl(String mThumbnailUrl) {
        this.mThumbnailUrl = mThumbnailUrl;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "mAlbumId=" + mAlbumId +
                ", mId=" + mId +
                ", mTitle='" + mTitle + '\'' +
                ", mUrl='" + mUrl + '\'' +
                ", mThumbnailUrl='" + mThumbnailUrl + '\'' +
                '}';
    }
}
