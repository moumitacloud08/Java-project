package org.java.version.jdk11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileStringExample {

    protected  void example() throws IOException {
        Path path = Path.of("example.txt");
        Files.writeString(path, "Java 11 rocks!");

        String content = Files.readString(path);
        System.out.println(content);
    }
}
