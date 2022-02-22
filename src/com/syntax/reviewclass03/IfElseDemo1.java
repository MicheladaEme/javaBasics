package com.syntax.reviewclass03;

public class IfElseDemo1 {

	public static void main(String[] args) {
		
		String userName="Asghar";
		String passWord="pass123";
		//== can only be used with primitive
		if(userName.equals("Asghar") && passWord.equals("pass123")) {
			System.out.println("welcome back "+userName);
		} else {
			System.out.println("userName or password is not correct");
		}
				

	}

}
