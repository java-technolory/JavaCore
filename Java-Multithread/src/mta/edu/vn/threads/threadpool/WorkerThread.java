package mta.edu.vn.threads.threadpool;

public class WorkerThread implements Runnable {

    private String message;

    public WorkerThread(String msg) {
        this.message = msg;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processMessage();   // sleep thread 2 seconds
        System.out.println(Thread.currentThread().getName() + " (End)");    // print thread name
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.message;
    }
}
