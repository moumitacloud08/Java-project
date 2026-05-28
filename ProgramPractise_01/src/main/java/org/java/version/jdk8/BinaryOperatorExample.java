package org.java.version.jdk8;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args){
        BinaryOperator<Integer> add =(a,b) -> a+b;
        System.out.println(add.apply(34,30));
    }
}
