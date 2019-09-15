package mta.edu.vn.threads.synchronization;

import java.util.Arrays;

public class SynchronizedMethod {
    public static void main(String[] args) throws InterruptedException {
        String[] a = {"1", "2", "3", "4", "5", "6"};
        HashMapProcessor hash = new HashMapProcessor(a);

        Thread t1 = new Thread(hash, "t1");
        Thread t2 = new Thread(hash, "t2");
        Thread t3 = new Thread(hash, "t3");

        long start = System.currentTimeMillis();
        // start all the thread
        t1.start();
        t2.start();
        t3.start();

        // wait for threads to finish
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Time take = " + (System.currentTimeMillis() - start));

        // check the shared variable value now
        System.out.println(Arrays.asList(hash.getArray()));
    }
}

class HashMapProcessor implements Runnable {

    private String[] array = null;

    public HashMapProcessor(String[] a) {
        this.array = a;
    }

    public String[] getArray() {
        return this.array;
    }

    @Override
    public void run() {
        processArray(Thread.currentThread().getName());
    }

    private void processArray(String name) {
        for (int i = 0; i < this.array.length; i++) {
            // process data and append thread name
            processSomething(i);
            addThreadName(i, name);
        }
    }

    private Object obj = new Object();

    private void addThreadName(int i, String name) {
        synchronized (obj) {
            this.array[i] = this.array[i] + ":" + name;
        }
    }

    public void processSomething(int index) {
        // processing some job
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


