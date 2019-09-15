package mta.edu.vn.threads.synchronization;

public class Test implements Runnable{

    public int tong;

    public Test(){
        this.tong = 1000;
    }

    public synchronized void rutTien() throws InterruptedException {
        if(tong > 0){
            Thread.sleep(1000);
            tong = tong - 1000;
            System.out.println(tong);
        } else {
            System.out.println("khong con tien");
        }
    }

    @Override
    public void run() {
        try {
            rutTien();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Test test1 = new Test();

        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test1);

        t1.start();
        t2.start();
    }
}
