package mta.edu.vn.examination;

public class WorkerThread implements  Runnable{
    private String msg;

    public WorkerThread(String msg){
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Command = " + msg);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.");
    }

    public void processCommand(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
