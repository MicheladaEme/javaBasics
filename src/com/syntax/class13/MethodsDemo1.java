package com.syntax.class13;

import java.util.Scanner;

public class MethodsDemo1 {

	//void is a type of method that don't return anything when called
	//checkEvenOdd is the name of the method
	//() we use to pass information from outside
	//int number this is a parameter that we can pass to this method when called
	//we can use this variable inside the logic of the method
	void checkEvenOdd(int number) {
		if(number%2==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
	
	void checkWeather(boolean isRaining) {
		if(isRaining) {
			System.out.println("I am staying home");
		} else {
			System.out.println("lets go for a walk");
		}
	}
	
	void checkName(String name) {
		if(name.equals("teyfur")) {
			System.out.println("Send memes");
		}else if(name.equals("Maha")){
			System.out.println("I am a doctor");
		} else {
			System.out.println("I don't know you");
		}
	}
	
	public static void main(String[] args) {
		
		MethodsDemo1 object=new MethodsDemo1();
		object.checkEvenOdd(120);
		object.checkEvenOdd(3);
		object.checkEvenOdd(7);
		object.checkWeather(false);
		object.checkName("teyfur");
		
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		//int number 2=Object1.CheckEvenOdd(120);
	}
}
