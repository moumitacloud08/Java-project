package org.java.version.jdk11;

import java.util.function.BiFunction;

public class VarInLambda {

    protected  void example(){
        BiFunction<Integer,Integer,Integer> add =  (var a,var b) -> a+b;
        System.out.println(add.apply(5,10));
    }
}
