package org.java.version.jdk17;

public class SealedClassExample {
    public sealed interface Shape permits Circle,Rectangle{}

    public record Circle(double radius) implements Shape{}

    public record Rectangle(double width, double height) implements Shape{}

    public static void main(String[] args){
        Shape shape = new Circle(5);
        if(shape instanceof Circle c){
            System.out.println("Circle area = "+ Math.PI * c.radius * c.radius);
        }
    }
}
