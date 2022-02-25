package com.syntax.class13;

public class MethodsDemo4 {

	//create a method that takes a boolean isSaleOn double price
	//if isSale On=true return discounted price other wise return original price
	
	double discount(boolean isSaleOn, double price, double discount) {
		if(isSaleOn) {
			return price-(price*discount);
		} else {
			return price;
		}
	}
	
	public static void main(String[] args) {
		 
		MethodsDemo4 obj=new MethodsDemo4();
		System.out.println(obj.discount(false, 100, .15));
		System.out.println(obj.discount(true, 100, .15));

	}

}
