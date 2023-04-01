package com.newWorkouts;

public class LongestSubStringWithDistinctChatacters {

	public static void main(String[] args) {

		String a = "aaa";// "kalai"; //"geeksforgeeks";
		int count = 1;
		int longestSubString_length = 0;
		int startIndex = 0;
		int end_index = 0;

		for (int i = 1; i < a.length(); i++) {
			boolean check = isRepeated(startIndex, a, i);
			if (check) {
				count++;
			} else {
				if(longestSubString_length<count)
				{
				longestSubString_length=count;
				
				}
				
				count = 1;
				startIndex=i;
			}
			System.out.println(longestSubString_length+"   "+count+"   "+i);
		}

		System.out.println(longestSubString_length);

	}

	

		
}
