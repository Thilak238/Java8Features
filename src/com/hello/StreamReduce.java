package com.hello;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("HCL","IBM","KGISL","TCS");
		
		//Find the word which has maximum length
		//reduce() takes 2 strings and returns the longer string.
		//return type reduce method is optional bacause the list on which reduce() is called may be empty.
		Optional<String> result = list.stream()
								  .reduce((word1,word2) 
										  -> word1.length() > word2.length() 
										  ? word1 : word2);
		
		//method 1 to print result
		if(result.isPresent()){
			System.out.println("The longest string in the list is :"+result.get());
		}
		
		System.out.print("The longest string in the list is:");
		//method 2 to print result
		result.ifPresent(System.out::println);
	}

}
