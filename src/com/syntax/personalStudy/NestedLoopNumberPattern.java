package com.syntax.personalStudy;

public class NestedLoopNumberPattern {

	public static void main(String[] args) {
		//Increasing Triangle
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i; j++) {
				System.out.print("* "); 
			}
			System.out.println();
		}
		
		System.out.println("------------");
		
		//Decreasing Triangle
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("------------");
		//Number Pattern Program example 1
		for(int i=1,p=1; i<=n; i++,p++) {
			for(int j=1;j<=i; j++) {
				System.out.print(p+" "); //System.out.print(i+" "); will work but can become complex
			}
			System.out.println();
		}
		
		System.out.println("------------");
		//Number Pattern Program example 2
		for(int i=1,p=5; i<=n; i++,p--) {
			for(int j=1;j<=i; j++) {
				System.out.print(p+" "); //System.out.print(i+" "); will work but can become complex
			}
			System.out.println();
		}
		
		System.out.println("------------");
		
		//1.Pattern: Increasing Triangle
		//2.Number: Incrementing Columns
		for(int i=1; i<=n; i++) {
			int p=1;
			for(int j=1; j<=i; j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}
		
		System.out.println("------------");
		//1.Pattern: Decreasing Triangle
		//2.Number: Decrementing Columns
		for(int i=1, k=n; i<=n; i++, k--) {
			int p=5;
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print(p-- +" ");
			}
			System.out.println();
		}
		

	}

}
