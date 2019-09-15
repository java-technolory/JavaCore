package mta.edu.vn.threads.synchronization;

class People {
    void printPeople(int n) {
        synchronized (People.class) {
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


public class TestSynchronizedBlock2 {
    public static void main(String[] args) {
        People p = new People();    // only one object

        Thread t1 = new Thread(){
            @Override
            public void run() {
                p.printPeople(5);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                p.printPeople(100);
            }
        };

        t1.start();
        t2.start();
    }
}
