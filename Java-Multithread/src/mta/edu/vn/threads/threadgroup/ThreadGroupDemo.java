package mta.edu.vn.threads.threadgroup;

public class ThreadGroupDemo implements Runnable {

    public static void main(String[] args) {
        ThreadGroupDemo runable = new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

        Thread t1 = new Thread(tg1, runable, "one");
        t1.start();

        Thread t2 = new Thread(tg1, runable, "two");
        t2.start();

        Thread t3 = new Thread(tg1, runable, "three");
        t3.start();

        Thread t4 = new Thread(tg1, runable, "four");
        t4.start();

        Thread t5 = new Thread(tg1, runable, "five");
        t5.start();

        Thread t6 = new Thread(tg1, runable, "six");
        t6.start();

        Thread t7 = new Thread(tg1, runable, "seven");
        t7.start();

        System.out.println("Thread Group Name: " + tg1.getName());
        tg1.list();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
