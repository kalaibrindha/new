package com.newWorkouts;

/*
 * : N = 6 Arr[] = {12, 35, 1, 10, 34, 1} 
 * Output: 34
 *  Explanation: The largest element of the array is 35 and the second largest element is 34.
 *  N = 3 Arr[] = {10, 5, 10}
 *   Output: 5 
 *   Explanation: The largest element of the array is 10 and the second largest element is 5.
 */
import java.util.Arrays;

public class Print2ndLargest {

	public static void main(String[] args) {
		// int a[] = { 12, 35,35, 1, 10, 34, 1 };
		//int a[] = { 0, 0, 0, 0 };
		int a[] = { 0 };
		a = Sort(a);
		pick2ndLargestNumber(a);
		method2(a);

	}

	private static void method2(int[] a) {
		int n=a.length;
		int largest=0;
		int secondLargest=0;
		//iitilaizing minimum value for both variable
		largest=secondLargest=Integer.MIN_VALUE;
		System.out.println(largest);
		for(int i=0;i<n;i++)
		largest=(int) Math.max(largest, a[i]);
		//comparing largest variable with values in array a
		// and return the largest value
		for(int i = 0; i < n; i++)
		{
			 if (a[i] != largest)//getting sec largest element
				 secondLargest = Math.max(secondLargest, a[i]);
		}
		//  min value exist -->no gretest element
		//   array element exist ==>answer
		if (secondLargest == Integer.MIN_VALUE)
	        System.out.printf("There is no second " +
	                          "largest element\n");
	    else
	        System.out.printf("The second largest " +
	                          "element is %d\n", secondLargest);
	}

	private static void pick2ndLargestNumber(int[] a) {
		if (a.length < 2)
	    {
	        System.out.printf(" Invalid Input ");
	        return;
	    }
	 
		boolean flag = false;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				System.out.println(a[i + 1]);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("there is no greatest element in array ");
		}

	}

	private static int[] Sort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
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
