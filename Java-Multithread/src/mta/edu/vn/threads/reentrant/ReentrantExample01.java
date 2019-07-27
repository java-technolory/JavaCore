package mta.edu.vn.threads.reentrant;

public class ReentrantExample01 {
    public  static void m() {
        n();
        System.out.println("This is m() method");
    }

    public  static void n() {
//        m();
        System.out.println("This is n() method");
    }

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                ReentrantExample01.m();
            }
        }.start();
    }
}
