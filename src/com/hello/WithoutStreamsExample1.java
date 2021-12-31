package com.hello;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product {
	String name;
	String city;
	int price;
	
	public Product(String name, String city, int price) {
		super();
		this.name = name;
		this.city = city;
		this.price = price;
	}
}

public class WithoutStreamsExample1 {

	public static void main(String[] args) {
		
		List<Product> product = new ArrayList<Product>();
		product.add(new Product("Sony", "Bangalore", 52000));
		product.add(new Product("Samsung", "Pune", 36000));
		product.add(new Product("LG", "Mumbai", 15000));
		
		//filtering without Stream
		List<Integer> list = new ArrayList<Integer>();
		for(Product n : product) {
			if(n.price < 20000) {
				list.add(n.price);
			}
		}
		System.out.println(list);
	}
}
