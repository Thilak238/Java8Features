package com.hello;

import java.util.ArrayList;
import java.util.List;

public class Specs {

	public static void main(String[] args) {
		
		//Array
		int[] numbers = {10,20,30,40,50};
		
		//for loop to print an array
		System.out.println("Printing an array using for loop:");
	
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]);
			System.out.print(",");
		}	
		System.out.println();
		
		//for each loop
		//Need not to have a condition
		System.out.println("Printing an array using for-each loop");
		
		for(int x : numbers) {
			System.out.print(x);
			System.out.print(",");
		}
	}
}
