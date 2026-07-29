package org.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.thread.interthreadcommunication.locking.ClassLocking;

public class MultipleProgram_01 {
	
	private static final Logger logger = LogManager.getLogger(MultipleProgram_01.class);

	public static void main(String[] args) {
		MultipleProgram_01 program = new MultipleProgram_01();

		logger.info("Find Even Numbers");
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
		program.findEvenNumbers(numbers);
		
		logger.info("Find Duplicate Elements");
		List<Integer> list1 = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);
		program.findDuplicateElement(list1);

		logger.info("Count Occurrence of Each Character");
		String str = "programming";
		program.characterCount(str);
		
		logger.info("Find Frequency of Numbers");
        List<Integer> list2 = Arrays.asList(1,2,2,3,3,3,4);
		program.findFreqOfNumbers(list2);
		
		logger.info("Find First Non-repeatable character");
		String input = "aabbcdeff";
		program.FindFirstNonRepeatingChar(input);


	}

	void findEvenNumbers(List<Integer> numbers) {
		numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
	}

	void findDuplicateElement(List<Integer> list) {

	}

	void characterCount(String str) {
		Map<Character, Long> charCount = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		logger.info(charCount);
	}

	void findFreqOfNumbers(List<Integer> list) {
		Map<Integer,Long> numCount=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		logger.info(numCount);
	
	}
	
	void FindFirstNonRepeatingChar(String input) {
		input
		 .chars()  //produces 97 98 99..
		 .mapToObj(c -> (char)c) //Type:Stream<Character>
		 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new ,Collectors.counting()))
		 .entrySet() //(a,2) (b,2) Type:Set<Map.Entry<Character, Long>>
		 .stream()
		 .filter(n -> n.getValue() == 1)  // (c,1) (d,1)
		 .map(Map.Entry::getKey)  // c  d  e
		 .findFirst()  //Type:Optional<Character>
		 .orElse(null);	 
		 
		
	} 
	}