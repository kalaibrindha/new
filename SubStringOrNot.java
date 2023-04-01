package com.newWorkouts;

/*Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.
Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1
        
 * 
 * 11.48--11.57
 * 
 */
public class SubStringOrNot {

	public static void main(String[] args) {
		String a = "testString124";
		String b = "est123";

		int index = CheckSubstring(a, b);
		System.out.println(index);

	}

	private static int CheckSubstring(String a, String b) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(0)) {
				int index = i;
				int count = 0;
				boolean flag = true;
				for (int j = 0; j < b.length() && index < a.length(); j++) {
					if (a.charAt(index) != b.charAt(j)) {
						flag = false;
						break;
					} else {
						index++;
						count++;
					}
				}
				if (count == b.length() || flag) {
					return i;
				}
			}
		}
		return -1;
	}

}
