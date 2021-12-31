package com.hello;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {

	public static void main(String[] args) {
		
		List<Float> list = new ArrayList<Float>();
		
		list.add(1.0f);
		list.add(2.0f);
		list.add(3.0f);
		
		System.out.println("Printing in forEach");
		
		//Method reference 
		list.forEach(System.out::println);
	}

}
