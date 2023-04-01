package com.newWorkouts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LargestSubsequencesEqualToSum {

	public static void main(String[] args) {

		int a[] = { 2, 3, 5, 8, 10 };
		int sum = 10;
		printLargestSequence(a, sum);
	}

	private static void printLargestSequence(int[] a, int totalSum) {

		ArrayList<Integer> element = new ArrayList<Integer>();
		// Map<Integer, ArrayList<Integer>> list = new HashMap<Integer,
		// ArrayList<Integer>>();
		int sum = 0;
		int index = 0;// { 2, 3, 5, 8, 10 };
		for (int i = 0; i < a.length; i++) {
			element.add(a[i]);
			sum = a[i];
			for (int j = 0; j < a.length; j++) {

				if (i != j) {
					sum = sum + a[j];
					if (sum <= totalSum || sum == totalSum) {
						element.add(a[j]);
					}

				}
			}
			boolean check = calculateSum(element, totalSum);
			if (check) {
				System.out.println(element);
			}

			element.clear();
		}

	}

	private static boolean calculateSum(ArrayList<Integer> element, int totalSum) {
		int sum = 0;
		for (int i = 0; i < element.size(); i++) {
			sum = sum + element.get(i);
		}
		if (sum == totalSum)
			return true;
		return false;
	}

}
