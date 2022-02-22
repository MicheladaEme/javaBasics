package com.syntax.groupproject02;

import java.util.Scanner;

public class CodingTasks01 {

	public static void main(String[] args) {
		
		//Create an array on int values using a scanner and calculate the sum of all stored elements in that array.
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 4 numbers");
		int k=input.nextInt();
		int y=input.nextInt();
		int t=input.nextInt();
		int p=input.nextInt();
		int[] numbers= {k, y, t, p};
		int sum=0;
		
		for(int num:numbers) {
			sum+=num;
		} System.out.println(sum);
		
		
		 

	}

}
