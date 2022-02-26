package com.syntax.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		String userName="Lilly";
		String password="Lilly123";
		
		if("Lilly".equals(userName) && "Lilly123".equals(password)) {
			System.out.println("Welcome Back");
		}else{
			System.out.println("Username or Password is not correct");
		}
		
		if("Lilly".equalsIgnoreCase(userName) && "Lilly123".equals(password)) {
			System.out.println("Welcome Back");
		}else{
			System.out.println("Username or Password is not correct");
		}

	}

}
