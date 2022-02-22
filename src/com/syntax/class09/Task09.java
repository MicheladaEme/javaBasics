package com.syntax.class09;

public class Task09 {

	public static void main(String[] args) {
		
		//Task 1
		char[] grades= {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		
		char[] grades2=new char[6];
		grades2[0]='A';
		grades2[1]='B';
		grades2[2]='C';
		grades2[3]='D';
		grades2[4]='E';
		grades2[5]='F';
		
		System.out.println(grades2[1]);
		
		//Task 2
		String[] group12= {"Emely","Tarik","Nazgul","Nassir","Yasmin","Zohra","Idris","Ali"};
		System.out.println(group12[0]);
		
		String[] groupTwelve=new String[8];
		groupTwelve[0]="Emely";
		groupTwelve[1]="Tarik";
		groupTwelve[2]="Nazgul";
		groupTwelve[3]="Nassir";
		groupTwelve[4]="Yasmin";
		groupTwelve[5]="Zohra";
		groupTwelve[6]="Idris";
		groupTwelve[7]="Ali";
		System.out.println(groupTwelve[0]);
		
		//Task 3
		String[] syntax= {"Java","Saturday","day","coding","is"};
		System.out.println(syntax[1]+" "+syntax[4]+" "+syntax[0]+" "+syntax[3]+" "+syntax[2]);

	}

}
