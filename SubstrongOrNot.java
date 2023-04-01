package com.newWorkouts;

import java.util.Scanner;

/*
 * nput: s = GeeksForGeeks, 
 * x = Fr 
 * Output: -1 
 * Explanation: Fr is not present in the string GeeksForGeeks as substring.
 * Input: s = GeeksForGeeks, x = For 
 * Output: 5 
 * Explanation: For is present as substring in GeeksForGeeks from index 5 (0 based indexing).
 */
public class SubstrongOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter string");
		String input = sc.next();
		System.out.println(" enter sub string to be found");
		String substringInput = sc.next();
		int index = isSubString(input, substringInput);
		System.out.println("index  :   " + index);

		index = method2(substringInput, input);
		System.out.println("index  :   " + index);

	}

	private static int method2(String substringInput, String input) {
		int x = input.length();
		int y = substringInput.length();

		if (x < y)// dubstring lebgth should alwys lwss than input string
		{
			return -1;
		}

		for (int i = 0; i <= x - y/* (x-y)geeksfor(7),for(3)--->(7-3)=5 enough to interate */ ; i++) {
			int j;
			for (j = 0; j < y; j++) {
				if (substringInput.charAt(j) != input.charAt(i + j))
					break;
			}
			if (j == y)// j length==substtimg length
				return i;

		}
		return -1;
	}

	private static int isSubString(String input, String substringInput) {
		if (input.length() < substringInput.length())
			return -1;
		int index = 0;

		boolean flag = false;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == substringInput.charAt(0)) {
				// System.out.println("coming");
				index = i + 1;
				flag = true;
				for (int j = 1; j < substringInput.length(); j++) {
					if (substringInput.charAt(j) == input.charAt(index)) {
						flag = true;

					} else {
						flag = false;
						break;
					}
					// System.out.println(input.charAt(index) + " " + substringInput.charAt(j));
					index++;
				}
			}
			if (flag) {
				return i;
			}
		}

		return -1;
	}

}
