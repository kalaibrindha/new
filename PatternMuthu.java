package com.newWorkouts;

/*
 *                             4 4 4 4 4 4 4  
                            4 3 3 3 3 3 4   
                            4 3 2 2 2 3 4   
                            4 3 2 1 2 3 4   
                            4 3 2 2 2 3 4   
                            4 3 3 3 3 3 4   
                            4 4 4 4 4 4 4   
 */
public class PatternMuthu {

	public static void main(String[] args) {
		int n = 4;
		int size = 4 * 2 - 1;
		int result[][] = new int[size][size];
		int start = 0, end = size - 1;
		while(n!=0)
		{
		for (int i = start; i <=end; i++) {
			for (int j = start; j <=end; j++) {
				if(i==start|| j==start||i==end||j==end)
				{
					result[i][j]=n;
				}

			}
			
		}
		start++;end--;
		n--;
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
