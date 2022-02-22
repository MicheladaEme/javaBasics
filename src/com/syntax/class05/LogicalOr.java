package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		/* Or ||
		 * 
		 * True || True --> True
		 * True || False --> True
		 * False || True --> True
		 * False || False --> False
		 */
		
		String day="Monday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) {
			
			System.out.println("I have java class");
		}
		System.out.println("Code outside of if statement");
		
		/* let's ask user what is the day today
		 * 
		 * based on the day let's define which class we have
		 * 
		 * if(monday or friday) --> there is no class today
		 * else if (tuesday or wednesday) --> manual
		 * else if (thursday) --> review class
		 * else if (saturday or sunday) --> java class
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is the day today");
		String today=scan.next();
		if (today.equalsIgnoreCase("monday") || today.equalsIgnoreCase("friday")) {
			System.out.println("There is no class today");
		} else if (today.equalsIgnoreCase("tuesday") || today.equalsIgnoreCase("wednesday")) {
			System.out.println("We have manual class today");
		} else if (today.equalsIgnoreCase("thursday")) {
			System.out.println("We have review class today");
		} else if (today.equalsIgnoreCase("saturday") || today.equalsIgnoreCase("sunday")) {
			System.out.println("Today we have java class");
		}

	}

}
