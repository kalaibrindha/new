package com.newWorkouts;

import java.util.Arrays;

/*
 * 
 * Question 3: Given a array with n elements print the number of occurrences of that 
 * number each number in that array. The order of number doesn’t matter. You can reorder the elements.
Example : [2,1,3,2,2,5,8,9,8]
Output:
2-3
1-1
3-1
5-1
8-2
9-1
 */
public class FrequencyOccurances {

	public static void main(String[] args) {

		int a[] = { 2, 1, 3, 2, 2, 5, 8, 9, 8, 9 };

		a = sort(a);
		printAccordingToFrequencies(a);

	}

	private static void printAccordingToFrequencies(int[] a) {
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				System.out.println(a[i] + "-->" + count);
				break;
			}
			if (i + 1 <= a.length && a[i] != a[i + 1]) {
				System.out.println(a[i] + "-->" + count);
				count = 0;
			}
			count++;
		}

	}

	private static int[] sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		return a;
	}

}
