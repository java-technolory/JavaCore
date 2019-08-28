package com.member.inner.static_nested;

public class StaticClass {
    static int data = 30;
    static class Inner {
        void msg(){
            System.out.println("data is : " + data);
        }
    }

    public static void main(String[] args) {
        StaticClass.Inner obj = new StaticClass.Inner();
        obj.msg();
    }
}
