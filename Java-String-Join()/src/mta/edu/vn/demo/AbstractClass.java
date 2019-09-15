package mta.edu.vn.demo;

abstract class A {
    private int i;

    public abstract void msg();
}

public class AbstractClass extends A {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        A a = new AbstractClass();
    }

    @Override
    public void msg() {

    }
}
