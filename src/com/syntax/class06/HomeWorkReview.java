package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkReview {

	public static void main(String[] args) {
		//Logical Operators: AND, OR, NOT
		//HW Review - Clean up code
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		
		int quiz=input.nextInt();
		
		System.out.println("Please enter your mid term score");
		
		int mid=input.nextInt();
		
		System.out.println("Please enter your final score");
		
		int finalScore=input.nextInt();
		
		char grade;
		
		int total=((quiz+mid+finalScore)/3);
		
		if (total>=90) {
			grade='A';
		} else if ((total>=70) && (total<90)) {
			grade='B';
		} else if (((total)>=50) && ((total)<70)) {
			grade='C';
		} else {
			grade='F';
		}
		System.out.println("Your grade is "+grade);
		
		// If your grade us A or B --> you are a good student
		// Otherwise --> you should study more
		
		if(grade=='A' || grade=='B') {
			System.out.println("You are a great student");
		} else {
			System.out.println("You should study more");
		}

	}

}
