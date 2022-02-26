package com.syntax.class15;

public class Task2 {

	public static void main(String[] args) {
		// 1.Write a program that reads two people's first names and if they expecting boy or girl? 
		//Based on the input suggests a name for a baby: 
		//Example Output:	
		//1.Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby name: DANRY
		//2.Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl? girl Suggested baby name: MAIEL	\
		
		String momName="MARY";
		String dadName="DANIEL";
		boolean boy = true;
		
		if(boy) {
			System.out.println(dadName.substring(0,3)+momName.substring(2,4));
		} else {
			System.out.println(momName.substring(0,2)+dadName.substring(3,6));
		}
		
		System.out.println("-------Teacher Example---------");
		//Teacher Example
		
		String father="Danilo";
		String mother="Mariam";
		String expectation="boy";
		String firstPart="";
		String secondPart="";
		
		if(expectation.equalsIgnoreCase("boy")) {
			firstPart=father.substring(0,father.length()/2);
			secondPart=mother.substring(mother.length()/2);
		} else if(expectation.equalsIgnoreCase("girl")) {
			firstPart=mother.substring(0,mother.length()/2);
			secondPart=father.substring(father.length()/2);
		}
		System.out.println(firstPart+secondPart);

				
				

	}

}
