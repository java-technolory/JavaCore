package mta.edu.vn.threads.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5); // creating a pool of 5 threads
        ExecutorService executorService = Executors.newFixedThreadPool(7);

        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);   // calling execute method of ExecutorService
//            executorService.execute(worker);
        }
        executor.shutdown();
//        executorService.shutdown();
        while (!executor.isTerminated()){

        }
        System.out.println("Finished all threads");
    }

}
