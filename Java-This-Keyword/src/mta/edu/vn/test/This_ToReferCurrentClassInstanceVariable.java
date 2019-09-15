package mta.edu.vn.test;

class Student {

    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.err.println(this.rollno + " - " + this.name + " - " + this.fee);
    }
}

public class This_ToReferCurrentClassInstanceVariable {
    public static void main(String [] args){
        Student s1 = new Student(100,"Phan",5000f);
        Student s2 = new Student(200,"Van",7000f);
        s1.display();
        s2.display();
    }
}
