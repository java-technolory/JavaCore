package mta.edu.vn.threads.synchronization;

class Dog {
    static void printDog(int n) {
        synchronized (Dog.class) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class StaticSynchronization02 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                Dog.printDog(1);
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                Dog.printDog(10);
            }
        };

        Thread t3 = new Thread() {
            @Override
            public void run() {
                Dog.printDog(100);
            }
        };

        Thread t4 = new Thread() {
            @Override
            public void run() {
                Dog.printDog(1000);
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
