package com.syntax.class13;

public class MethodsDemo3 {

	//int we specify the datatype that method will return
	//squareTheNumber name of the method
	//(int number) parameter of the method
	//return tell java what to return from this method
	int squareTheNumber(int number) {
		return number*number;
	}
	
	int returnTheSameNumber(int number) {
		return number;
	}
	
	//create a method that takes a person name and an animal name
	//if person is "Teyfur" and if animal is "Horse" it returns us "camel"
	
	String TeyfurAndHorse(String personName,String animalName) {
		if("Teyfur".equalsIgnoreCase(personName) && "Horse".equalsIgnoreCase(animalName)) { 
			return "Camel";
		} else if ("Horse".equalsIgnoreCase(animalName)) {
			return "Horse";
		} else {
			return "Not Horse or Camel";
		}
	} 
	
	public static void main(String[] args) {

		MethodsDemo3 obj=new MethodsDemo3();
		obj.squareTheNumber(5);
		int result=obj.squareTheNumber(5);
		System.out.println(result);
		System.out.println(obj.TeyfurAndHorse("Teyfur","Horse"));
		System.out.println(obj.TeyfurAndHorse("Tameer","Horse"));
		System.out.println(obj.TeyfurAndHorse("Tameer","Monkey"));
	}

}
