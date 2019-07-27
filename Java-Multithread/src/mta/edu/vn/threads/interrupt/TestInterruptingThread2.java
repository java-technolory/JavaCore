package mta.edu.vn.threads.interrupt;

public class TestInterruptingThread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("task");
        } catch (InterruptedException e) {
            System.out.println("Exception handled " + e);
        }
        System.out.println("Thread is running ...");
    }

    public static void main(String[] args) {
        TestInterruptingThread2 t2 = new TestInterruptingThread2();
        t2.start();
        t2.interrupt();

    }
}
