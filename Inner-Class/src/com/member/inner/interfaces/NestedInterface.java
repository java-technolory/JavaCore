package com.member.inner.interfaces;

// trong interface mặc định là public static
interface Showable {
    void show();
    interface Message {
        void msg();
    }
}

public class NestedInterface implements Showable.Message,Showable {
    @Override
    public void msg() {
        System.out.println("Hello Nested Interface!");
    }

    public static void main(String[] args) {
        Showable.Message msg = new NestedInterface();
        msg.msg();

    }

    @Override
    public void show() {

    }
}
