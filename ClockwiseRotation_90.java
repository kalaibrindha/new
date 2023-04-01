package com.newWorkouts;

import java.util.Arrays;

public class ClockwiseRotation_90 {

	public static void main(String[] args) {

	//	int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 },};
//
//		
		int a[][] = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 }};

		//};
		print(a);

		a = transpose(a);
		System.out.println("reverse by column");
		a = reverseByColumn(a);

	}

	private static void print(int[][] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] reverseByColumn(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			int n = a.length - 1;
			for (int j = 0; j < a[0].length / 2; j++) {

				int temp = a[i][j];
				a[i][j] = a[i][n];
				a[i][n] = temp;
				n--;

			}
		}
		print(a);
		return a;
	}

	private static int[][] transpose(int[][] a) {
	
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j <a.length ; j++) {
				if (i != j) {
					int temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				}
			}
			
		}
		System.out.println("transpose");
		print(a);

		return a;
	}

}
