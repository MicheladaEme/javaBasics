package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {
		
		//next() vs nextLine();
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Capturing values using next"); //nextInt(); nextDouble(); nextBoolean(); next().chartAt(0);
		
		String value=scan.next();
		System.out.println(value);
		
		scan.nextLine(); //will resolve skipping
		
		System.out.println("Capturing values using nextLine");
		
		String anotherValue=scan.nextLine();
		System.out.println(anotherValue);
		
		System.out.println("End of the program");

	}

}
