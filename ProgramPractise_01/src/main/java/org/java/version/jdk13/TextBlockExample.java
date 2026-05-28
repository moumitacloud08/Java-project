package org.java.version.jdk13;

/**
 * Before Java 13
 * String json = "{\n" +
 *               "  \"name\": \"John\",\n" +
 *               "  \"age\": 30\n" +
 *               "}";
 */
public class TextBlockExample {
    public static void main(String[] args){
        String json= """
                 {
                     "name":"John",
                     "age":30
                 } 
                 """;
        System.out.println(json);
    }
//javac --enable-preview --release 13 TextBlockExample.java
//java --enable-preview TextBlockExample
}
