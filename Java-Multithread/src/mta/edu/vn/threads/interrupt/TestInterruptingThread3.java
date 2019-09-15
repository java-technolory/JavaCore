package mta.edu.vn.threads.interrupt;

public class TestInterruptingThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++){
            System.out.println(i);
            try {
                sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestInterruptingThread3 t3 = new TestInterruptingThread3();
        t3.start();
//        t3.interrupt();
    }
}
