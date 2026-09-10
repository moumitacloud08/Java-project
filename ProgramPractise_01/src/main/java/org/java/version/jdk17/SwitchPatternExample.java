package org.java.version.jdk17;

public class SwitchPatternExample {
	public static void main(String[] args) {
		Object obj = "Hello Java";

		String result = switch (obj) {
		case Integer i -> "Integer: " + i;
		case String s -> "String: " + s;
		default -> "Unknown type";
		};

		System.out.println(result);
	}
}
