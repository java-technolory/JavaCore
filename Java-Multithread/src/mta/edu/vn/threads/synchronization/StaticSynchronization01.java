package mta.edu.vn.threads.synchronization;

class Human {
    synchronized static void printHuman(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * n);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread03 extends Thread {
    @Override
    public void run() {
        Human.printHuman(1);
    }
}

class MyThread04 extends Thread {
    @Override
    public void run() {
        Human.printHuman(10);
    }
}

class MyThread05 extends Thread {
    @Override
    public void run() {
        Human.printHuman(100);
    }
}

class MyThread06 extends Thread {
    @Override
    public void run() {
        Human.printHuman(1000);
    }
}

public class StaticSynchronization01 {
    public static void main(String[] args) {
        MyThread03 t3 = new MyThread03();
        MyThread04 t4 = new MyThread04();
        MyThread05 t5 = new MyThread05();
        MyThread06 t6 = new MyThread06();

        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
