package com.syntax.class13;

public class MethodsDemo2 {
	
	void TeyfurAndHorse(String animalName,String personName) {
		if("Teyfur".equals(personName) && "Horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is a camel");
		} else if("horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is a horse");
		}
		
	}
	
	public static void main (String[] args) {
		MethodsDemo2 obj=new MethodsDemo2();
		obj.TeyfurAndHorse("Horse", "Teyfur");
		obj.TeyfurAndHorse("Horse", "Tarik");
	}

}
