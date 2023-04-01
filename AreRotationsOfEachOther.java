package com.newWorkouts;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * t: geeksforgeeks forgeeksgeeks Output: 1
 *  Explanation: s1 is geeksforgeeks, s2 is forgeeksgeeks.
 Clearly, s2 is a rotated version of s1 as s2 can be obtained by left-rotating s1 by 5 units.
 
Example 2:
Input: mightandmagic andmagicmigth 
Output: 0 
Explanation: Here with any amount of rotation s2 can't be obtained by s1.


test case kalai ,kalai
test case kalaikalaivanivani  kalaivanivanikalai
 */
class Rotation {

	private String s1;
	private String s2;

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	@Override
	public String toString() {
		return "input values [s1=" + s1 + ", s2=" + s2 + "]";
	}

}

public class AreRotationsOfEachOther {

	private static String String;

	public static void main(String[] args) {

		 getInput();//correct
		method(2);// cirrect
		// getInput();

	}

	private static void method(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter s1 :");
		String s1 = sc.next();
		System.out.println(" enter s2 :");
		String s2 = sc.next();

		// first collect the index which are same
		ArrayList<Integer> index = new ArrayList<Integer>();
		char ch = s1.charAt(0);
		for (int i1 = 0; i1 < s2.length(); i1++) {
			if (ch == s2.charAt(i1)) {
				index.add(i1);
			}
		}

		for (int k = 0; k < index.size(); k++) {
			boolean check = IsRotation(s1, s2, index.get(k), s1.length());
			if (check) {
				System.out.println(" 1");
				break;
			} else {
				System.out.println(" 0");
			}

		}

	}

	private static boolean IsRotation(java.lang.String s1, java.lang.String s2, Integer index, int size) {

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt((index + i) % size)) {
				return false;
			}

		}
		return true;
	}

	private static void getInput() {
		Scanner sc = new Scanner(System.in);
		Rotation rotation = new Rotation();
		System.out.println(" enter s1 :");
		String s1 = sc.next();
		System.out.println(" enter s2 :");
		String s2 = sc.next();
		rotation.setS1(s1);
		rotation.setS2(s2);
		System.out.println(rotation.toString());
		int result = isRotating(rotation);
		System.out.println(result);

	}

	private static int isRotating(Rotation rotation) {

		String s1 = rotation.getS1().toLowerCase();
		String s2 = rotation.getS2().toLowerCase();

		if (s1 == null || s2 == null || s1.length() != s2.length())
			return 0;

		char ch = s2.charAt(0);
		boolean flag = false;
		int j = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (ch == s1.charAt(i)) {
				int index = i;
				for (j = 0; j <= s2.length() - 1; j++, index++) {

					if (s1.charAt(index) != s2.charAt(j)) {
						// System.out.println(s1.charAt(index) + " " + s2.charAt(j) + index + " " + j);
						flag = false;
						break;
					}

					if ( index == s1.length() - 1) {
						// System.out.println(s1.charAt(index) + " " + s2.charAt(j) + index + " " + j);

						index = -1;
						flag = true;
					}

				}
				if ( j == s2.length()) {
					return 0;
				}
			}

		}

		if (!flag)
			return 0;
		else {
			return 1;
		}
	}

}
