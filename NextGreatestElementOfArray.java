package com.newWorkouts;

public class NextGreatestElementOfArray {
	/*
	 * 3.Find the next greater element for each element in given array. input:
	 * array[]={6, 3, 9, 10, 8, 2, 1, 15, 7}; output: {7, 6, 10, 15, 9, 3, 2, _, 8}
	 */
	public static void main(String[] args) {

		int a[] = { 6, 3, 9, 10, 8, 2, 1, 15, 7 };
		printGreatestElement(a);

	}

	private static void printGreatestElement(int[] a) {
		int value = 0;

		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			int minVlaue = Integer.MAX_VALUE;
			for (int j = 0; j < a.length; j++) {
				if (a[i] != a[j]) {
					if (minVlaue > (a[j] - a[i]) && (a[j] - a[i]) > 0) {
						minVlaue = (a[j] - a[i]);
						value = a[j];
						flag = true;
					}

				}
			}
			if (flag)
				System.out.println(value);
			else
				System.out.println("-");//15 is the grestest element
		}

	}

}
