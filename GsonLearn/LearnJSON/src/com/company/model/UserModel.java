package com.company.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserModel {

    @Expose
    @SerializedName("id")
    private Integer mId;

    @Expose
    @SerializedName("name")
    private String mName;

    @Expose
    @SerializedName("username")
    private String mUserName;

    @Expose
    @SerializedName("email")
    private String mEmail;

    @Expose
    @SerializedName("address")
    private AddressModel mAddress;

    @Expose
    @SerializedName("phone")
    private String mPhone;

    @Expose
    @SerializedName("website")
    private String mWebsite;

    @Expose
    @SerializedName("company")
    private CompanyModel mCompany;

    public UserModel() {
    }

    public UserModel(Integer mId, String mName, String mUserName, String mEmail, AddressModel mAddress, String mPhone, String mWebsite, CompanyModel mCompany) {
        this.mId = mId;
        this.mName = mName;
        this.mUserName = mUserName;
        this.mEmail = mEmail;
        this.mAddress = mAddress;
        this.mPhone = mPhone;
        this.mWebsite = mWebsite;
        this.mCompany = mCompany;
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

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public AddressModel getmAddress() {
        return mAddress;
    }

    public void setmAddress(AddressModel mAddress) {
        this.mAddress = mAddress;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public void setmWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }

    public CompanyModel getmCompany() {
        return mCompany;
    }

    public void setmCompany(CompanyModel mCompany) {
        this.mCompany = mCompany;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mUserName='" + mUserName + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mAddress=" + mAddress +
                ", mPhone='" + mPhone + '\'' +
                ", mWebsite='" + mWebsite + '\'' +
                ", mCompany=" + mCompany +
                '}';
    }
}
