package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		
		phoneTask pixel=new phoneTask();
		pixel.make="Google";
		pixel.model="Pixel 6";
		pixel.numOfCams=2;
		pixel.color="Stormy Black";
		pixel.screenSize=6.4;
		pixel.os="Android 12";
		pixel.takePictures();
		pixel.printCompleteInfo();

	}

}
