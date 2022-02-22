package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your country of origin");
		String country=input.nextLine();
		String language=null;
		switch (country.toLowerCase()) {
		case "usa":
			language="english";
			break;
		case "russia":
			language="russian";
			break;
		case "germany":
			language="deutsch";
			break;
		case "china":
			language="chinese";
			break;
			default:
			language ="unknown";
		}
		input.close(); //once done with scanner
		System.out.println("In "+country+" people speak "+language);

	}

}
