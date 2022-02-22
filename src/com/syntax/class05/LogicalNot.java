package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		// Logical not is used to revert the condition
		
		boolean value=!false;
		
		System.out.println(value);
		
		boolean traffic=false;
		
		if (!traffic) {
			
			System.out.println("I will come on time to work");
		} 
		
		String day="Saturday";
		
		if (!day.equals("Saturday")) {
			System.out.println("Today is not Saturday");
		}
		System.out.println("---------------------THE END--------------------");

	}

}
