package com.syntax.class09;

public class ReCap {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			System.out.println("A");
			//break;
			System.out.println("B");
		}
		
		System.out.println("-------------------------------------");
		
		for(int i=1; i<=3; i++) {//outer loop controls number of iteration of inner loop
			
			for(int j=1; j<=3; j++) {//inner loops always depends on outer
				System.out.println("Hello");
				break;
			}
			System.out.println("Good Morning");
			break;
		}
		
		System.out.println("------------------------------------------------------------------");
	
		for(int i=1; i<=3; i++) {//outer loop controls number of iteration of inner loop
			
			for(int j=1; j<=3; j++) {//inner loops always depends on outer
				System.out.println("Hello");
				break;
			}
			System.out.println("Good Morning");
		}
		
		System.out.println("------------------------------------------------------------------");
		
		for(int i=1; i<=3; i++) {//outer loop controls number of iteration of inner loop
			
			for(int j=1; j<=3; j++) {//inner loops always depends on outer
				System.out.println("Hello");
				break;
			}
			System.out.println("Good Morning");
			break;
		}
		
System.out.println("------------------------------------------------------------------");
		
		for(int i=0; i<=2; i++) {
			
			for(int j=1; j<=2; j++) {
				
				if(j==2) {
					continue;
				}
				System.out.println("Good Morning");	
			}
			
			System.out.println("Hello");
			
		}

	}

}
