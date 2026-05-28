package org.example.thread.multithreadenhancement.threadgroup;

public class ThreadGroupDemo {

    public static void main(String[] args){
        ThreadGroup group = new ThreadGroup("MyThreadGroup");

        MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(group,runnable,"Thread-1");
        Thread t2 = new Thread(group,runnable,"Thread-2");
        Thread t3 = new Thread(group,runnable,"Thread-3");

        //t1.start();
       // t2.start();
       // t3.start();

       // System.out.println("Thread group name: "+group.getName());
       // group.list();

        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       System.out.println("All threads have finished");
    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+ " is running.");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(Thread.currentThread().getName()+" was interrupted.");
            }
        }
    }
}
