package com.syntax.personalStudy;

public class NestedLoopPattern {

	public static void main(String[] args) {
		
		//Right Sided Triangle
		//Part 1. Decreasing Space 
		//Part 2. Increasing Star
		
		int n=5;
		for(int i=1; i<=n; i++) { //Controls the Rows
			for(int j=i; j<=n; j++) { //inner loop controls the Columns
				System.out.print("  ");//same number of spaces
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		} 
		
		System.out.println("----------------------------");
		
		//Right Sided Triangle
		//Part 1. Increasing Space 
	    //Part 2. Decreasing Star
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("  ");//same number of spaces
			}
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		} 
		
		System.out.println("----------------------------");
		
		//Hill Pattern
		//Part 1. Decreasing Space
		//Part 2. Increasing Star
		//Part 3. Increasing Star
		
		for(int i=1; i<=n; i++) {
			for(int j=i;j<=n;j++) { //Decreasing Space
				System.out.print("  ");
			}
			for(int j=1; j<i; j++) { //Increasing Star
				System.out.print("* ");
			}
			for(int j=1; j<=i; j++) { //Increasing Star
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		//Reverse Hill Pattern
		//Part 1. Increasing Space
		//Part 2. Decreasing Star
		//Part 3. Decreasing Star
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) { //Increasing Space
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) { //Decreasing Star
				System.out.print("* ");
			}
			for(int j=i;j<=n;j++) { //Decreasing Star
				System.out.print("* ");
			}
			System.out.println();
		}
		
        System.out.println("----------------------------");
		
		//Diamond Pattern
		for(int i=1; i<n; i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			} 
			for(int j=1; j<i; j++) {
				System.out.print("* ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) { 
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) { 
				System.out.print("* ");
			}
			for(int j=i;j<=n;j++) { 
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
