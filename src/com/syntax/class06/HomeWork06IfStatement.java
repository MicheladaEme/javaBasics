package com.syntax.class06;

import java.util.Scanner;

public class HomeWork06IfStatement {

	public static void main(String[] args) {
		// Task 1 (if Statement version)
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade=input.next().charAt(0);
		if (grade=='A') {
			System.out.println("Excellent");
		} else if (grade=='B') {
			System.out.println("Good");
		} else if (grade=='C') {
			System.out.println("Average");
		} else if (grade=='D') {
			System.out.println("Bad");
		} else {
			System.out.println("Terrible");
		}
		//Task 2 (if Statement version)
		System.out.println("Enter the first number");
        int num1=input.nextInt();
        System.out.println("Enter the second number");
        int num2=input.nextInt();
        System.out.println("Enter one of the following operators: *, +, -, /");
        char operator=input.next().charAt(0);
        if (operator=='*') {
        	System.out.println(num1*num2);
        } else if (operator=='+') {
        	System.out.println(num1+num2);
        } else if (operator=='-') {
        	System.out.println(num1-num2);
        } else {
        	System.out.println(num1/num2);
        }

	}

}
