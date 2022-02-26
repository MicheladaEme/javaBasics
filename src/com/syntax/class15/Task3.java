package com.syntax.class15;

public class Task3 {

	public static void main(String[] args) {
		//1.Create a String and if the String is not empty perform the following:
		//if the String has an odd number of characters and has 3 or more characters, 
		//print the character in the middle of the String.

		String potato="potatos";
		
		if(!(potato.length()%2==0) && potato.length()>=3) {
			System.out.println(potato.charAt(potato.length()/2));
		}
	}

}
