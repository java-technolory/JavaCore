package mta.edu.vn.threads.deamon;

public class DeamonThread extends Thread {

    @Override
    public void run() {
        int count = 0;

        // Vòng lặp vô tận
        while (true) {
            System.out.println("+ Hello from Deamon Thread " + (count++));
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        System.out.println("Name: " + Thread.currentThread().getName());
//        System.out.println("Deamon: " + Thread.currentThread().isDaemon());
    }

/*    public static void main(String[] args) {
        DeamonThread d1 = new DeamonThread();
        d1.setName("Thread1");

        DeamonThread d2 = new DeamonThread();
        d2.setName("Thread2");

        d1.setDaemon(true);
        d1.start();
        d2.start();
    }*/
}
