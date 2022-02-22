package com.syntax.groupproject02;

public class CodingTasks08 {

	public static void main(String[] args) {
		
		//Maximum and minimum number in the array?
		
        int[] number= {100, 134, 200, 167};
        int maximum = number[0];
        int minimum = number[0];
		
        for(int i=0; i<number.length; i++) {
			if(number[i]>maximum){
				maximum=number[i];
			} else if (number[i]<minimum) {
					minimum=number[i];
			}
		}  
        System.out.println("The largest number is "+maximum);
        System.out.println("The smallest number is "+minimum);

	}

}
