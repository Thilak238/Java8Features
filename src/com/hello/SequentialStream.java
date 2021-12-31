package com.hello;

import java.util.Arrays;
import java.util.List;

public class SequentialStream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Hello","Hi","world","wire");
		
		//We are using sequential stream
		//it will print one by one
		//Starts from index 0
		list.stream().forEach(s->System.out.print(s+","));
	}
}
