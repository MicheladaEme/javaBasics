package com.syntax.class04;

public class TaskInClass {

	public static void main(String[] args) {
		
		//Task 1
		boolean diploma=true;
		
		if (diploma) { 
			System.out.println("Congratulations!");
			
			double gpa=3.5;
			
			if(gpa>=3.5) {
				System.out.println("you are eligable for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
			} else {
				System.out.println("Please get a degree");
			}
		//Task 2
		double mortgageRate=7;
		int mortgagePrice=70000;
		
		if (mortgageRate>=4.5) {
			System.out.println("Not Buying a House");
		} else {
			System.out.println("You can buy a house");
	
			if (mortgagePrice>50000) {
				System.out.println("You should take a loan");
			} else {
				System.out.println("You can pay cash");
			}
		}
		} 
	} 

