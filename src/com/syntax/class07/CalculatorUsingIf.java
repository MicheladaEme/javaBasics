package com.syntax.class07;

import java.util.Scanner;

public class CalculatorUsingIf {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Pleas enter first number");
		int num1=input.nextInt();
		System.out.println("Please enter second number");
		int num2=input.nextInt();
		System.out.println("What is the operator");
		char operator=input.next().charAt(0);
		int results=0;
		
		switch (operator) {
		case '+':
			results=num1+num2;
			break;
		case '-':
			results=num1-num2;
			break;
		case '*':
			results=num1*num2;
			break;
		case '/':
			results=num1/num2;
			break;
			default:
				System.out.println("Invalid Operator");
		}
		
		System.out.println("Please enter your first value.");
		int val1=input.nextInt();
		System.out.println("Please enter desired operation:+,-,*,/");
		char op=input.next().charAt(0);
		System.out.println("Please enter your second value.");
		int val2=input.nextInt();
		
		int result=0;
		if (op =='+') {
			result=val1+val2;
		} else if (op =='-') {
			result=val1-val2;
		} else if (op == '*') {
			result=val1*val2;
		} else if (op =='/') {
			result=val1/val2;
		} else {
			System.out.println("Invalid entry.");
		}
		System.out.println(result);

	}

}
