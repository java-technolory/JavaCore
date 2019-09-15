package com.member.inner.interfaces;

class A {
    //static interface Message: implicitely
    interface Message {
        void msg();
    }
}

interface B {
    //static class C: implicitely
    class C {
        void show() {
            System.out.println("Hello World ...");
        }
    }
}

public class NestedInterfaceClass extends B.C implements A.Message {

    @Override
    public void msg() {
        System.out.println("Hello nested interface in class ...");
    }


    public static void main(String[] args) {
        A.Message m = new NestedInterfaceClass();
        m.msg();
    }


}
