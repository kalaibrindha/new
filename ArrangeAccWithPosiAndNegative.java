package com.newWorkouts;

import java.util.Arrays;

//6.12-6.24
// test case 

/*
 * { 1, 2, 3, 4, 5, -4, -5 };---[1, -4, 2, -5, 3, 4, 5]
 * { 9, 4, -2, -1, 5, 0, -5, -3, 2 };-->[9, -2, 4, -1, 5, -5, 0, -3, 2]
 * pos,neg,pos,neg,pos,neg
 * original array order mara kudathu
 */
public class ArrangeAccWithPosiAndNegative {
	public static void main(String[] args) {
		int a[] = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
		// int a[] = { 1, 2, 3, 4, 5, -4, -5 };
		// a = arrangeInOrders(a);// wrong;
		int postiveCount = countPositiveNumbers(a);
		int posArray[] = new int[postiveCount];
		int negArray[] = new int[a.length - postiveCount];
		posArray = getPositiveElement(a, posArray);
		negArray = getNegativeElemsnts(a, negArray);
		int result[] = new int[a.length];
		result = arrangingElements(posArray, negArray, result);
		System.out.println(Arrays.toString(result));

	}

	private static int[] arrangingElements(int[] posArray, int[] negArray, int[] result) {
		int i = 0, j = 0;
		int index = 0;
		while (index < result.length && i < posArray.length && j < negArray.length) {
			if (index % 2 == 0) {
				result[index++] = posArray[i];
				i++;
			} else {
				result[index++] = negArray[j];
				j++;
			}
		}
		while (i < posArray.length) {
			result[index++] = posArray[i];
			i++;
		}
		while (j < negArray.length) {
			result[index++] = negArray[j];
			j++;
		}
		return result;
	}

	private static int[] getNegativeElemsnts(int[] a, int[] negArray) {
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				negArray[index++] = a[i];
			}
		}
		return negArray;
	}

	private static int[] getPositiveElement(int[] a, int[] posArray) {
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > -1) {
				posArray[index++] = a[i];
			}
		}
		return posArray;
	}

	private static int countPositiveNumbers(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > -1) {
				count++;
			}

		}
		System.out.println("positive num count   " + count);
		return count;
	}

}
