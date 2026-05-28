package org.java.version.jdk8;

import java.util.function.BiFunction;

//BiFunction<T, U, R> – two inputs, one output
public class BiFunctionExample {
    public static void main(String[] args){
        BiFunction<Integer,Integer,Integer> multiply = (a,b) -> a * b;
        System.out.println(multiply.apply(6,9));
    }
}
