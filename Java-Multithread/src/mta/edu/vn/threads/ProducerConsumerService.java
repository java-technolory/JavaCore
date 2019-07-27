package mta.edu.vn.threads;

import mta.edu.vn.threads.common.Message;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {
    public static void main(String[] args) {

        // Creating BlockingQueuef size 10
        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        // Starting producer to produce message in queue
        new Thread(producer).start();

        // Starting consumer to consume mesage in queue
        new Thread(consumer).start();

        System.out.println("Producer and Comsumer has been started.");

    }
}
