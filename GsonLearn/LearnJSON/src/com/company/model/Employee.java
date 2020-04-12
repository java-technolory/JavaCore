package com.company.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {

    @SerializedName("firstName")
    private String mFirstName;

    @SerializedName("age")
    private Integer mAge;

    @SerializedName("mail")
    private String mMail;

    @SerializedName("address")
    private Address mAddress;

    @SerializedName("family")
    @Expose(deserialize = true, serialize = true)
    private List<FamilyMember> mFamily;

    public Employee(String mFirstName, Integer mAge, String mMail, Address mAddress) {
        this.mFirstName = mFirstName;
        this.mAge = mAge;
        this.mMail = mMail;
        this.mAddress = mAddress;
    }

    public Employee(String mFirstName, Integer mAge, String mMail) {
        this.mFirstName = mFirstName;
        this.mAge = mAge;
        this.mMail = mMail;
    }

    public Employee(String mFirstName, Integer mAge, String mMail, Address mAddress, List<FamilyMember> mFamily) {
        this.mFirstName = mFirstName;
        this.mAge = mAge;
        this.mMail = mMail;
        this.mAddress = mAddress;
        this.mFamily = mFamily;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "mFirstName='" + mFirstName + '\'' +
                ", mAge=" + mAge +
                ", mMail='" + mMail + '\'' +
                ", mAddress=" + mAddress +
                ", mFamily=" + mFamily +
                '}';
    }
}
