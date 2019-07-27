package mta.edu.vn.threads.wait_notify;

public class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount){
        System.out.println("going to withdraw ...");
        if(this.amount < amount){
            System.out.println("Less balance; waiting for deposit ...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed ...");
    }

    synchronized void deposit(int amount){
        System.out.println("going to deposit");
        this.amount += amount;
        System.out.println("deposit completed ...");
        notify();
    }

    public static void main(String[] args) {
        final Customer c = new Customer();

        new Thread(){
            @Override
            public void run() {
                c.withdraw(15000);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                c.deposit(10000);
            }
        }.start();

    }

}
