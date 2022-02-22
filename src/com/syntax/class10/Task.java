package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		
		//create an array and retrieve all elements in reverse order
		
		int[] task= {12,26,34,47};
		
		for(int i=3; i>=0; i--) {
			System.out.print(task[i]+" ");
		}
		
		//Teacher Example
		
		int[] arr= {10, 20, 30, 40, 50, 60};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[5]);
		}
		
		System.out.println(" Another Way ");
		
		int[] arrs= {45, 23, 15, 30};
		
		for(int i=0; i<arrs.length; i++) {
			System.out.println(arrs.length-i-1);
		}

	}

}
