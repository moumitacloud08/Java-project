package org.java.version.jdk14;

/**
 * Standard Feature
 */
public class SwitchExample {

    public static void main(String[] args) {

        int day = 2;

        int result = switch (day) {
            case 1 -> 100;
            case 2 -> 200;
            case 3 -> 300;
            default -> 0;
        };

        System.out.println("Result: " + result);
    }
}