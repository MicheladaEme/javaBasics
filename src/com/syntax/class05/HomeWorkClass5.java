package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkClass5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//Task 1
		System.out.println("Please enter your height in inches");
		int inch=input.nextInt();
		if (inch>72) {
			System.out.println("You are tall");
		} else if (inch>=60) {
			System.out.println("You are medium height");
		} else {
			System.out.println("You are short");
		}
		//Task 2
		System.out.println("What day is today?");
		int day=input.nextInt();
		if ((day==1) || (day==2) || (day==3) || (day==4) || (day==5)) {
			System.out.println("It is a weekday");
		} else if ((day==6) || (day==7)) {
			System.out.println("It is a weekend");
		}
	}
}
