package com.syntax.class09;

public class HW09 {

	public static void main(String[] args) {
		//Task 1
		String[] cars= {"BMW", "Maserati", "Toyota", "Nissan", "Ford", "Honda"};
		for(String car:cars) {
			System.out.print(car+" ");
		}
		System.out.println("------Task 1------");
		for(int vehicle=0; vehicle<cars.length; vehicle++) {
			System.out.print(cars[vehicle]+" ");
		} System.out.println("------Task 1------");
		//Task 2
		String[] animals= {"Tiger", "Cougar", "Panther", "Lion", "Puma"};
		for(String bigCat:animals) {
			System.out.print(bigCat+" ");
		}
		System.out.println("------Task 2------");
		for(int cats=0; cats<animals.length; cats++) {
			System.out.print(animals[cats]+" ");
		} System.out.println("------Task 2------");
		//Task 3
		System.out.println("------Task 3------");
		int[] num= {13, 17, 34, 8};
		int sum=0;
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
		} System.out.println(sum);

		//Task 4
		System.out.println("------Task 4------");
		int[] bigNum= {67, 48, 34};
		
          if (bigNum[0]>bigNum[1] && bigNum[0]>bigNum[2] ) {
			
			System.out.println(bigNum[0]+" is the largest");
			
		} else if (bigNum[1]>bigNum[0] && bigNum[1]>bigNum[2] ) {
			
			System.out.println(bigNum[1]+" is the largest");
			
		} else if (bigNum[2]>bigNum[0] && bigNum[2]>bigNum[1]) {
			System.out.println(bigNum[2]+" is the largest");
		}

	}

}
