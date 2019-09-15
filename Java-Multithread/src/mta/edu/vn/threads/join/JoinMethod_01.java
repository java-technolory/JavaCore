package mta.edu.vn.threads.join;

public class JoinMethod_01 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        JoinMethod_01 t1 = new JoinMethod_01();
        t1.setName("Thread1");

        JoinMethod_01 t2 = new JoinMethod_01();
        t2.setName("Thread2");

        JoinMethod_01 t3 = new JoinMethod_01();
        t3.setName("Thread3");

        JoinMethod_01 t4 = new JoinMethod_01();
        t4.setName("Thread4");

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        t3.start();
        t4.start();
    }

}
