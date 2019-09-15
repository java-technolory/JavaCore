package com.mta.edu.test;

class A {
    void print(){
        System.out.println("A ...");
    }
}

class B {
    A a;

    B (){
        this.a = new A();
    }

    public A and() {
        return a;
    }

    B printB(){
        System.out.println("B ....");
        return new B();
    }
}

class C {
    B b;

    C (){
        this.b = new B();
    }

    public B and() {
        return b;
    }

    C printC(){
        System.out.println("C ...");
        return new C();
    }

}

class D {
    C c;

    D(){
        this.c = new C();
    }

    public C and() {
        return c;
    }

    D printD(){
         return new D();
    }


}

public class Human {

    public static void main(String[] args) {
        D d = new D();

        d.printD()
                .and()
                .printC()
                .and()
                .printB()
                .and()
                .print();
    }
}
