package mta.edu.vn.threads.scheduler;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheuledThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        //schedule to run after sometime
        System.out.println("Current Time = " + new Date());
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            WorkerThread workerThread = new WorkerThread("do heavy processing");
            scheduledExecutorService.schedule(workerThread,10, TimeUnit.SECONDS);
            Thread.sleep(30000);
            scheduledExecutorService.shutdown();
        }

        while (!scheduledExecutorService.isTerminated()){

        }
        System.out.println("Finished all threas");
    }
}
