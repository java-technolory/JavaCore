package mta.edu.vn.threads.deamon;

public class Test {
    public static void main(String[] args) {
        System.out.println("===> Main Thread running...\n");
        // Tao mot thread
        Thread deamonThread = new DeamonThread();

        // Xét nó là Deamon Thread
        deamonThread.setDaemon(true);
        deamonThread.start();

        // Tạo một Thread khác
        new NonDeamonThread().start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Ghi ra thông báo luồng main này kết thúc
        System.out.println("\n===> Main Thread ended.\n");

    }
}
