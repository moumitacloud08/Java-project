package org.example.innerclass;

/**
 * Method local Inner class
 * If M1() declared as static then
 * we can't access variable x
 * It will show below error
 * Non-static field 'x' cannot be referenced from a static context
 */
public class Outer_03 {
    int x = 10;
    static int y =20;
    public  void m1(){
        class Inner_03{
            public void m2(){
                System.out.println(x);
                System.out.println(y);
            }
        }
        Inner_03 i = new Inner_03();
        i.m2();
    }

    public static void main(String[] args){
        Outer_03 outer = new Outer_03();
        outer.m1();
    }
}
