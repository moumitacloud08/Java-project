package org.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.interview.model.Employee;

public class MultipleProgram_01 {
	

	public static void main(String[] args) {
		MultipleProgram_01 program = new MultipleProgram_01();

		System.out.println("Find Even Numbers");
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
		program.findEvenNumbers(numbers);
		
		System.out.println("\nFind Duplicate Elements");
		List<Integer> list1 = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);
		program.findDuplicateElement(list1);
		
		System.out.println("\nFind Duplicate Elements Using Set");
		program.findDuplicateElementUsingSet(list1);

		System.out.println("\nCount Occurrence of Each Character");
		String str = "programming";
		program.characterCount(str);
		
		System.out.println("\nFind Frequency of Numbers");
        List<Integer> list2 = Arrays.asList(1,2,2,3,3,3,4);
		program.findFreqOfNumbers(list2);
		
		System.out.println("\nFind First Non-repeatable character");
		String input = "aabbcdeff";
		program.findFirstNonRepeatingChar(input);
		
		System.out.println("\nFind the longest string");
		  List<String> words =
	                Arrays.asList("Java","SpringBoot","Microservices","API");
		program.findLongestString(words);;
		
		System.out.println("\nSum of all numbers");
        List<Integer> list = Arrays.asList(10,20,30,40);
		program.sumOfAllNumbers(list);
		
		System.out.println("\nGroup employees by department");
        List<Employee> list3 = Arrays.asList(
                new Employee("John","IT"),
                new Employee("David","HR"),
                new Employee("Alex","IT")
        );
        program.groupByDepartment(list3);
        
        System.out.println("\nFind Duplicate chars in a string");
        program.findDuplicateChars(input);
        
        
        System.out.println("\nFind the longest string");
        List<String> strings = Arrays.asList("Java", "Python",  "C++","Kotlin");
        program.findAllLongestString(strings);



	}

	void findEvenNumbers(List<Integer> numbers) {
		numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
	}

	void findDuplicateElement(List<Integer> list) {
		Set<Integer> duplicates = list
		.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(i -> i.getValue() >1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toSet());
		System.out.println(duplicates);

	}
	void findDuplicateElementUsingSet(List<Integer> list) {
		Set<Integer> seen = new HashSet<Integer>();
		Set<Integer> duplicates = list.stream().filter(n -> !seen.add(n)).collect(Collectors.toSet());
		System.out.println(duplicates);
	}

	void characterCount(String str) {
		Map<Character, Long> charCount = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
	}

	void findFreqOfNumbers(List<Integer> list) {
		Map<Integer,Long> numCount=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(numCount);
	
	}
	
	void findFirstNonRepeatingChar(String input) {
		Character result = input
		 .chars()  //produces 97 98 99..
		 .mapToObj(c -> (char)c) //Type:Stream<Character>
		 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()))
		 .entrySet() //(a,2) (b,2) Type:Set<Map.Entry<Character, Long>>
		 .stream()
		 .filter(n -> n.getValue() == 1)  // (c,1) (d,1)
		 .map(Map.Entry::getKey)  // c  d  e
		 .findFirst()  //Type:Optional<Character>
		 .orElse(null); 
		
		System.out.println(result);
	}
	
	void findLongestString(List<String> words) {
		String longest = words.stream()
		.max(Comparator.comparingInt(String::length))
		.orElse(null);
		System.out.println(longest);
	}
	
	void sumOfAllNumbers(List<Integer> list) {
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
	
	void groupByDepartment(List<Employee> list) {
		Map<String,List<Employee>> map =list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(map);
	
	}
	
	void findDuplicateChars(String input) {
		Set<Character> chars = input
		.chars()
		.mapToObj(c ->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(n -> n.getValue() >1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toSet());
		System.out.println(chars);
		
	}
	
	void findAllLongestString(List<String> strings) {
		int maxLength = strings.stream().mapToInt(String::length).max().orElse(0);
		List<String> longest = strings.stream().filter(n -> n.length() == maxLength).collect(Collectors.toList());
		System.out.println(longest);
	}
	
	
	
//	Find duplicate elements.
//	Find duplicate characters in a string.
//	First non-repeated character.
//	Second highest/lowest number.
//	Find maximum/minimum element.
//	Sort employees by salary or name.
//	Group employees by department.
//	Count frequency of words/characters.
//	Remove duplicates using distinct().
//	Convert List to Map.
//	Partition even and odd numbers.
//	Sum and average of numbers.
//	Find common elements between two lists.
//	Flatten nested lists using flatMap().
//	Use Optional to avoid NullPointerException.
	
	
	 
	
	
}