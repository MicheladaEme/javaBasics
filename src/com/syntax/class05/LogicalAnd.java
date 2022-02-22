package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		/* using Logical Operators (Test multiple conditions in 1 statement)
		 * AND && --> 
		 * True&&True -->True
		 * False&&True -->False
		 * True&&False -->False
		 * False&&False -->False
		 * 
		 * OR ||
		 * 
		 * NOT !
		 */
		
		boolean likeJava=true;
		boolean understandJava=true;
		
		if (likeJava&&understandJava) {
			System.out.println("This is the best combination");
		}
		System.out.println("End of code");
		
		//We want to compare 3 numbers
		/*
		 * if num1> num2 && num1> num3 -->num1 is the largest
		 * what if num2> num1 && num2> num3
		 * What if num3> num1 && num3>num2 --> num3 is the largest
		 */
		
		int num1=100;
		int num2=20;
		int num3=300;
		
		if (num1>num2 && num1>num3 ) {
			
			System.out.println(num1+" is the largest");
			
		} else if (num2>num1 && num2>num3 ) {
			
			System.out.println(num2+" is the largest");
			
		} else if (num3>num1 && num3>num2) {
			System.out.println(num3+" is the largest");
		}

	}

}
