package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country.
		 */
		String [] countries= {"USA", "Mexico", "Australia", "Bolivia"};
		String country=countries[0];
		String capital;
		switch (country) {
		case "USA":
			capital="Washington DC";
		     break;
		case "Mexico":
			capital="Mexico City";
		case "Australia":
			capital="Canberra";
			 break;
		case "Bolivia":
			capital="Sucre";
             break;
        default:
        	capital="Unknown";
		}
		System.out.println(capital +" is the capital of "+country);
		
		//Teacher Example
		String[] countries2= {"Poland", "Germany", "Ukraine", "Russia", "UK"};
		String capital2 = null;
		
		for(int i=0; i<countries2.length; i++) {
			switch (countries2[i]) {
			case "Poland":
				capital2="Warsaw";
			     break;
			case "Germany":
				capital2="Berlin";
			case "Ukraine":
				capital2="Kiev";
				 break;
			case "Russia":
				capital2="Moscow";
	             break;
			case "UK":
				capital2="London";
	             break;
			}
			System.out.println("The capital of the country "+countries2[i]+" is "+capital2);
		}
		
		System.out.println("---------Another Way---------");
		
		for(String country3:countries2) {
			if(country3.equals("Poland")) {
			    capital2="Warsaw";
			} else if (country3.equals("Germany")) {
				capital2="Berlin";
			} else if (country3.equals("Ukraine")) {
				capital2="Kiev";
			}else if (country3.equals("Russia")) {
				capital2="Moscow";
			}else if (country3.equals("UK")) {
				capital2="London";
			}
			System.out.println("The capital of the country "+country3+" is "+capital2);
		}
	}	
	
}

