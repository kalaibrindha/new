package com.newWorkouts;

/*
 * Input: s1=”expErIence”, s2=”En”
output: s1=”exprIece”

 */
public class RemoveCharFromString {

	public static void main(String[] args) {
//		String a = "expErIence";
//		String b = "exprIece";
//		String a = "kalai";
//		String b = "Kalai";
//		String a = "123";
//		String b = "Kalai";
		String a = "occurence";
		String b = "car";

		String result = removeSameCharacters(a, b);
		a=result;
		System.out.println(a);

	}

	private static String removeSameCharacters(String a, String b) {
		if (a.equals(b) || b.length() == 0)// empty string and same string
		{
			return a;
		}
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != '*') {
				for (int j = 0; j < b1.length; j++) {
					if (a1[i] == b1[j]) {
						a1[i] = '*';
						break;
					}
				}
			}
		}
		String result = remainingCharacters(a1);
		return result;
	}

	private static String remainingCharacters(char[] a1) {
		String result = "";
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != '*')
				result = result + a1[i];
		}
		return result;
	}

}
