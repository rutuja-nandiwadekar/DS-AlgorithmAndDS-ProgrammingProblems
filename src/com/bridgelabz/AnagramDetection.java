/*
 *Ability to find One string is an anagram of another if the second is simply 
 *Rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
 */
package com.bridgelabz;

import java.util.Arrays;

public class AnagramDetection {
	// Declaration of variables
	static String str1 = "Heart";
	static String str2 = "earth";

	// main method
	public static void main(String[] args) {

		// Function Call
		if (checkAnagrams(str1, str2))
			System.out.println("The two strings are anagram of each other");
		else
			System.out.println("The two strings are not anagram of each other");
	}

	/*
	 * @purpose: Ability to find One string is an anagram of another
	 * 
	 * @param: str1, str2
	 * 
	 * @function : to check equality of two string
	 * 
	 * @return: returns true if the two arrays are equal
	 */
	private static boolean checkAnagrams(String str1, String str2) {
		// Converts all of the characters in this String to lowercase
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		// Converts strings to a new character array.
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		// Sort both arrays
		Arrays.sort(array1);
		Arrays.sort(array2);
		// check equality of 2 arrays
		boolean result = Arrays.equals(array1, array2);

		if (result) {
			return true;
		} else {
			return false;
		}
	}
}
