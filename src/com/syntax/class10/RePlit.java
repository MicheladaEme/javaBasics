package com.syntax.class10;

import java.util.Scanner;

public class RePlit {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			System.out.println(i+" ");
			
			for(int j=1; j<3; j++) {
				System.out.print(j+" ");
			}
		}
		
		int[] numbers={45,78,12,67,55,89,23,77,88};
		
		for(int i=0; i<numbers.length; i++){
		    if(i%2==0){
		      System.out.println(numbers[i]);
		    }
		  }
		
	}

}
