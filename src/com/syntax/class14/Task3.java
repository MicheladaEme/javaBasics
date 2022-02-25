package com.syntax.class14;

public class Task3 {
	//Create a method that will say Hello in different language 
	//based on the country that will passed when method is executed
	
	String sayHello(String country) {
		switch (country) {
		case "Mexico":
			return "Hola";
		case "France":
			return "Bonjour";
		case "USA":
		    return "Hello";
		default:
			return "I don't know";
		}
	}

	public static void main(String[] args) {
		
		Task3 object=new Task3();
		object.sayHello("Mexico");
		String country=object.sayHello("Mexico");
		System.out.println(country);

	}

}
