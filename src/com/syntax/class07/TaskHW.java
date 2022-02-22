package com.syntax.class07;

public class TaskHW {

	public static void main(String[] args) {
		//Task 1 - "Print numbers from 1 to 100 in 1 line with space"
		System.out.println("Print numbers from 1 to 100 in 1 line with space");
		for(int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}
		//Task 2 - "Print numbers from 100 to 1"
		System.out.println("Print numbers from 100 to 1");
		for(int b=100; b>=1; b--) {
			System.out.println(b);
		}
		//Task 3 - "Print even numbers from 20 to 1"
		//Method 1
		System.out.println("Print even numbers from 20 to 1");
		for(int c=20; c>=1; c-=2) {
			if(c%2==0) {
				System.out.println(c);
			}
		} //Method 2
		System.out.println("Print even numbers from 20 to 1 - Method 2");
		for(int d=20; d>1; d-=2) {
			System.out.println(d);
		}
		//Task 4 - "Print only odd numbers from 20 to 50"
		System.out.println("Print only odd numbers from 20 to 50");
		for(int e=20; e<=50; e++) {
			if(e%2!=0) {
			System.out.println(e);
			}
		} //Method 2
		System.out.println("Print only odd numbers from 20 to 50 - Method 2");
		for(int f=21; f<50; f+=2) {
			System.out.println(f);
		}
	}

}
