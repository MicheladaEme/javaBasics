package com.syntax.class15;

public class Task4 {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday -> yadnuS).
		
		String cat="Mariella";
		
		for(int i=cat.length()-1; i>=0; i--) {
			System.out.print(cat.charAt(i));
		} 
		
		System.out.println();
		
		System.out.println("-------Teacher Example---------");
		
		//Teachers Example
		
		String str="Sunday";
		String reversedStr="";
		for(int i=str.length()-1; i>=0; i--) {
			reversedStr=reversedStr+str.charAt(i);
		}
		System.out.println(reversedStr);

	}

}
