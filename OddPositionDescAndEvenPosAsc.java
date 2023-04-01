package com.newWorkouts;

import java.util.Arrays;

/*11.39--12.00
 * 3. Write a program to sort the elements in odd positions in descending order and elements in ascending order
Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1 
 */
public class OddPositionDescAndEvenPosAsc {

	public static void main(String[] args) {

	//	int a[] = { 13, 2, 4, 15, 12, 10, 5 };
		int a[] = { 1,2,3,4,5,6,7,8,9 };
	//	int a[]= {7, 1, 2, 3, 4, 5, 6};
		
		method_2(a);
		
		
		
		
		System.out.println(" odd positions ");
		int oddArray[] = GetEvenArray(a, a.length / 2);
		System.out.println("even posiitons ");
		int evenArray[] = GetOddArray(a, a.length - a.length / 2);
		oddArray = SortArray(oddArray);
		evenArray = SortArray(evenArray);
		int resultantArray[] = new int[a.length];
		int start = 0;
		int end = evenArray.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				resultantArray[i] = evenArray[end];
				end--;
			} else {
				resultantArray[i] = oddArray[start];
				start++;
			}
		//	System.out.println(Arrays.toString(resultantArray));
		}
		System.out.println("RESULT ");
		System.out.println(Arrays.toString(resultantArray));

	}

	private static void method_2(int[] a) {
		/*//wrong not suitable for all inputs
		 * 1 | 2 |3 |4 |  5|  6 | 7(
		 * 13| 2 |4 |15|12 |  10|5
		 * 1.change the odd positions num negative
		 * -13 | 2|-4|15|-12|10|-5|
		 * 2.sort ascendingly
		 * -13|-12|-5|-4|2|20|15
		 * 
		 */
		
	}

	private static int[] SortArray(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		return a;
	}

	private static int[] GetOddArray(int[] a, int n) {
		int array[] = new int[n];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0)
				array[index++] = a[i];
		}
		System.out.println(Arrays.toString(array));
		return array;

	}

	private static int[] GetEvenArray(int[] a, int n) {
		int array[] = new int[n];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0)
				array[index++] = a[i];
		}
		System.out.println(Arrays.toString(array));
		return array;
	}

}
