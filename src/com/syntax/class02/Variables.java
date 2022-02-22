package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name="Emely";
		String lastName="Dominguez";	
		char grade='A';
		String city="Chicago";
		String state="Illinois";
		String phoneNumber="123-456-7890";
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in city "+city+" and state "+state);
		System.out.println("And my phone number is "+phoneNumber);
		
		grade='B';
		city="Arlington";
		state="Virginia";
		phoneNumber="098-765-4321";
		
		System.out.println("My name is "+name+" and I moved to new city "+city+" and new state "+state+".");
        System.out.println("My new phone number is "+phoneNumber);
	}

}
