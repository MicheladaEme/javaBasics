package com.syntax.groupproject02;

public class CodingTasks09 {

	public static void main(String[] args) {
		
		//Write a java program to find the second largest number in the array?
		//need to adjust code

		int[] number= {15, 45, 10, 32};
		
		int largest =0;
		int second=0;
		
		for(int n=0; n<number.length; n++) {
			if(number[n]>largest){
				second=largest;
				largest=number[n];
			} for(int j=0; j<number.length; j++) {
				if (number[j]>second) {	
					if(largest==number[j]) {
	                   continue;
					} second=number[j];
				}
			}
		} System.out.println(second);
				
	}

}
