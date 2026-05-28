package org.leetcode.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class TrafficLight {
    private final ReentrantLock lock = new ReentrantLock();
    public TrafficLight() {

    }

    public void carArrived(
            int carId,           // ID of the car
            int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
            int direction,       // Direction of the car
            Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
            Runnable crossCar    // Use crossCar.run() to make car cross the intersection
    ) {
        if(roadId == 1){
            lock.lock();
            if(direction == 1 || direction == 2){
               try{
                   turnGreen.run();
                   crossCar.run();
               } finally {
                   lock.unlock();
               }
            }
        } else if (roadId == 2) {
            lock.lock();
            if(direction == 3 || direction == 4){
                try{
                    turnGreen.run();
                    crossCar.run();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    public static void main(String[] args) {

        Runnable turnGreen1 = () -> {
            System.out.println("Request to turn Light to Green ");
        };

        Runnable crossCar = () -> {
            System.out.println(" Car crossing the intersection");
        };

        Thread car1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
