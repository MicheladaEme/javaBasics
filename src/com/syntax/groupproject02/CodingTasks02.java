package com.syntax.groupproject02;

public class CodingTasks02 {

	public static void main(String[] args) {
		
		//Create a 2D array of integer values. Print the sum of all numbers.
		
			int[][]numbers={{5,10,15,20},{2,4,6,8,10},{1,3,6,12}};
			
			int sum=0;
			
			for(int i=0; i<numbers.length; i++) {
				
				for(int j=0; j<numbers[i].length; j++) {
					
					sum+=(numbers[i][j]);
				}
			}
			System.out.println(sum);
	}

}
