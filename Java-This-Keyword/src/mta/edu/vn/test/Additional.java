package mta.edu.vn.test;

class J {
    void m(){
        System.err.println(this.hashCode()); // prints same reference ID
    }
}

public class Additional {
    public static void main(String [] args){
        J j = new J();
        System.out.println(j.hashCode()); // prints reference ID
        j.m();
    }
}
