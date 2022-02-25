package com.syntax.personalStudy;

public class Practice {

	public static void main(String[] args) {
		int n=5;
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
}	

}
