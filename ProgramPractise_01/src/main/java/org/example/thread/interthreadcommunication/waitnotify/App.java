package org.example.thread.interthreadcommunication.waitnotify;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.thread.interthreadcommunication.locking.ClassLocking;

class Process{
    private static final Logger logger = LogManager.getLogger(Process.class);

    public void produce() throws InterruptedException {
        synchronized (this){
            logger.info("Running the produce method....");
            wait();
            logger.info("Again in the produce method...");
        }
    }

    public void consume() throws InterruptedException{
        Thread.sleep(1000);
        synchronized (this){
            logger.info("Running the consume method...");
            notify();
            logger.info("After the notify() method call in the consume method ....");
        }
    }
}

public class App {
    public static void main(String[] args){
        var process = new Process();
        var t1 = new Thread(() ->{
            try {
                process.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        var t2 = new Thread(() ->{
            try {
                process.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}
