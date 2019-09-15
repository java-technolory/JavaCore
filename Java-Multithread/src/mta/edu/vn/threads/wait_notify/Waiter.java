package mta.edu.vn.threads.wait_notify;

import mta.edu.vn.threads.common.Message;

public class Waiter implements Runnable {

    private Message msg;

    public Waiter(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            System.out.println(name + " waiting to get notified at time : " + System.currentTimeMillis());
            try {
                msg.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " waiter thread go notified at time : " + System.currentTimeMillis());
            //process the message now
            System.out.println(name + " processed : " + msg.getMsg());
        }
    }
}
