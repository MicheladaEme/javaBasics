package com.syntax.class02;

public class ArithmeticTask {

	public static void main(String[] args) {
		//Task Part 1
		double main=17;
		double secondary=25;
		String action="Multiplication";
		
		double sum=main*secondary;
		
		System.out.println("The "+action+" of 2 numbers "+main+" and "+secondary+" is equal to "+sum);
		//Task Part 2
		double num=3.9;
		
		double squareRoot=num*num;
		
		System.out.println("The square of the "+num+" is "+squareRoot);
		//Task Part 3
		/* Area of rectangle = A=wl
		 * Perimeter of rectangle = P=2(l+w)
		 */
		
		int width=5;
		int height=8;
		
		int perimeter=2*(width+height);
		int area=width*height;
		
		System.out.println("The perimeter of a rectangle with width "+width+" and "+height+" is equal to "+perimeter+" and the area is "+area);
		

	}

}
