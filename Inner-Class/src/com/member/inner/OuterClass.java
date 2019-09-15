package com.member.inner;

public class OuterClass {
    private int data = 30;

    class InnerClass {
        private int a = 10;

        private void msg() {
            System.out.println("data is " + data + " - " + a);
        }
    }

    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        OuterClass.InnerClass in = obj.new InnerClass();
        in.msg();
    }
}
