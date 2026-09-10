package org.java.version.jdk17.nonsealed;

public class NonSealedExample {

	public static void main(String[] args) {
		Shape shape = new Triangle();
		System.out.println(shape.name());

	}

}
