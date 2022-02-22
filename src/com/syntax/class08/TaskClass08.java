package com.syntax.class08;

import java.util.Scanner;

public class TaskClass08 {

	public static void main(String[] args) {
		
		//Task 1 - Print numbers from 1 to 50 except those that are divisible by 3
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			} 
		}
		/* Task 2
		 * Create a program that will keep asking user to apply for a credit card. 
		 * As soon you get “yes” from a user program should stop asking.
		 */
		Scanner input=new Scanner(System.in);
		String creditCard;
		  do {
			System.out.println("Please apply for a credit card");
				creditCard=input.next();
			} while (creditCard.equalsIgnoreCase("no"));{
	     }


	}

}
