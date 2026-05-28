package org.example.innerclass;

/**
 * Normal Inner Class
 */
public class Outer_01 {
    int x =10;
    static int y =20;
    class Inner_01{
        public void m1(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    public static void main(String[] args){
        new Outer_01().new Inner_01().m1();

    }
}
