package com.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntermediateOperations {

	public static void main(String[] args) {
	
		//creating a list of Integers
		List<Integer> list = Arrays.asList(2,3,4,5,6);
		
		//Map method
		List<Integer> cubeList = list.stream()
								 .map(cube -> cube*cube*cube)
								 .toList();
		System.out.println("The cube List is :"+cubeList);
		
		//creating a list of Strings
		List<String> wordList = Arrays.asList("Gilchrist","Hayden","Andrew Symonds","Mitchell Johnson");
		
		//Filter Method
		List<String> filterList = wordList.stream()
									   .filter(s->s.startsWith("H"))
									   .toList();
		System.out.println("The filtered list is :"+filterList);
		
		//Sort Method
		List<String> sortedList = wordList.stream().sorted().toList();
		System.out.println("The Sorted list is :"+sortedList);
	}
}
