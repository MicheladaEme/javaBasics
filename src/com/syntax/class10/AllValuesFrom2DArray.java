package com.syntax.class10;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		int[][]numbers={
				
				{10,20,30,40}, //0
				
				{100,200,300,400},//1
				
				{1000,2000,3000,4000}//2
		};
		
		//nmbers.length -> gives# of rows
		int size=numbers.length; //when used with 2D array gives # of 1D Arrays that we stored
		
		System.out.println(size);//3
		
		int sizeOf1Array=numbers[0].length;
		System.out.println("Size of first array = "+sizeOf1Array);//4
		
		int sizeOf2Array=numbers[1].length;
		System.out.println("Size of second array = "+sizeOf2Array);
		
		int sizeOf3Array=numbers[2].length;
		System.out.println("Size of third array = "+sizeOf3Array);
		
		//Retrieving all elements from 2D array
		
		for(int i=0; i<numbers.length; i++) {
			
			for(int j=0; j<numbers[i].length; j++) {
				
				System.out.println(numbers[i][j]);
			}
		}

	}

}
