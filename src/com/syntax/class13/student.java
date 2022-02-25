package com.syntax.class13;

public class student {

	String name;
	String id;
	int age;
	char gender;
	double gpa;
	
	void study() {
		System.out.println(name+" is studying");
	}
	
	public static void main(String[] args) {
		
		student tarikobj=new student();
		tarikobj.name="tarik";
		tarikobj.study();

	}

}
