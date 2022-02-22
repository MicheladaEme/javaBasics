package com.syntax.groupproject02;

public class CodingTasks03 {

	public static void main(String[] args) {
		
		//Create a 2D array or integer type where you will store odd and even numbers. 
		//Develop a program which will identify/print the even numbers only.
		
		int[][]numbers={{1,3,5,7,9},{2,4,6,8,10}};
		
		for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[i].length; j++) {
				
				if(numbers[i][j]%2==0) {
					System.out.println(numbers[i][j]);
				}
			}
		}
	}

}
