package com.newWorkouts;

import java.util.Scanner;

/*10.57-11.08
 * Given two sorted arrays, merge them such that the elements are not repeated
Eg 1: Input:
        Array 1: 2,4,5,6,7,9,10,13
        Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
 */
public class SortArrayWIthoutDuplicates {

	public static void main(String[] args) {

//		System.out.println(" array 1 elemnts");
//		int[] arr1 = getArrayInputs();
//		displayElemets(arr1);
//		System.out.println(" array 1 elemnts");
//		int[] arr2 = getArrayInputs();
//		System.out.println("display array 1 anad array 2");
//		displayElemets(arr2);
		// int arr1[]= {2,4,5,6,7,9,10,13};

		int arr2[] = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };
		int arr1[] = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10 };

		sortTwoArray(arr1, arr2);

	}

	private static void sortTwoArray(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
			} else {
				System.out.print(arr2[j] + " ");
				j++;
			}
		}
		while (i < arr1.length) {
			System.out.print(arr1[i] + " ");
			i++;
		}
		while (j < arr2.length) {
			System.out.print(arr2[j] + " ");
			j++;
		}

	}

	private static void displayElemets(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "    ");
		}

	}

	private static int[] getArrayInputs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size  ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter elments");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		return a;
		
	}

}
