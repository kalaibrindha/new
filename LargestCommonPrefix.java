package com.newWorkouts;

import java.util.Arrays;

public class LargestCommonPrefix {

	public static void main(String[] args) {

		// String words[] = { "geeksforgeeks", "geeks", "geek", "geezer" };
		String words[] = { "appleing", "ape", "april" };
		String commonPrefix = "";
		int minSize = words[0].length();
		int index = 0;
		for (int i = 1; i < words.length; i++) {

			if (minSize > words[i].length()) {
				index = i;
			}
		}
		String comparedWord = words[index];
		System.out.println(comparedWord);
		for (int i = 0; i < comparedWord.length(); i++) {
			boolean flag = true;
			char ch = comparedWord.charAt(i);
			for (int j = 0; j < words.length; j++) {
				if (words[j].charAt(i) != ch) {
					flag = false;
					break;
				}
			}
			if (!flag) {
				System.out.println(commonPrefix);
				break;
			}
			commonPrefix = commonPrefix + ch;
		}
method_2(words);
	}

	private static void method_2(String[] a) {
		int size = a.length;
		 
        /* if size is 0, return empty string */
        if (size == 0)
            return ;
 
        if (size == 1)
            return ;
 
        /* sort the array of strings */
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
 
        /* find the minimum length from first and last string */
        int end = Math.min(a[0].length(), a[size-1].length());
 
        /* find the common prefix between the first and
           last string */
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
            i++;
 
        String pre = a[0].substring(0, i);
        System.out.println(pre);
    
	}

}
