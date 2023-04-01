package com.newWorkouts;

public class A1b10c12 {
	/*
	 * 10.45==11.05 a1b22c3=abbccc
	 * 
	 * q1b12c13==>qbbbbbbbbbbbbbbbccccccccccccccc
	 * 
	 * 
	 */
	public static void main(String[] args) {

		// numconversion();
		String a = "a1b22c13";
		int num = 0;
		String result = "";
		for (int i = 0; i < a.length(); i++) {
			int index = i - 1;
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				if (a.charAt(i + 1) >= '0' && a.charAt(i + 1) <= '9') {
					String numberString = (a.charAt(i)) + "" + (a.charAt(i + 1));
					// System.out.println(numberString);
					num = numconversion(numberString);
					numberString = "";
					i = i + 2;
				} else {
					num = a.charAt(i) - '0';
				}
				result = resultedString(index, num, result, a);
			}
		}
		System.out.println(" result :  " + result);
	}

	private static String resultedString(int index, int num, String result, String a) {

		for (int i = 0; i < num; i++) {
			result = result + a.charAt(index);
		}

		return result;
	}

	private static int numconversion(String num) {
		// num = "13";
		int i = num.length() - 1;
		int sum = 0;
		int places = 1;
		while (i >= 0) {
			int n = num.charAt(i) - '0';
			sum = n * places + sum;
			// System.out.println(sum);
			i--;
			places = places * 10;
		}
		System.out.println(sum);
		return sum;

	}

}
