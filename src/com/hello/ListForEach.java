package com.hello;

import java.util.ArrayList;
import java.util.List;

public class ListForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("Dravid");
		list.add("Sachin");
		list.add("Ganguly");
		
		//Using for loop
		System.out.println("Printing a list using for loop");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+",");
		}
		//To include a new line	
		System.out.println();
		
		//Using forEach loop
		System.out.println("Printing a list using foreach loop");
		for(String s : list) {
			System.out.print(s+",");
		}
	

	}

}
