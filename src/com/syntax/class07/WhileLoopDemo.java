package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		int i=1;
		while (i<=5) {
			System.out.println(i);
			i++;
		} System.out.println("The Value of i outside of while loop = "+i);
		
		// I need to print values from 2 to 20
		
		int a=2;
		while (a<=20) {
			System.out.println(a);
			a++;
		} //I need to print values from 1 to 50 all in 1 line
		
		int b=1;
		while(b<=50) {
			System.out.print(b+" ");
			b++;
		} System.out.println("--- I NEED NUMBERS FROM 20 TO 1 ---");
		
		int c=20;
		
		while (c>=1) {
			System.out.print(c+" ");
			c--;
		}
		System.out.println("The End");
		
		//TASK
		System.out.println("  Print Only Even Numbers from 1 to 30  ");
		int d=2;
		
		while (d<=30) {
			System.out.print(d+" ");
			d+=2;// same as d=d+2
		}
		/* Alternative Code
		 * int num=1;
		 * while (num<=30) {
			num++;
			if (num%2<=0) {
				System.out.print(num+" ");
			  }
			}
		 */
		System.out.println("another way to print even numbers from 1 to 30");
		
		int e=1;
		
		while (e<=30) {
			if (e%2==0) {
			System.out.print(e+" ");
			} 
			e++;
		}
		
	}

}
