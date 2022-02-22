package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		int age=20;
		int weight=130;
		
		if (age<=18) {
			System.out.println("Cannot Donate Blood");
		} else 
			System.out.println("Can Donate Blood");
		if (weight<110) {
			System.out.println("We cannot accept such a patient");
		} else {
			System.out.println("You are eligable");
		}
		
		/*
		 * Task Alternative Example
		 * 
		 * int age=20;
		 * int weight=100;
		 * 
		 * if (age>=18) {
		 * System.out.println("You are eligible");
		 * if (Weight>110) {
		 * System.out.println("You are eligible to donate");
		 * } else{
		 * System.out.println("Cannot accept patient");
		 * } 
		 * } else {
		 * System.out.println("You are not eligible");
		 * }
		 */
		
		

	}

}
