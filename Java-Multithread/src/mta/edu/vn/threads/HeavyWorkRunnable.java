package mta.edu.vn.threads;

public class HeavyWorkRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Doing heavy processing -  START " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);

            //Get database connection, delete unused data from DB
            doDBProcessing();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing heavy processing - END " + Thread.currentThread().getName());
    }


    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new HeavyWorkRunnable(),"t1");
        Thread t2 = new Thread(new HeavyWorkRunnable(),"t2");
        Thread t3 = new Thread(new HeavyWorkRunnable(),"t3");
        Thread t4 = new Thread(new HeavyWorkRunnable(),"t4");
        Thread t5 = new Thread(new HeavyWorkRunnable(),"t5");
        Thread t6 = new Thread(new HeavyWorkRunnable(),"t6");
        Thread t7 = new Thread(new HeavyWorkRunnable(),"t7");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

    }
}
