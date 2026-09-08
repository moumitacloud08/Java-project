package org.java.version.jdk14;

/**
 * The Old way
 * if (obj instanceof String) {
 *  String str = (String) obj;
 *  System.out.println(str.length());
 * }  
 * JDK 14 lets you combine the check + cast + variable declaration
 * obj instanceof String str
 * 
 */
public class InstanceofExample {
	public static void main(String[] main) {
		Object obj = "Hello Java";
		if (obj instanceof String str) {

			System.out.println("It is a String");
			System.out.println("Length: " + str.length());

		}
	}

}
