package mta.edu.vn.model;

import java.util.Objects;

public class Student extends Person{
    private int studentId;
    private String univerName;
    private float avgMark;

    public Student() {
    }

    public Student(int id, String univerName, float avgMark) {
        this.studentId = id;
        this.univerName = univerName;
        this.avgMark = avgMark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int id) {
        this.studentId = id;
    }

    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(super.equals(obj))) {
            return false;
        }
        Student student = (Student) obj;
        // sử dụng toán tử so sánh == khi so sánh với kiểu dữ liệu nguyên thủy còn với kiểu object sử dụng equal() để so sánh.
        return this.studentId == student.getStudentId()
                && this.avgMark == student.getAvgMark()
                && Objects.equals(this.univerName, student.getUniverName());
    }
}
