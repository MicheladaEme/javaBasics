package com.syntax.class14;

public class StringDemo1 {

	public static void main(String[] args) {
	String name="shahima";//Always use this one it's shorter
	String name2=new String("shahima  ");
	
	System.out.println(name);
	System.out.println(name2);
	
	System.out.println(name.length());
	System.out.println(name2.length());
	
	System.out.println(name.toLowerCase());
	System.out.println(name2.toUpperCase());
	
	System.out.println(name+name2);//you should always prefer this method to perform concatenation
	System.out.println(name.concat(name2));
	
	System.out.println(name.isEmpty());
	

	}

}
