package com.company.model;

import com.google.gson.annotations.SerializedName;

public class FamilyMember {

    @SerializedName("role")
    private String mRole;

    @SerializedName("age")
    private int mAge;

    public FamilyMember(String mRole, int mAge) {
        this.mRole = mRole;
        this.mAge = mAge;
    }

    @Override
    public String toString() {
        return "FamilyMember " +
                "{" +
                "mRole='" + mRole + '\'' +
                ", mAge=" + mAge +
                '}';
    }
}
