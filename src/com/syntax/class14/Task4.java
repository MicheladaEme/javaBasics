package com.syntax.class14;

public class Task4 {
	/*/
	 * Create a method createEmail(). Based on values of users name, last name and email type
	 * Your method should return complete email ex. createEmail(John, Snow, gmail) johnsnow@gmail.com
	 */
	
	String createEmail(String userName, String lastName, String emailType) {
		return userName+lastName+"@"+emailType+".com";
	}

	public static void main(String[] args) {
		Task4 obj=new Task4();
		obj.createEmail("Emely", "Dominguez", "gmail");
		String email=obj.createEmail("Emely", "Dominguez", "gmail");
		System.out.println(email);
		//Alternate System.out.println(obj.createEmail("Emely", "Dominguez", "gmail"));

	}

}
