package mta.edu.vn.examination;

public class Notification implements Runnable {
    private Message msg;
    public Object obj = new Object();
    public Notification(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started ...");
        synchronized (msg) {
            msg.setMessage(name + " Notifer done!");
            msg.notify();
        }
    }
}
