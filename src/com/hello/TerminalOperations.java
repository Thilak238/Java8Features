package com.hello;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperations {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("Jayasuriya","Sangakkara","Atapattu","Vaas","Sangakkara");
		
		//convert the list to set which will remove duplicate elements from your list
		Set<String> set = list.stream().collect(Collectors.toSet());
		System.out.println("The set is:"+set);
		
		//forEach method
		list.stream().forEach(s->System.out.print(s+","));
	}
}
