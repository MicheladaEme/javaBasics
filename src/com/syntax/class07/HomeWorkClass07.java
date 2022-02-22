package com.syntax.class07;

import java.util.Scanner;

public class HomeWorkClass07 {

	public static void main(String[] args) {
		//Part 1 
		/*Declare a variable to store a price for a coffee. 
		 * Ask user to pay for a coffee. Keep asking to pay for coffee until user enters exact amount. 
		 * If user give more than $3 --> ask them to give less, if user gives less money then ask to give more. 
		 * Once user got a write amount print “Please enjoy your candy”
		 */
		int coffeePrice=3;
		Scanner scan=new Scanner(System.in);
        int coffee;
        System.out.println("Please pay for your coffee");
		do {
			coffee=scan.nextInt();
			if(coffee<3) {
				System.out.println("Please give more");
			} else if (coffee>3) {
				System.out.println("Please give less");
			}
		} while (coffee!=coffeePrice);
		System.out.println("Please enjoy your coffee");
		//Part 2
		/*Ask a user to enter name, last name and age 5 times. 
		 * Every time your program should print those values in a format "You name is _ _ and you are _ years old"
		 */
		System.out.println("Please enter first name, last name, and age");
		String firstName=scan.next();
		String lastName=scan.next();
		int age=scan.nextInt();
		int num=6;
		
		while(num<=10) {
			System.out.println("Your name is "+firstName+" "+lastName+" and you are "+age+" years old"); 
			num++;
		}
		

	}

}
