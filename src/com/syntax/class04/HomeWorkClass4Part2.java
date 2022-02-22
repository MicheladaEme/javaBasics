package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkClass4Part2 {
		public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 3 different numbers");
		int rock=input.nextInt();
		int paper=input.nextInt();
		int scissors=input.nextInt();
		if(rock>paper) {
			if(rock>scissors) {
				System.out.println(rock+" is the largest number");
			} else {
				System.out.println(scissors+" is the largest number");
			} 
		}else if (paper>rock) {
			if (paper>scissors) {
				System.out.println(paper+" is the largest number");
			} else {
				System.out.println(scissors+" is the largest number");
			}
			
		}

	}

}
