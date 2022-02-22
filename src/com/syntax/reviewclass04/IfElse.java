package com.syntax.reviewclass04;

public class IfElse {

	public static void main(String[] args) {
		
		String month="jan";
		int day=1;
		//"jan".equals(month)
		if(month.equals("jan")) {
			if(day==1) {
				System.out.println("It is the first of jan");
			} else {
				System.out.println("It is jan but not the first of jan");
			}
		} else {
			System.out.println("It is not jan");
		}
	 }
	
  } 

