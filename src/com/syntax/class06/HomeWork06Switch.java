package com.syntax.class06;

import java.util.Scanner;

public class HomeWork06Switch {

	public static void main(String[] args) {
		//Task 1
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade=input.next().charAt(0);
		String performance=null;
		
		switch (grade) {
		case 'A':
			performance="Excellent";
			break;
		case 'B':
			performance="Good";
			break;
		case 'C':
				performance="Average";
				break;
		case 'D':
			performance="Bad";
			break;
		case 'F':
			performance="Terrible";
			break;
		}
		//Task 2
		System.out.println("Enter the first number");
        int num1=input.nextInt();
        System.out.println("Enter the second number");
        int num2=input.nextInt();
        System.out.println("Enter one of the following operators: *, +, -, /");
        char operator=input.next().charAt(0);
        int operation=input.nextInt();
        
        switch (operator) {
        case '*':
			operation=(num1*num2);
			break;
		case '+':
			operation=(num1+num2);
			break;
		case '-':
			operation=(num1-num2);
			break;
		case '/':
		   operation=(num1/num2);
			break;
        }
        //Task 3
        System.out.println("Enter whether a sale has been made: Yes or No");
        String sale=input.next();
        int price=input.nextInt();
        int discount = 0;
        if (sale.equalsIgnoreCase("yes")) {
        	System.out.println("What is the price of the item?");
        	if (price<20) {
        		discount=10;
        	} else if (price>=20 && price<=100) {
        		discount=20;
        	} else if (price>=20 && price<=100) {
        		discount=30;
        	} else {
        		discount=50;
        	}
        } else {
        	System.out.println("You are not shopping");
        } int salePrice=(price*discount)/100;
          int totalPrice=(price-salePrice);
          
          System.out.println("After the discount of "+discount+" percent the price of the item reduces from "+price+" to "+totalPrice);
        	
	}

}
