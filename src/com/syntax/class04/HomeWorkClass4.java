package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkClass4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//Part 1
		System.out.println("How much is your loan");
		int loanAmount=input.nextInt();
		if(loanAmount<=200000) {
			System.out.println("You are eligable for the loan");
		} else {
			System.out.println("You have been rejected for the loan");
		}
		//Part 2
		System.out.println("How old are you?");
		int age=input.nextInt();
		if(age>=18) {
			System.out.println("Issue a Drivers License");
		} else {
			System.out.println("Offer a Learners permit");
		}
		//Part 3
		System.out.println("Input City");
		String city=input.next();
		System.out.println("Input Temperature");
		int temperature=input.nextInt();
		 temperature=((temperature-32)*5/9);
		System.out.println("The temperature of the city "+city+" is "+temperature);
		//Part 4
	     System.out.println("Do you have a credit card?");
	     String creditCard=input.next();
	     if(creditCard.equalsIgnoreCase("Yes")) {
	    	 System.out.println("What is the balance?");
	    	 int balance=input.nextInt();
	    	 if(balance>1000) {
	    		 System.out.println("Pay off this balance immediately!");
	    	 } else {
	    		 System.out.println("You may spend more");
	    	 }
	     } else {
	    	 System.out.println("Would you like to open a Credit Card?");
	     }
	     //Task 5
	     System.out.println("How many years have you worked?");
	     int years=input.nextInt();
	     System.out.println("What is your annual salary?");
	     int salary=input.nextInt();
	     if(years>=5) {
	    	 System.out.println("You are eligable for a bonus");
	    	 if(salary>50000) {
	    		 System.out.println("Bonus=5000");
	    	 } else {
	    		 System.out.println("Bonus=3000");
	    	 }
	     } else {
	    	 System.out.println("You are not eligable for a bonus");
	     }
	}

}
