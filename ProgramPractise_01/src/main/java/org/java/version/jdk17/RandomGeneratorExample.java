package org.java.version.jdk17;

import java.util.random.RandomGenerator;

public class RandomGeneratorExample {
    public static void main(String[] args){
        RandomGenerator random = RandomGenerator.getDefault();
        int value = random.nextInt(1,101);
        System.out.println("Random value: "+value);
    }
}
