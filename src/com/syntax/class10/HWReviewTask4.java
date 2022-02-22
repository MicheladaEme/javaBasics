package com.syntax.class10;

public class HWReviewTask4 {

	public static void main(String[] args) {
		
		//From an array of integer elements find the largest number.
		
		int[] number= {15, 45, 10, 32};
		
		int largest = number[0];
		
		for(int n=0; n<number.length; n++) {
			if(number[n]>largest){
				largest=number[n];
			}
		}
		
		System.out.println(largest);

	}

}
