package com.newWorkouts;

import java.util.Scanner;

/*
 *        1     A
	      26     Z
	      27     AA
	     728    aaz

 * 
 * 
 */
public class NumberToAlphabets {

	public static void main(String[] args) {
		// System.out.println("enter romans");
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();//
		char alpahets[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int value = 0;
		int place = 1;
		int sum = 0;
		for (int i = a.length() - 1; i >= 0; i--) {

			for (int j = 0; j < alpahets.length; j++) {
				// System.out.println(a.charAt(i)+" "+alpahets[j]);
				if (alpahets[j] == a.charAt(i)) {
					sum = (j + 1) * place + sum;
					// System.out.println(sum);
					break;
				}
			}
			place = place * 26;

		}
		System.out.println("value of  roamns " + a + "  is : " + sum);
		System.out.println("enter number");
		int num = sc.nextInt();
		excelNumberToAlphabets(num, alpahets);
	}

	private static void excelNumberToAlphabets(int num, char[] alpahets) {
		String ans = "";
		while (num > 0) {
			int rem = (num - 1) % 26;
			ans = ans + alpahets[rem];
			num = (num - 1) / 26;
		}
		System.out.println(reverse(ans));
	}

	private static String reverse(String ans) {
		String val = "";
		for (int i = ans.length() - 1; i >= 0; i--) {
			val += ans.charAt(i);

		}
		return val;
	}

}
