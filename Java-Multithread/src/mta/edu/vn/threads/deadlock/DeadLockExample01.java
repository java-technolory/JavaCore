package mta.edu.vn.threads.deadlock;

public class DeadLockExample01 {
    public static void main(String[] args) {
        final String result1 = "phan hai";
        final String result2 = "phan mai";

        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (result1){
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

                synchronized (result2){
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        };

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (result2) {
                    System.out.println("Thread 2: locked resource 2");
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (result1){
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        };

        t1.start();
        t2.start();


    }
}
