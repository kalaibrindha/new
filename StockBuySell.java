package com.newWorkouts;

/*
 * 
 * 1    
26   
3710  
481113 
59121415


 N = 7 A[] = {100,180,260,310,40,535,695} Output: (0 3) (4 6)
  Explanation: One possible solution is (0 3) (4 6) 
  We can buy stock on day 0, and sell it on 3rd day, 
  which will give us maximum profit. Now, we buy stock on day 4 and sell it on day 6.
Example 2:


Input: N = 5 A[] = {4,2,2,2,4} Output: (3 4)
 Explanation: There are multiple possible solutions. 
 one of them is (3 4)We can buy stock on day 3, and sell it on 4th day, 
 which will give us maximum profit.
 */
public class StockBuySell {

	public static void main(String[] args) {
		// int a[] = { 100, 180, 260, 310, 40, 535, 695 };
		int a[] = { 23, 13, 15, 29, 33, 19, 34, 45, 65, 67 };
		// int a[] = { 4, 2, 2, 2, 4 };
		stockMarket(a);
		pattern();

	}

	private static void pattern() {
		int i, j, k = 1;
		int m[][] = new int[5][5];
		for (i = 0; i < 5; i++) {
			for (j = i; j <= 4; j++)
				m[j][i] = k++;
		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println();

		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (m[i][j] == 0)
					System.out.print(" ");
				else
					System.out.print(m[i][j]);
			}
			System.out.println();
		}

	}

	private static void stockMarket(int[] a) {
		int start = 0;
		int j = 0;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			start = a[i];

			for (j = i + 1; j < a.length; j++) {
				if (start < a[j] && j < a.length) {
					start = a[j];
					flag = true;
				} else {
					break;
				}

			}
			if (flag == true || j == a.length) {
				System.out.println(i + "  " + (j - 1));
				i = j - 1;
			}

		}
		// System.out.println(i + " " + (j - 1));

	}

}
