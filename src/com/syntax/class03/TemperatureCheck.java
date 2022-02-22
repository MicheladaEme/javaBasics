package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		//Task 2
		int temperature=75;
		
		if (temperature<32) {
			System.out.println("Water will freeze with temperature "+temperature+".");
		} else {
			System.out.println("Water will NOT freeze with temperature "+temperature+".");
		}
		//Task 3
		int expectedHours=8;
		int actualHours=10;
		if (expectedHours>actualHours) {
			System.out.println("You will love the course and you will succeed");
		} else {
			System.out.println("Course will be very hard for you!.");
		}

	}

}
