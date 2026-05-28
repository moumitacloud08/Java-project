package org.example.thread.interthreadcommunication.locking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObjectLocking {
    private static final Logger logger = LogManager.getLogger(ObjectLocking.class);

    public synchronized void instanceMethod() {
        logger.info(Thread.currentThread().getName() + " entered instanceMethod...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logger.info(Thread.currentThread().getName() + " finished instanceMethod...");
    }


}

class App1 {
    public static void main(String[] args) {
        var obj1 = new ObjectLocking();
        var obj2 = new ObjectLocking();

        Runnable task1 = obj1::instanceMethod;
        Runnable task2 = obj2::instanceMethod;

        new Thread(task1, "First Thread").start();
        new Thread(task2, "Second Thread").start();
    }
}
