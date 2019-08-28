package com.member.inner.anonymous;

public class LocalInner {

    private int data = 30;

    void display() {
        int b = 100;
        final int c = 10;
        class Local {
            protected int a = 10;

            private void msg() {
                System.out.println(data);
                System.out.println(a);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        LocalInner obj = new LocalInner();
        obj.display();
    }

}
