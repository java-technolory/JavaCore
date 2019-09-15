package mta.edu.vn.threads.synchronization;

class Employee {
    synchronized void printEmployee(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * n);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread1 extends Thread {

    Employee e;

    Thread1(Employee e) {
        this.e = e;
    }

    @Override
    public void run() {
        this.e.printEmployee(5);
    }

}

class Thread2 extends Thread {

    Employee e;

    Thread2(Employee e) {
        this.e = e;
    }

    @Override
    public void run() {
        this.e.printEmployee(100);
    }

}

public class TestSynchronizationMethod {

    public static void main(String[] args) {

        Employee employee = new Employee();

        Thread1 t1 = new Thread1(employee);
        Thread2 t2 = new Thread2(employee);

        t1.start();
        t2.start();

    }
}
