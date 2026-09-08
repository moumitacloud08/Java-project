package org.java.version.jdk14;

/**
 * 
 * The main benefit of a record is 
 * that it removes a lot of boilerplate code
 * when your class is mainly used to hold data.
 * Record components are final
 * person.age = 40; X
 * 
 */
public class RecordExample {

	record Person(String name, int age) {

	}

	public static void main(String[] args) {
		Person person = new Person("Moumita", 35);
		
		System.out.println(person.name());
		System.out.println(person.age());
		System.out.println(person);

	}

}
