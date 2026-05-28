package org.example.thread.interthreadcommunication.producer_consumer.case2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

class SharedBuffer {
    private static final Logger logger = LogManager.getLogger(SharedBuffer.class);
    private List<Integer> buffer = new ArrayList<>();
    private final int capacity = 5;

    public synchronized void producer() throws InterruptedException {
        //Joshau Bloch's approach - spuriously (without a real notify)
        while (buffer.size() == capacity) {
            logger.info("Buffer full, producer waiting ...");
            wait();
        }

        logger.info("Adding items with the producer...");
        for (int i = 0; i < capacity; i++) {
            buffer.add(i);
            logger.info("Added value: " + i);
        }
        //wake up consumer
        notify();
    }

    public synchronized void consumer() throws InterruptedException {
        while (buffer.size() < capacity) {
            logger.info("Buffer not full yet, consumer waiting ...");
            wait();
        }
        while (!buffer.isEmpty()) {
            int item = buffer.removeFirst();
            logger.info("Consumer removes: {}", item);
            Thread.sleep(300);
        }
        notify();

    }

    //1 Thread: keeps inserting items into the buffer
    //2 Thread: keeps removing the items



}

class Consumer implements Runnable {
    private SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            while(true){
                this.sharedBuffer.consumer();
                Thread.sleep(300);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


class Producer implements Runnable {
    private SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            while(true){
                this.sharedBuffer.producer();
                Thread.sleep(300);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class App {
    public static void main(String[] args) {
        var sharedBuffer = new SharedBuffer();

        Thread t1 = new Thread(new Consumer(sharedBuffer));
        Thread t2 = new Thread(new Producer(sharedBuffer));

        t1.start();
        t2.start();
    }
}
