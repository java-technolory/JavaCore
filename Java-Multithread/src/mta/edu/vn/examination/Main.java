package mta.edu.vn.examination;

public class Main {
    public static void main(String[] args) {

        Message msg = new Message("message");
        Waiting w = new Waiting(msg);
        Waiting w1 = new Waiting(msg);
        Notification n = new Notification(msg);

        Thread t1 = new Thread(w,"waiter");

        Thread t2 = new Thread(n,"notifier");

        Thread t3 = new Thread(w1,"waiter1");

        t1.start();
        t2.start();
        t3.start();
    }
}
