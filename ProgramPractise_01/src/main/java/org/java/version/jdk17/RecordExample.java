package org.java.version.jdk17;

public class RecordExample {
    public record User(String name, int age){}
    public static void main(String[] args) {
        User user = new User("Alice",30);

        System.out.println(user);
        System.out.println(user.name);
        System.out.println(user.age);
    }
}
