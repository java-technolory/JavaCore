package mta.edu.vn.threads.lock;

public class ObjectLock implements Runnable {

    @Override
    public void run() {
        lock();
    }

    public void lock() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName());

            System.out.println("in lock " + Thread.currentThread().getName());

            System.out.println("in lock " + Thread.currentThread().getName() + " end");
        }
    }

    public static void main(String[] args) {
        ObjectLock obj = new ObjectLock();

        Thread t1 = new Thread(obj);

        Thread t2 = new Thread(obj);

        ObjectLock lock = new ObjectLock();

        Thread t3 = new Thread(lock);


        t1.setName("Thread1");
        t2.setName("Thread2");
//        t3.setName("Thread3");

        t1.start();
        t2.start();
//        t3.start();

    }
}
