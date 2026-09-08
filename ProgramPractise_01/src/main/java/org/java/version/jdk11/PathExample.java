package org.java.version.jdk11;

import java.nio.file.Path;

/**
 * Converts the relative path into an absolute path
 */
public class PathExample {
    public static void main(String[] args){
        Path path = Path.of("data","file.txt");
        System.out.println(path.toAbsolutePath());
    }
}
