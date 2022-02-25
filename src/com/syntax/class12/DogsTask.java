package com.syntax.class12;

public class DogsTask {
	
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	
	void nap() {
		System.out.println("Doggo is taking a nap");
	}
	
	public static void main(String[] args) {
		/*
		 * Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador
		 * with specific attributes and behaviors.
		 */
		
		DogsTask Dog1=new DogsTask();
		Dog1.name="Bear";
		Dog1.color="White and Black";
		Dog1.breed="Husky";
		Dog1.gender='f';
		Dog1.age=6;
		Dog1.weight=45;
		
		DogsTask Dog2=new DogsTask();
		Dog2.name="Spike";
		Dog2.color="Brown";
		Dog2.breed="Bulldog";
		Dog2.gender='m';
		Dog2.age=4;
		Dog2.weight=54;
		
		DogsTask Dog3=new DogsTask();
		Dog3.name="Pumpkin";
		Dog3.color="Blonde";
		Dog3.breed="Labrador";
		Dog3.gender='f';
		Dog3.age=2;
		Dog3.weight=65;

	}

}
