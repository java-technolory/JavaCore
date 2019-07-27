package mta.edu.vn.threads.runtimeclass;

public class ShutdownHook {
    public static void main(String[] args) throws InterruptedException {
        Runtime r = Runtime.getRuntime();

        r.addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("shutdown hook task completed...");
            }
        });

        System.out.println("Now main sleeping ... press ctr+c to exit");
        Thread.sleep(3000);
    }
}
