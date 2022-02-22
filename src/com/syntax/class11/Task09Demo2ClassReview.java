package com.syntax.class11;

import java.util.Arrays;

public class Task09Demo2ClassReview {

	public static void main(String[] args) {
		
		int[] arr= {10,20,90,50,70};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[arr.length-2]);
	}

}
