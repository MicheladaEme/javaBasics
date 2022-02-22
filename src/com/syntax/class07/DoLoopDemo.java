package com.syntax.class07;

public class DoLoopDemo {

	public static void main(String[] args) {
		
		System.out.println("----While----");//Checks condition before execution More used than do while
		int num=6;
		
		while(num<=10) {
			System.out.println("Hello"); //5 times
			num++;
		}
		System.out.println(" -------DO WHILE------- "); //Checks condition after execution less used than while
		int num1=10;
		
		do {
			System.out.println("Hello");
			num1++;
		} while (num1<=3);

		System.out.println("I want to print numbers from 1 to 30");
		int num2=1;
		do {
			System.out.print(num2+" ");
			num2++;
		} while (num2<=30);
	}

}
