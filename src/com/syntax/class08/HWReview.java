package com.syntax.class08;

import java.util.Scanner;

public class HWReview {

	public static void main(String[] args) {
		/*Ask a user to enter name, last name and age 5 times. 
		 * Every time your program should print those values in a format "You name is _ _ and you are _ years old"
		 */
		Scanner scan=new Scanner(System.in);
			
		for(int i=1; i<=5; i++) {
			System.out.println("Please enter your name");
			String name=scan.nextLine();
			
			System.out.println("Please enter your last name");
			String lName=scan.nextLine();
			
			System.out.println("Please enter your age");
			int age=scan.nextInt();
			
			scan.nextLine();
			
			System.out.println("your name is "+name+" "+lName+" and you are "+age+" years old.");
		}

	}

}
