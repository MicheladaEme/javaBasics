package com.syntax.groupproject02;

import java.util.Scanner;

public class CodingTasks06 {
	
	//Write a java program to check whether a given number is prime or not?

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=input.nextInt();
		
		int num2;
		
		for(int i=2; i<=num/2; i++) {
			num2=num%i;
			if(num2==0) {
				System.out.println(num+" is not a prime number");
				break;
			} else {
				System.out.println(num+" is a prime number");
				break;
			}
		}	
	}

}
