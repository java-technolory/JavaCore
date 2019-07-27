package mta.edu.vn.threads.threadpool;

import java.util.concurrent.*;

public class WorkerPool {

    public static void main(String[] args) throws InterruptedException {
        // RejectedExecutionHandler implementation
        RejectedExecutionHandlerImpl rejectiondHandler = new RejectedExecutionHandlerImpl();

        // Get the ThreadFactory implementation to use
        ThreadFactory threadFactory = Executors.defaultThreadFactory();

        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), threadFactory, rejectiondHandler);

        // Start the monitoring thread
        MyMonitorThread monitor = new MyMonitorThread(executorPool, 3);

        Thread monitorThread = new Thread(monitor);
        monitorThread.start();

        // Submit work to the thread pool
        for (int i = 0; i < 10; i++) {
            executorPool.execute(new WorkerThread("cmd " + i));
        }

        Thread.sleep(3000);

        // Shutdown the thread
        executorPool.shutdown();

        // Shutdown the monitor thread
        Thread.sleep(5000);
        monitor.shutdown();
    }
}
