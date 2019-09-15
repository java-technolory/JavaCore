package mta.edu.vn.test;

class A{
    void m(){
        System.err.println("hello m");
    }

    void n(){
//        m(); // same as this.m();
//        or
        System.out.println("hello n");
        this.m();
    }
}

public class This_ToInvokeCurrentClassMethod {
    public static void main(String [] args){
        A a = new A();
        a.n();
    }
}
