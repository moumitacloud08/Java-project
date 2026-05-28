package org.java.version.jdk12;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The teeing() collector allows you to process a stream with two different collectors at the same time, and then merge their results using a BiFunction.
 */
public class TeeingExample {
    public static void main(String[] args){
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        var result = numbers.stream().collect(
                Collectors.teeing(
                        Collectors.summingInt(i -> i),
                        Collectors.averagingInt(i -> i),
                        (sum, avg) -> "Sum: " + sum + ", Average: " + avg
                ));
        System.out.println(result);

    }
}
