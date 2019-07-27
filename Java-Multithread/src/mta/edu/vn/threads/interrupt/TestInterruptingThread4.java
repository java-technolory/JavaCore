package mta.edu.vn.threads.interrupt;

public class TestInterruptingThread4 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            if (Thread.interrupted()) {
                System.out.println("code for interrupted thread " + Thread.currentThread().getName());
            } else {
                System.out.println("code for normal thread " + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        TestInterruptingThread4 t1 = new TestInterruptingThread4();
        t1.setName("t1");

        TestInterruptingThread4 t2 = new TestInterruptingThread4();
        t2.setName("t2");

        t1.start();
        t1.interrupt();

        t2.start();
    }
}
