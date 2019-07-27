package mta.edu.vn.threads.interrupt;

public class TestInterruptingThread1 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("task");
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread interruped ..." + e);
        }
        System.out.println("Thread is running ...");
    }

    public static void main(String[] args) {
        TestInterruptingThread1 t1 = new TestInterruptingThread1();
        t1.start();

        t1.interrupt();
    }
}
