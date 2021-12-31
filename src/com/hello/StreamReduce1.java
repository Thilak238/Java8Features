package com.hello;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce1 {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//finding Sum of all elements in a list
		Optional<Integer> totalSum  = list.stream().reduce((ele1, ele2) -> ele1 + ele2);
		
		//printing the sum
		System.out.print("The sum of all elements in a list:");
		totalSum.ifPresent(System.out::println);
		
		//find the product of even numbers in a list
		Optional<Integer> even = list.stream()
								 .filter(x->x%2==0)
								 .reduce((num1,num2)->num1*num2);
		
		System.out.print("The product of even numbers is:");
		even.ifPresent(System.out::println);
	}
}
