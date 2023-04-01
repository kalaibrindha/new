package com.newWorkouts;

import java.util.Scanner;

//10.48-10.54
/*
 * p       m
 *  r     a
 *   o   r
 *    g
 *   o  r  
 *  r    a   
 * p      m   
 *     
 */
public class Progarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string   :  ");
		// String input=sc.next();
		String input = "geeks";
		printString(input);

	}

	private static void printString(String input) {

		for (int i = 0; i < input.length(); i++) {

			for (int j = 0; j < input.length(); j++) {
				if (i == j || input.length() - 1 - i == j) {
					System.out.print(input.charAt(j));
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
