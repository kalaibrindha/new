package com.newWorkouts;

import java.util.Currency;

public class SubArrayEqualToSum {

	public static void main(String[] args) {

		int arr[] = { 11, 9, 8, 7, 13, 5, 17 };
		int required_sum = 25;
		boolean flag = find(arr, required_sum);
		System.out.println(flag);

	}

	private static boolean find(int[] array, int required_sum) {
		int current_sum = array[0];
		int start = 0;
		for (int i = 1; i <= array.length - 1; i++) {
			while (current_sum > required_sum && start < i - 1) {
				current_sum = current_sum - array[start];
				start++;
			}
			if (current_sum == required_sum) {
				System.out.println(start + "  " + (i - 1));
				return true;
			}
			if (i < array.length - 1) {
				current_sum = current_sum + array[i];
			}
		}
		return false;

	}

	

}
