package mta.edu.vn.threads.deamon;

public class NonDeamonThread extends Thread {

    @Override
    public void run() {

        int i = 0;

        // Vòng lặp 10 lần, Luồng này sẽ kết thúc
        while(i < 10){
            System.out.println(" - Hello from Non Deamon Thread " + (i++));
            try {
                // Ngủ 1 giây
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Ghi ra thông báo Thread này kết thúc
        System.out.println("\n None Deamon Thread ending\n");
    }

}
