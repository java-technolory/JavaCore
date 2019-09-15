package mta.edu.vn.threads.synchronization;

class Student {
    void printStudent(int n) {
        synchronized (this) {   //synchronized block
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

class MyThread01 extends Thread {
    Student s = new Student();

    MyThread01(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        this.s.printStudent(5);
    }
}

class MyThread02 extends Thread {
    Student s = new Student();

    MyThread02(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        this.s.printStudent(100);
    }
}

public class TestSynchronizedBlock1 {
    public static void main(String[] args) {
        Student student = new Student();    // only one object

        MyThread01 t1 = new MyThread01(student);
        MyThread02 t2 = new MyThread02(student);

        t1.start();
        t2.start();
    }
}
