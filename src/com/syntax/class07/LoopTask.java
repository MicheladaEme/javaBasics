package com.syntax.class07;

public class LoopTask {

	public static void main(String[] args) {
		//Task 1
		System.out.println("Print numbers from 1 to 100 in 1 line with space");
		int tO=1;
		while (tO<=100) {
			System.out.print(tO+" ");
			tO+=1;
		} //Task 2
		System.out.println("Print numbers from 100 to 1");
		int tT=100;
		while (tT>=1) {
			System.out.print(tT+" ");
			tT-=1;
		} //Task 3
		System.out.println("Print even numbers from 20 to 100");
		int tTh=20;
		while (tTh<=100) {
				if (tTh%2==0) {
					System.out.print(tTh+" ");
			} tTh+=1;
		} //Task 4
		System.out.println("Print only odd numbers from 100 to 1");
		int tF=100;
		while (tF>=1) {
				if (tF%2!=0) {
					System.out.print(tF+" ");
			} tF-=1;
		}
	}

}
