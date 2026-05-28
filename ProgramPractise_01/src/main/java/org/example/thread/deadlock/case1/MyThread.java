package org.example.thread.deadlock.case1;

public class MyThread extends Thread{
    A a = new A();
    B b = new B();

    public void m1(){
        this.start();
        a.d1(b);  //This line executed by Main Thread
    }
    public void run(){
        b.d2(a);  //This line executed by Child Thread
    }

    // We can access instance variable a and b from inside main so we created m1()
    public  static void main(String[] args){
        MyThread t = new MyThread();
        t.m1();

    }
}
