package com.member.inner.static_nested;

public class StaticMethod {
    static int data = 30;
    static class Inner {
        static void msg(){
            System.out.println("data is : " + data);
        }
    }

    public static void main(String[] args) {
        StaticMethod.Inner.msg();
    }
}
