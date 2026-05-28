package org.java.version.jdk8;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapExample1 {
    public static void main(String[] args) {
        List<String> colors = List.of("Red", "Blue");
        List<String> sizes = List.of("S", "M");

        List<String> combinations = colors.stream()
                .flatMap(c -> sizes.stream().map(s -> c+"-"+s))
                .collect(Collectors.toList());

        System.out.println(combinations);
    }
}
