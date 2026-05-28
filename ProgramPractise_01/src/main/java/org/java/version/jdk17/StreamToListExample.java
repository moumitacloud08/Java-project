package org.java.version.jdk17;

import java.util.List;
import java.util.stream.Stream;

public class StreamToListExample {
    public static void main(String[] args){
        List<Integer> numbers = Stream.of(1,2,3,4)
                .map(n -> n * 2)
                .toList();

        System.out.println(numbers);
    }

}
