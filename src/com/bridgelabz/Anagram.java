package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String args[]) {
		/*
		 * Used Scanner Class to take the inputs from user
		 */
		Scanner object = new Scanner(System.in);
		System.out.println("Enter the First Latter");
		String word1 = object.nextLine();
		System.out.println("Enter the Second Latter");
		String word2 = object.nextLine();
		/*
		 * Converts Given latter Into Uppar Case.
		 */
		word1 = word1.toUpperCase();
		word2 = word2.toUpperCase();
		if (word1.length() == word2.length()) {
			/*
			 * Stroing the Latters into Array
			 * 
			 */
			char[] arrayWord1 = word1.toCharArray();
			char[] arrayWord2 = word2.toCharArray();
			/*
			 * It Will Sort the Character into Asending order
			 */
			Arrays.sort(arrayWord1);
			Arrays.sort(arrayWord2);

			boolean result = Arrays.equals(arrayWord1, arrayWord2);
			if (result) {
				System.out.println("both are anagram");

			} else {
				System.out.println("both are not anagram");
			}
			;
		}
	}
}
