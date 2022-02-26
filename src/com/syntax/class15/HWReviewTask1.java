package com.syntax.class15;

public class HWReviewTask1 {

	public static void main(String[] args) {
		
		String userName="Asel";
		String password="pass123";
		String confirmedPassword="pass123";
		HWReviewTask1 task1=new HWReviewTask1();
		//task1.checkUserNamePassword(userName, password, confirmedPassword);
		
		
		if(userName.isEmpty()  || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else {
		
			if(password.length()<8) {
				System.out.println("Password is too short");
			}else {
				if(password.contains(userName)){
					System.out.println("Password cannot contain username");
				}else {
					if(password.equals(confirmedPassword)) {
						System.out.println("Your username and password has been created");
					}else {
						System.out.println("Passwords do not match”");
					}
				}
			}
			
		}

	}

}
