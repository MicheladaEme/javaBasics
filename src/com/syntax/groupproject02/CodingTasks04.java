package com.syntax.groupproject02;

public class CodingTasks04 {

	public static void main(String[] args) {
		
		//Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.
		
		int[][]numbers={{1,3,5,7,9},{2,4,6,8,10}};
		
		int sumEven=0;
		int sumOdd=0;
		
			for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[i].length; j++) {
				
				if(numbers[i][j]%2==0) {
					sumEven+=(numbers[i][j]);
				} else {
					sumOdd+=(numbers[i][j]);
				}
			}
		}
			
			System.out.println("The sum of all even numbers in the numbers array is = "+sumEven);
			System.out.println("The sum of all odd numbers in the numbers array is = "+sumOdd);

	}

}
