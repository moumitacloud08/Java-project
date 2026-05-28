package org.example.innerclass;

/**
 * Normal Inner class
 */
public class Outer_02 {
    int x =10;
    class Inner_02{
        int x =100;
        public void m1(){
            int x =1000;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Outer_02.this.x);
        }
    }
    public  static void main(String[] args){
        new Outer_02().new Inner_02().m1();
    }
}
