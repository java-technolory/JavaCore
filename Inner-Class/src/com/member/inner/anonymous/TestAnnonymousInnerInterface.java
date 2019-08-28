package com.member.inner.anonymous;

interface Eatable {
    void eat();
}

public class TestAnnonymousInnerInterface {

    public static void main(String[] args) {
        Eatable eatable = new Eatable() {
            @Override
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        eatable.eat();
    }
}
