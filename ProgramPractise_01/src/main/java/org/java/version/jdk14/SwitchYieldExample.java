package org.java.version.jdk14;

/**
 * yield returns a value from a switch block.
 */
public class SwitchYieldExample {
	public static void main(String[] args) {
		int day = 2;

		int result = switch (day) {
		case 1 -> 100;
		case 2 -> {
			System.out.println("Tuesday");
			yield 200;
		}
		case 3 -> 300;
		default -> 0;
		};

		System.out.println("Result: " + result);
	}

}
