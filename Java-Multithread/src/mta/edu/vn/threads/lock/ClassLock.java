package mta.edu.vn.threads.lock;

public class ClassLock implements Runnable{

    @Override
    public void run() {
        lock();
    }

    public synchronized void lock(){
        synchronized (ClassLock.class){
            System.out.println(Thread.currentThread().getName());
            System.out.println("in block " + Thread.currentThread().getName());
            System.out.println("in block " + Thread.currentThread().getName()+" end");
        }
    }


    public static void main(String[] args) {
        ClassLock lock = new ClassLock();

        Thread t1 = new Thread(lock);
        t1.setName("t1");

        Thread t2 = new Thread(lock);
        t2.setName("t2");

        ClassLock classLock = new ClassLock();

        t1.start();
        t2.start();
    }
}
