package com.hello;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Hello","Hi","world","wire");
		
		//using parallelStream
		//It will print an Unordered Manner
		System.out.print("Print the list in unordered manner:");
		list.parallelStream().forEach(x->System.out.print(x+","));
		
		//use forEachOrdered() to make it in ordered
		System.out.println();
		System.out.print("Print the list in ordered manner:");
		list.parallelStream().forEachOrdered(x->System.out.print(x+","));
	}
}
