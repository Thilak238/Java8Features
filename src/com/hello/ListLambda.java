package com.hello;

import java.util.ArrayList;
import java.util.List;

public class ListLambda {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			List<Integer> list = new ArrayList<Integer>();
			list.add(100);
			list.add(200);
			list.add(300);
			
			System.out.println("Printing using forEach including lambda expression");
			
			//Print using forEach loop with lambda Expression
			list.forEach((s) -> System.out.println(s));
		}
}