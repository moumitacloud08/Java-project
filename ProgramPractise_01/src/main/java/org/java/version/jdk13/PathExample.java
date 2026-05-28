package org.java.version.jdk13;

import java.nio.file.Path;

public class PathExample {
    public static void main(String[] args){
        Path path = Path.of("data","file.txt");
        System.out.println(path.toAbsolutePath());
    }
}
