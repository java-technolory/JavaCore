package mta.edu.vn.examination;

import mta.edu.vn.threads.wait_notify.Waiter;

public class Waiting implements Runnable{

    private Message msg;

    public Waiting(Message msg){
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        synchronized (msg){
            System.out.println(Thread.currentThread().getName());
            try {
                msg.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Processed : " + msg.getMessage());
        }
    }
}
