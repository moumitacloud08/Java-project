package org.java.version.jdk8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample2 {
    public static void main(String[] args) throws IOException {

        Path path1 = Path.of("a.txt");
        Files.writeString(path1, "Java 11 rocks!");

        Path path2 = Path.of("b.txt");
        Files.writeString(path2, "Hello World!");

        List<Path> paths = List.of(Path.of("a.txt"),
                Path.of("b.txt")
        );
        List<String> lines = paths.stream()
                .flatMap(path -> {
                    try{
                        return Files.lines(path);
                    }catch(IOException e){
                        return Stream.empty();
                    }
                })
                .collect(Collectors.toList());

        System.out.println(lines);

    }
}
