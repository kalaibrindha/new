package com.newWorkouts;

import java.util.Scanner;

/*
 * Input:   str = “a,b$c”
Output:  str = “c,b$a”
Input:   str = “Ab,c,de!$”
Output:  str = “ed,c,bA!$”
 */
public class ReverseStringWithoutAffectingSymbols {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = "a@b";// "a$"; //"$";//"Ab,c,de!$";//"a,b$c";

		revreseString(a);

	}

	private static void revreseString(String a) {
		char array[] = a.toCharArray();
		if (a.length() == 1) {
			System.out.println(a);
			return;
		}

		int start = 0, end = a.length() - 1;

		while (start < end) {
			boolean startflag = false, endflag = false;
			if ((array[start] >= 'a' && array[start] <= 'z') || (array[start] >= 'A' && array[start] <= 'Z')) {
				startflag = true;
			} else {
				start++;
			}

			if ((array[end] >= 'a' && array[end] <= 'z') || (array[end] >= 'A' && array[end] <= 'Z')) {
				endflag = true;
			} else {
				end--;
			}
			if (startflag && endflag) {
				char temp = array[start];
				array[start] = array[end];
				array[end] = temp;
				start++;
				end--;
			}

		}
		String result = String.valueOf(array);
		System.out.println("result " + result);

	}

}
