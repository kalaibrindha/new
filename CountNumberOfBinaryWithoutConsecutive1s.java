package com.newWorkouts;

/*
 * 
 * Given a positive integer N, count all possible distinct binary strings of length N such that there are no consecutive 1’s.
Examples: 
Input:  N = 2
Output: 3
// The 3 strings are 00, 01, 10

Input: N = 3
Output: 5
// The 5 strings are 000, 001, 010, 100, 101

 */
public class CountNumberOfBinaryWithoutConsecutive1s {

	public static void main(String[] args) {
		int n = 4;int temp =0;// same as fibonacci series but start num with a and b with 1
		int a = 1, b = 1;
		for (int i = 1; i <=n; i++) {
			temp= a + b;
			a = b;
			b = temp;
		   
		}
		 System.out.println(temp);
	}

}
