package com.mta.edu.test;

public class Student extends Employee {

    private double avgMath;
    private double avgHistory;

    private Student(double avgHistory, double avgMath) {
        this.avgHistory = avgHistory;
        this.avgMath = avgMath;
    }

    protected Student(int id, String name, String address, String phone, double avgMath, double avgHistory) {
        super(id, name, address, phone);

    }
}
