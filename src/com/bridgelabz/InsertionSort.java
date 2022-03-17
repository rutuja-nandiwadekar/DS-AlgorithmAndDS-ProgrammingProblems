/*
 * Insertion Sort
 * Reads in strings and prints them in sorted order using insertion sort.
 */
package com.bridgelabz;

public class InsertionSort {
	public static void main(String[] args) {
		String[] a = { "rutu", "hiii", "welcome", "kop", "apple" };
		int n = a.length;
		String sortedArray[] = sort(a, n);
		for (int i = 0; i < sortedArray.length; i++)
			System.out.println("Sorted List : " + a[i]);
	}

	private static String[] sort(String[] a, int n) {
		String temp = " ";
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i].compareToIgnoreCase(a[j]) > 0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
