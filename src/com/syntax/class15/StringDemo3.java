package com.syntax.class15;

public class StringDemo3 {

	public static void main(String[] args) {
		String name="How Camelyou Camelguys Camel";
		System.out.println(name.indexOf("Camel"));
		System.out.println(name.indexOf("Horse"));//-1 for anything not found
		
		//advance we can ignore it for now
		System.out.println(name.indexOf("Camel", 14));
		//System.out.println(name.indexOf("@", 8+1));
		//System.out.println(name.indexOf("@", name.indexOf("@")+1));
		
		//System.out.println("name.lastIndexOf(\"@\") "+name.lastIndexOf("@"));
		//System.out.println("name.indexOf(\"@\") "+name.indexOf("@"));
		//System.out.println("name.indexOf(\"@\") "+name.indexOf("@",8));

	}

}