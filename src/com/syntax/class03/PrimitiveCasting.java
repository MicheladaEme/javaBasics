package com.syntax.class03;

public class PrimitiveCasting {

	// main+ctrl=space
	// ctrl+space --> autocomplete
	
	public static void main(String[] args) {
		
		int i=10;
		
		//widening or implicit
		//we store int value 10 inside double variable
		double d=10;
		System.out.println(i);//10
		System.out.println(d);//10.0
		
		//int num=10.0; //Type mismatch: cannot convert from double to int
		
		//narrowing or explicit casting
		int num=(int)10.99;
		System.out.println(num);
	}
		

	

}
