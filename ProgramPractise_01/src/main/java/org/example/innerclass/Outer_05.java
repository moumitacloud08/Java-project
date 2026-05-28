package org.example.innerclass;

/**
 * static nested class
 */
public class Outer_05 {
     static class Inner_05{
        public void m1(){
            System.out.println("Static Nested class method");
        }
    }
    public static void main(String[] args){

          // new Outer_05().new Inner_05().m1(); // if inner class not static
          // new Outer_05.Inner_05().m1(); // if inner class static
           Inner_05 i = new Inner_05(); // if inner class static
           i.m1();

    }
}
