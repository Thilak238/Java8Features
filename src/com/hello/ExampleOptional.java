package com.hello;
import java.util.Optional;

//Program with Optional class
public class ExampleOptional {

	public static void main(String[] args) {
		
		//Declaring an array directly with the values
		//Mentioned Integer array size as 7
		Integer[] i = new Integer[7];
		
		//Declare optional for an array
		Optional<Integer> optionalInteger = Optional.ofNullable(i[6]);
		
		//checking whether value is present in the specified index or not
		if(optionalInteger.isPresent()) {
			System.out.println("The number is:"+i[6]);
		}
		else {
			System.out.println("Value is not present in the specified index");
		}
	}
}
