package mta.edu.vn.threads.synchronization;

class Table {
    void printTable(int n){ // method not synchronized
        for (int i = 1; i <= 5; i++){
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread{
    Table t;

    MyThread1(Table t){
        this.t = t;
    }

    @Override
    public void run(){
        this.t.printTable(5);
    }
}

class MyThread2 extends Thread{
    Table t;

    MyThread2(Table t){
        this.t = t;
    }
    @Override
    public void run() {
        this.t.printTable(100);
    }
}

public class TestNonSynchronizationMethod {
    public static void main(String[] args) {
        Table t = new Table();

        MyThread1 t1 = new MyThread1(t);
        MyThread2 t2 = new MyThread2(t);

        t1.start();
        t2.start();
    }
}
