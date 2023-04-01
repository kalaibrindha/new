package com.newWorkouts;

/*10.36--10.44
 * One_Two_Three==>three two one
 * i love india===>india love i
 * malayasia ===>malaysia
 * 
 */
public class One_Two_Three {

	public static void main(String[] args) {
		// String a = "i love india";
		// String a ="one two three";
		String a = "malaya";
		reverseString(a);

	}

	private static void reverseString(String a) {

		int end = a.length();
		int start = 0;
		String result = "";
		for (int i = a.length() - 1; i >= -1; i--) {
			if (i == -1 || a.charAt(i) == ' ') {
				start = i + 1;
				result = stringReverse(start, end, a, result);
				end = i + 1;

			}

		}

	}

	private static String stringReverse(int start, int end, String a, String result) {
		for (int i = start; i < end; i++) {
			result = result + a.charAt(i);
		}
		System.out.println(result);
		return result + " ";

	}

}
