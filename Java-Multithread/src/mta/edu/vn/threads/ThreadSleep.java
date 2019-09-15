package mta.edu.vn.threads;

public class ThreadSleep {

    public static void main(String[] args) throws InterruptedException {
        Long start = System.currentTimeMillis();
        Thread.sleep(2000);
        System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));
    }

}
