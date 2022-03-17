/*
 *Program for permutations of a String 
 *Write static functions to return all permutations of a String using iterative method and
Recursion method.
 */
package com.bridgelabz;

public class Permutations {
	public static void main(String args[]) {
		permutation("abc");
	}

	// Recursive method
	public static void permutation(String input) {
		permutation("", input);
	}

	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.err.println(perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}
}
