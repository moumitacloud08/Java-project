package org.example.innerclass;

/**
 * Method Local Inner Class
 * According to tutorial from local Inner class
 * we can't access local variable
 * of the method in which we declared that inner class
 * But here I see it is running successfully
 */
public class Outer_04 {

    public void m1(){
        int x = 10;
        class  Inner_04{
            public void m2(){
                System.out.println(x);
            }
        }
        Inner_04 i = new Inner_04();
        i.m2();
    }
    public static void main(String[] args){
        Outer_04 outer = new Outer_04();
        outer.m1();
    }


}
