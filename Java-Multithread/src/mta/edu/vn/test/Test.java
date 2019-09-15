package mta.edu.vn.test;

public class Test extends Thread implements Runnable {

    public void msg(){
        System.out.println("Hello Lambda Expresstion");

    }

    public static void main(String[] args) {

    }

    public static void main() {
        Thread t1 = new Thread(new Test());
        Thread t2 = new Thread(new Test());
        Thread t3 = new Thread(new Test());
        Thread t4 = new Thread(new Test());
        Thread t5 = new Thread(new Test());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        Test test1 = new Test();
        test1.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World" + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End :: " + Thread.currentThread().getName());
        }
    }
}
