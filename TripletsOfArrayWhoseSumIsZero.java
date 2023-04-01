package com.newWorkouts;

import java.util.ArrayList;
import java.util.Arrays;

/*
  Input: arr[] = {0, -1, 2, -3, 1}
Output: (0 -1 1), (2 -3 1)
Explanation: The triplets with zero sum are 0 + -1 + 1 = 0 and 2 + -3 + 1 = 0  
Input: arr[] = {1, -2, 1, 0, 5}
Output: 1 -2  1
Explanation: The triplets with zero sum is 1 + -2 + 1 = 0   
 */
/*
 * LOGIC: 1.sort
 *        2. 
 * 
 * 
 * 
 */
class A {
	int arr[];
	ArrayList<Integer> triplets;

	A(int arr[]) {
		this.arr = arr;
		arr = quickSort(arr, 0, arr.length - 1);
	}

	private int[] quickSort(int[] a, int low, int high) {
		if (low > high) {
			return a;
		}

		int start = low;
		int end = high;
		int mid = (start + end) / 2;
		int pivot = a[mid];

		while (start <= end) {
			while (a[start] < pivot) {
				start++;
			}
			while (a[end] > pivot) {
				end--;
			}
			if (start <= end) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
		}
		quickSort(a, low, end);
		quickSort(a, start, high);
		return a;
	}

}

public class TripletsOfArrayWhoseSumIsZero {

	public static void main(String[] args) {
		// int arr[] = { 0, -1, 2, -3, 1 };
		int arr[] = { 1, -2, 1, 0, 5 };
		A a = new A(arr);
		

		tripletes(a.arr);
	}

	private static void tripletes(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			int x = a[i];
			int start = i + 1;
			int end = a.length - 1;
			while (start < end) {
				if (x + a[start] + a[end] == 0) {
					System.out.println(x + "  " + a[start] + "  " + a[end]);
					start++;
					end--;
				} else if (x + a[start] + a[end] < 0) {
					start++;
				} else {
					end--;
				}

			}

		}

	}

}
