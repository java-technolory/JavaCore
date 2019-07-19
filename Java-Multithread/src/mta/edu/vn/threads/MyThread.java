package mta.edu.vn.threads;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("MyThread - START : " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            // Get database connect, delete unused data from DB
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread - END : " + Thread.currentThread().getName());
    }

    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("th001");
        MyThread myThread2 = new MyThread("th002");
        MyThread myThread3 = new MyThread("th003");
        MyThread myThread4 = new MyThread("th004");
        MyThread myThread5 = new MyThread("th005");
        MyThread myThread6 = new MyThread("th006");
        MyThread myThread7 = new MyThread("th007");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        myThread6.start();
        myThread7.start();
    }
}
