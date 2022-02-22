package com.syntax.groupproject02;

public class CodingTasks07 {

	public static void main(String[] args) {
		
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		int firstNum=0;
		int secondNum=1;
		
		for(int i=0; i<=10; i++) {
			
			System.out.print(firstNum+", ");
			int nextNum = firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;
		} 
		//can't figure out how to get rid of extra one :(
		

	}

}
