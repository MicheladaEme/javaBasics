package com.syntax.class06;

import java.util.Scanner;

public class ReplitHomeWork {

	public static void main(String[] args) {
		  Scanner input=new Scanner(System.in);
		  System.out.println("Enter the age of the Child");
		    int age=input.nextInt();
		    String ability;

		    switch (age) {
		      case 1:
		      ability="You can Crawl";
		      break;
		      case 2:
		      ability="You can Talk";
		      break;
		      case 3:
		      ability="You can Dance";
		      break;
		      case 4:
		      ability="You can get Trouble";
		      break;
		      default:
		      ability="I don't know how old you are";
		    } System.out.println(ability);
		  }
	}


