package org.java.version.jdk13;

public class SwitchExpressionExample {
    public static void main(String[] args){
        int day =3;
        String result = switch(day) {
          case 1,2,3,4 -> "Weekday";
          case 6,7 -> "Weekend";
          default -> "Unknown";
        };
        System.out.println(result);
    }
}
