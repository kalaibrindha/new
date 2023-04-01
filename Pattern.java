package com.newWorkouts;
/*
  
 * 1. To find the print the pattern:Ip: n=5
Op:
1
1 1
2 1
1 2 1 1
1 1 1 2 2 1
 */

public class Pattern {

	public static void main(String[] args) {
		String a = "kalai";
		a = a + "avani";
		System.out.println(a);
		String str = "";
		for (int i = 1; i <= 6; i++) {
			if (i == 1) {
				str = "1";

			} else
				str = StringPattern(str);
			System.out.println(str);
		}

	}

	private static String StringPattern(String str) {
		// System.out.println(" str " + str);
		String s = "";
		char ch;
		int count = 0;
		int j = 0;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			count = 0;
			String temp = "";
			for (j = i; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				} else {
					break;
				}
			}
			s = s + "" + count + "" + str.charAt(i);
			i = j - 1;

		}
		// System.out.println(" s "+s);
		return s;
	}

}
