package com.hello;
import java.util.Optional;

//Program without Optional class
public class ExampleWoutOptional {
	
	public static void main(String[] args) {
		
		//Declaring an array directly with the values
		//Mentioned Integer array size as 7
		Integer[] i = new Integer[7];
		
		//Assigning a null to a number variable
		int number = i[6];
		
		//Trying to print the null value 
		System.out.println("The number is :"+number);
		}
}
