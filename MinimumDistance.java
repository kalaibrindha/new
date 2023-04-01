package com.newWorkouts;

public class MinimumDistance {
	/*
	 * N = 4 A[] = {1,2,3,2} x = 1, y = 2 Output: 1 Explanation: x = 1 and y = 2.
	 * There are two distances between x and y, which are 1 and 3 out of which the least is 1.
	 * 
	 *  Example 2: Input: N = 7 A[] = {86,39,90,67,84,66,62} x = 42, y =12
	 *  Output: -1 Explanation: x = 42 and y = 12. W e return -1 as x and y don't
	 * exist in the array.
	 */
	public static void main(String[] args) {

//		int a[] = { 1, 2, 3, 2 };
//		int x = 1;
//		int y = 2;
//		int a[] = {86,39,90,67,84,66,62}; 
//		int x = 42;int  y = 12;
//	int	a[] = {1, 2};int x = 1; int y = 2;
//		int a[] = { 3, 4, 5 };
//		int x = 3;
//		int y = 5;
//		int a[] = { 3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3 };
//		int x = 3, y = 6;
		int a[] = { 2, 5, 3, 5, 4, 4, 2, 3 };
		int x = 3, y = 2;
		int result = minDistance(a, x, y);
		System.out.println("result  :   " + result);
		result = minDistance_2(a, x, y);// best method
		System.out.println("result  :   " + result);
	}

	private static int minDistance_2(int[] a, int x, int y) {
		// single loop // * assign the index as -1
		int index1 = -1, index2 = -1, smallestDistance = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				index1 = i;
			else if (a[i] == y)
				index2 = i;
			if (index1 != -1 && index2 != -1) {
				if (smallestDistance > Math.abs((index1 - index2))) {
					smallestDistance = Math.abs(index1 - index2);
				}
				// System.out.println(smallestDistance);
			}
		}
		if (index1 == -1 || index2 == -1)
			return -1;
		return smallestDistance;
	}

	private static int minDistance(int[] a, int x, int y) {
		int shortestDistance = Integer.MAX_VALUE;
		int distance = 0;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (x == a[i]) {
				for (int j = 0; j < a.length; j++) {
					if (a[j] == y) {
						distance = Math.abs(i - j);
						if (distance < shortestDistance) {
							shortestDistance = distance;
							flag = true;
						}

					}
				}
			}

		}
		if (flag)
			return shortestDistance;

		return -1;

	}

}
