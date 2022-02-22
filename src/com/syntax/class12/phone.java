package com.syntax.class12;

public class phone {
	String make;
	String model;
	int numOfCams;
	String color;
	double screenSize;
	String os;
	
	void makeCalls() {
		System.out.println("Making a call");
	}
	void takePictures() {
		System.out.println("Taking pictures");
	}
	void printCompleteInfo() {
		System.out.println("Make "+make);
		System.out.println("Model "+model);
		System.out.println("numOfCams "+numOfCams);
		System.out.println("Color "+color);
		System.out.println("ScreenSize"+screenSize);
		System.out.println("OS "+os);
	}

	public static void main(String[] args) {
		//Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Nokia with specific attributes and behaviors.
		
		phone iPhone=new phone();
		iPhone.make="Apple";
		iPhone.model="iPhone 13";
		iPhone.numOfCams=3;
		iPhone.color="Space Gray";
		iPhone.screenSize=6.06;
		iPhone.os="IOS";
		iPhone.makeCalls();
		iPhone.takePictures();
		iPhone.printCompleteInfo();
		
		phone pixel=new phone();
		pixel.make="Google";
		pixel.model="Pixel 6";
		pixel.numOfCams=2;
		pixel.color="Stormy Black";
		pixel.screenSize=6.4;
		pixel.os="Android 12";
		
		phone nokia=new phone();
		nokia.make="Nokia";
		nokia.model="Nokia 5.4";
		nokia.numOfCams=2;
		nokia.color="Polar Night";
		nokia.screenSize=6.39;
		nokia.os="Android 10";

	}

}
