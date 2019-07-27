package mta.edu.vn.threads.callable;

import java.util.concurrent.*;

public class MyCallableExample01 implements Callable<String> {
    private long waitTime;

    public MyCallableExample01(long waitTime){
        this.waitTime = waitTime;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        MyCallableExample01 callable1 = new MyCallableExample01(1000);
        MyCallableExample01 callable2 = new MyCallableExample01(2000);

        FutureTask<String> futureTask1 = new FutureTask<>(callable1);
        FutureTask<String> futureTask2 = new FutureTask<>(callable2);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(futureTask1);
        executorService.execute(futureTask2);

        while (true){
            if(futureTask1.isDone() && futureTask2.isDone()){
                System.out.println("Done");
                //shutdown executor or service
                executorService.shutdown();
                return;
            }
            if(!futureTask1.isDone()){
                // wait indefinitely for future task to complee
                System.out.println("FutureTask1 output = " + futureTask1.get());
                System.out.println("Wait for FutureTask2 to complete");
                String s = futureTask2.get(200L,TimeUnit.SECONDS);
                if(s != null){
                    System.out.println("FutureTask2 output = " + s);
                }
            }
        }

    }
}
