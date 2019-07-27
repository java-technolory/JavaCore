package mta.edu.vn.threads.threadpool;

public class ThreadSafety {
    public static void main(String[] args) throws InterruptedException {
        ProcessingThread p = new ProcessingThread();

        Thread t1 = new Thread(p);
        t1.start();

        Thread t2 = new Thread(p);
        t2.start();

        //wait for thread to finish processing
        t1.join();
        t2.join();

        System.out.println("Processing count = " + p.getCount());
    }
}

class ProcessingThread implements Runnable {
    private int count;
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i < 5; i++) {
                processSomething(i);
                count++;
            }
        }
    }

    public int getCount() {
        return this.count;
    }

    public void processSomething(int i) {
        try {
            System.out.println(i);
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
