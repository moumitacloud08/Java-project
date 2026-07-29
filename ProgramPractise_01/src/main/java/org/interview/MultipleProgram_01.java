package org.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MultipleProgram_01 {

	public static void main(String[] args) {
		MultipleProgram_01 program = new MultipleProgram_01();

		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
		program.findEvenNumbers(numbers);

		List<Integer> list1 = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);
		program.findDuplicateElement(list1);

		String str = "programming";
		program.characterCount(str);
		
        List<Integer> list2 = Arrays.asList(1,2,2,3,3,3,4);
		program.findFreqOfNumbers(list2);

	}

	void findEvenNumbers(List<Integer> numbers) {
		numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
	}

	void findDuplicateElement(List<Integer> list) {

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
}
