/*
 * Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
*/
package com.bridgelabz;

import java.util.ArrayList;

public class PrimeNumbers {
	static ArrayList<Integer> primeNum = new ArrayList<>();
	// Declaration of variables
	static int i, j, flag;
	static int start = 0, end = 1000;

	// main method
	public static void main(String[] args) {
		isPrime(start, end);
	}

	/*
	 * @purpose: find the Prime numbers in given range
	 * 
	 * @param: start, end
	 * 
	 * @function : check number is prime or not
	 * 
	 * @return: returns flag = 1 means i is prime and flag = 0 means i is not prime
	 */
	private static void isPrime(int start, int end) {
		System.out.println("Prime number between 0 to 1000 are");

		for (i = start; i <= end; i++) {
			if (i == 1 || i == 0)
				continue;

			flag = 1;
			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1)
				primeNum.add(i);
		}
		System.out.println(primeNum);
	}
}