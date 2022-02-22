package com.syntax.class10;

public class AllFrom2DArray {

	public static void main(String[] args) {
		
		String[][] food= {
				
				{"redbull", "burger", "steak", "fries"},
				
				{"curry", "biryani", "butter chicken"},
				
				{"noodles", "pad thai", "tom yum"},
				
				{"pizza", "pasta"},
		};
		
		System.out.println(" All values from 2D array using for each loop ");
		
		//outer loops over each array inside 2D Array
		for(String[] cousine :food) {
			
			//inner loop over each element from selected array
			for(String f:cousine) {
				
				System.out.print(f+" ");
			}
			System.out.println();
		}

		//iterates over every array/ row
		
		for(int row=0; row<food.length; row++) {
			
			//iterate over every column of specified row
			for(int col=0; col<food[row].length; col++) {
				
				//accessing elements
				System.out.println(food[row][col]);
			}
		}

	}

}
