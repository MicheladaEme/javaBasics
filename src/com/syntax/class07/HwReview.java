package com.syntax.class07;

import java.util.Scanner;

public class HwReview {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter value for sale: yes or no
		 * if there is no sale --> you are not going for shopping if there is sale ask your user price of the item
		 * 
		 * Based on the price you have to calculate the price of the item after the discount
		 * 
		 * If price is less than $20 --> apply 10 discount 
		 * if price is between $20 & $100 --> 20 discount
		 * if price is between $100 & $00 --> 30 discount
		 * Otherwise apply 50%% discount
		 * 
		 * Output of the program should be:
		 * After discount _ the price of the item reduce from _ to _
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter value for sale");
		String sale = input.next();
		if (sale.equalsIgnoreCase("no")) {
			System.out.println("you are not going for shopping");
		} else if (sale.equalsIgnoreCase("yes")){
			System.out.println("what is the price of the item?");
			int actualPrice = input.nextInt();
			int discount = 0;
			if (actualPrice < 20) {
				discount = 10;
			} else if (actualPrice >= 20 && actualPrice <= 100) {
				discount = 20;
			} else if (actualPrice >= 100 && actualPrice <= 500) {
				discount = 30;
			} else {
				discount = 50;
			}
			int saving = (actualPrice * discount) / 100;
			int finalPrice = actualPrice - saving;
			System.out.println("After " + discount + "% discount the price of the item reduce from " + actualPrice
					+ " to " + finalPrice);
		}

	}

}
