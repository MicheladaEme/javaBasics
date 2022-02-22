package com.syntax.class04;
/*
 * to auto import in windows: ctrl+shift+o
 */
import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		
		//1.create a scanner and assign to a variable
		Scanner scan=new Scanner(System.in);
		
		//2.specify instructions
		System.out.println("Please enter country where you are from");
		
		//3.we need to capture String value--> use next();
		String country=scan.next();
		System.out.println("You are from "+country);
		
		//if you are from Mexico -->you speak Spanish
		// if you are from France-->you speak french
		
		if(country.equalsIgnoreCase("Mexico")) {
			System.out.println("You speak Spanish");
			
		} else if(country.equalsIgnoreCase("USA")) {
			System.out.println("You speak English");
			
		} else if(country.equalsIgnoreCase("France")) {
		System.out.println("You speak French");
		
		}else {
			System.out.println("I do not know which language you speak");
		}
	}

}
