package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkClass5Part2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//Task 1
		System.out.println("Please enter a number");
		int number=input.nextInt();
		if ((number<=1000) && (number>=101)) {
			System.out.println("The number is large");
		} else if ((number>=11) && (number<=100)) {
			System.out.println("The number is medium");
		} else {
			System.out.println("The number is small");
		}
		//Task 2
		System.out.println("Please enter a the hour (use 24 hour format)");
		int hour=input.nextInt();
		if ((hour<=24) && (hour>=21)) {
			System.out.println("It is Night");
		} else if ((hour<=20) && (hour>=16)) {
			System.out.println("It is Evening");
		} else if ((hour<=15) && (hour>=12)) {
			System.out.println("It is Afternoon");
		} else {
			System.out.println("It is Morning");
		}
		//Task 3
		System.out.println("Please enter your quiz score");
		int quiz=input.nextInt();
		System.out.println("Please enter your mid term score");
		int mid=input.nextInt();
		System.out.println("Please enter your final score");
		int finalScore=input.nextInt();
		int total=((quiz+mid+finalScore)/3);
		if (total>=90) {
			System.out.println("Your overall grade is A");
		} else if ((total>=70) && (total<90)) {
			System.out.println("Your overall grade is B");
		} else if (((total)>=50) && ((total)<70)) {
			System.out.println("Your overall grade is C");
		} else {
			System.out.println("Your overall grade is F");
		}
		//Task 4
		System.out.println("Please enter your birth month");
		String month=input.next();
		if (month.equalsIgnoreCase("March")|| month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May")) {
			System.out.println("Your birthday is in the Spring");
		} else if ((month.equalsIgnoreCase("June")|| month.equalsIgnoreCase("July")|| month.equalsIgnoreCase("August"))) {
			System.out.println("Your birthday is in the Summer");
		} else if ((month.equalsIgnoreCase("September")|| month.equalsIgnoreCase("October")|| month.equalsIgnoreCase("November"))) {
			System.out.println("Your birthday is in the Fall");
		} else if ((month.equalsIgnoreCase("December")|| month.equalsIgnoreCase("January")|| month.equalsIgnoreCase("February"))) {
			System.out.println("Your birthday is in the Winter");
		}
	}
}
