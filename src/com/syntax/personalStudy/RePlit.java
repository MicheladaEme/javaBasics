package com.syntax.personalStudy;

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
		//067 Nested For Loops
		for (int y=1; y<=5; y++) {
		      for (int x=1; x<=10; x++) {
		        System.out.print((y*x)+" ");
		      }
		      System.out.println();
		    }
		
		//069 Nested For Loops
		int n=7;
		   for(int i=1; i<=n; i++){
		     int p=1;
		     for(int j=i; j<=n; j++){
		       System.out.print(p++ +" ");
		     }
		     System.out.println();
		   }
		   for(int i=2; i<=n; i++){
		     int p=1;
		     for(int j=1; j<=i; j++){
		       System.out.print(p++ +" ");
		     }
		     System.out.println();
		   }
		
	}

}
