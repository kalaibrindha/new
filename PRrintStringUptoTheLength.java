package com.newWorkouts;

public class PRrintStringUptoTheLength {

	public static void main(String[] args) {
		String a = "abc";
		int n = 10;

		int length = 10 / a.length();
		int rem = 10 % a.length();
		System.out.println(length+ " "+rem );
		String result = "";
		while (length > 0) {
			result = result + a;
			length--;
		}
		for (int i = 0; i < rem; i++) {
			result = result + a.charAt(i);
		}
		System.out.println(result+"   "+result.length());
	}

}
