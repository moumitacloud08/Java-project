package org.leetcode.stack.excercise3;

/**
 * Reverse a String
 */
public class Main {

	static <T> String reverseString(String str) {
		Stack<Character> stack = new Stack<>();
		String rev = "";

		if (!str.isEmpty() && !str.isBlank()) {
			int count = 0;
			while (count < str.length()) {
				stack.push(str.charAt(count));
				count++;
			}

			while (!stack.isEmpty()) {
				Character ch = stack.pop();
				rev = rev + ch;
			}
		}
		

		return rev;

	}

	public static void main(String[] args) {
		// Explain purpose
		System.out.println("These tests confirm reverseString works");
		System.out.println("for normal words, empty strings,");
		System.out.println("single characters, palindromes, and");
		System.out.println("strings with spaces and symbols.");
		System.out.println();

		// Test 1: Normal word
		System.out.println("Test 1: Normal Word");
		System.out.println("Input: 'hello'");
		System.out.println("Expected: 'olleh'");
		System.out.println("Actual: '" + reverseString("hello") + "'");
		System.out.println();

		// Test 2: Empty string
		System.out.println("Test 2: Empty String");
		System.out.println("Input: ''");
		System.out.println("Expected: ''");
		System.out.println("Actual: '" + reverseString("") + "'");
		System.out.println();

		// Test 3: Single character
		System.out.println("Test 3: Single Character");
		System.out.println("Input: 'A'");
		System.out.println("Expected: 'A'");
		System.out.println("Actual: '" + reverseString("A") + "'");
		System.out.println();

		// Test 4: Palindrome
		System.out.println("Test 4: Palindrome");
		System.out.println("Input: 'madam'");
		System.out.println("Expected: 'madam'");
		System.out.println("Actual: '" + reverseString("madam") + "'");
		System.out.println();

		// Test 5: Spaces and symbols
		System.out.println("Test 5: Spaces and Symbols");
		System.out.println("Input: 'abc !'");
		System.out.println("Expected: '! cba'");
		System.out.println("Actual: '" + reverseString("abc !") + "'");
		System.out.println();

		/*
		 * EXPECTED OUTPUT: ---------------- These tests confirm reverseString works for
		 * normal words, empty strings, single characters, palindromes, and strings with
		 * spaces and symbols.
		 * 
		 * Test 1: Normal Word Input: 'hello' Expected: 'olleh' Actual: 'olleh'
		 * 
		 * Test 2: Empty String Input: '' Expected: '' Actual: ''
		 * 
		 * Test 3: Single Character Input: 'A' Expected: 'A' Actual: 'A'
		 * 
		 * Test 4: Palindrome Input: 'madam' Expected: 'madam' Actual: 'madam'
		 * 
		 * Test 5: Spaces and Symbols Input: 'abc !' Expected: '! cba' Actual: '! cba'
		 */
	}

}
