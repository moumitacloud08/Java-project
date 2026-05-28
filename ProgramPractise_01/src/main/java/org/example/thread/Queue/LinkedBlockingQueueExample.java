package org.example.thread.Queue;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {
    public static void main(String[] args) {
        //LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(5);

        Runnable producer = () -> {

            try {
                int i = 0;
                while (true) {
                    String s = "Item " + i++;
                    queue.put(s);
                    System.out.println("Produced : " + s);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };

        Runnable consumer = () -> {

            try {
                int i = 0;
                while (true) {
                    String s = queue.take();
                    System.out.println("Consumed : " + s);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
