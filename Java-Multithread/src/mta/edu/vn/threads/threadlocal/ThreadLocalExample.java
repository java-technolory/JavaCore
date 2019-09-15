package mta.edu.vn.threads.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Random;

public class ThreadLocalExample implements Runnable {

    // SimpleDateFormat is not thread-safe, so give one to each thread
    private static final ThreadLocal<SimpleDateFormat> format = new ThreadLocal<>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMdd HHmm");
        }
    };

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalExample obj = new ThreadLocalExample();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(obj, "" + i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Thread name = " + Thread.currentThread().getName() + " default formatter " + format.get().toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // formater pattern is changed here by thread, but it won't reflect to other threads
        format.set(new SimpleDateFormat());

        System.out.println(" Thread name = " + Thread.currentThread().getName() + " formatter " + format.get().toPattern());

    }
}
